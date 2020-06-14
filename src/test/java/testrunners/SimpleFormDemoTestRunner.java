package testrunners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/git/cucumberSelenium/src/test/java/features/simpleFormDemo.feature",
        glue= "stepdefinations"
)


public class SimpleFormDemoTestRunner {



}
