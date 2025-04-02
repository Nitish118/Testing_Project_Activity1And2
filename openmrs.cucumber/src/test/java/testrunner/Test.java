package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features="Features/MyTest.feature",
   monochrome=true,
   glue={"stepdefinition","NewHook"},
   //tags= {@tags1}
   
plugin= {"pretty","html:target/html-cucumber","json:target/cucumber.json"}
)



public class Test {

}