package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SimpleFormDemoPage;
import util.TestBase;

public class SimpleFormData  {

    SimpleFormDemoPage simpleFormDemoPage;


    @Given("user is at home page of a website")
        public void user_is_at_home_page_of_a_website () {
        TestBase.initialize("url");
    }
    @When("user enters text {string} in EnterMessage Box")
    public void userEntersTextInEnterMessageBox(String message) {
        simpleFormDemoPage = new SimpleFormDemoPage();
        simpleFormDemoPage.enter_Message(message);
    }

    @And("User clicks on Show Message")
    public void userClicksOnShowMessage() {
        simpleFormDemoPage.click_Show_Message_Button();
    }

    @Then("Entered text {string} Should be displayed")
    public void enteredTextShouldBeDisplayed(String expectedMessage) {
        Assert.assertEquals(expectedMessage, simpleFormDemoPage.get_Displayed_Message());
    }



    @Then("Close the browser")
    public void closeTheBrowser() {
        simpleFormDemoPage.closeBrowser();
    }
}
