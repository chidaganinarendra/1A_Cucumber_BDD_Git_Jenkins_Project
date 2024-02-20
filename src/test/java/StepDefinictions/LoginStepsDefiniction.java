package StepDefinictions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefiniction {
	
	WebDriver driver;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login?from=%2F");
	    
	}

	@When("User enter the Vaild Username and Password")
	public void user_enter_the_vaild_username_and_password() throws InterruptedException {
	    driver.findElement(By.name("j_username")).sendKeys("Admin");
	    driver.findElement(By.name("j_password")).sendKeys("Nari@1234");
	    Thread.sleep(3000);
	    
	}

	@And("Click on Login button")
	public void click_on_login_button() {
	    
		driver.findElement(By.name("Submit")).click();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		Assert.assertTrue(driver.findElements(By.linkText("Dashboard")).size()>0,"User is navigated to Home page");
		Thread.sleep(3000);
	}

	@And("Close The Browser")
	public void close_the_browser() {
		
	   driver.close();
	}
}