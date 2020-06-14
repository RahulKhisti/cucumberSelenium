package TestRunners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/Rahul/IdeaProjects/cucumberSelenium/src/main/java/features/inputForms.feature",
        glue= "stepDefinations"
)


public class InputFormsTestRunner {



}
