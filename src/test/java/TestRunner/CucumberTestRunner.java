package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags ="",features= {"src/test/resources/Features"},
glue= {"StepDefinictions"},
plugin= {"pretty","html:target/htmlreport.html"})


public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
