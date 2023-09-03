package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Login", features = {"src/test/resources/features"}, glue =  {"steps_definition"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
