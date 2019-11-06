package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepsShrimps"},
        features = "src/test/java/featuresShrimps",
        plugin = {"pretty", "json:target/cucumber-json-report.json"},
        monochrome = true,
        tags = {"@wip"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {


}
