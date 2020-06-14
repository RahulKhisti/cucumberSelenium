package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/git/cucumberSelenium/src/test/java/features/basicCheckBoxDemo.feature",
        glue= "stepdefinations",
        plugin= {"pretty","html:test-output"},
        dryRun = false,
        strict = true,
        monochrome = true
)
public class BasicCheckBoxDemoTestRunner {
}
