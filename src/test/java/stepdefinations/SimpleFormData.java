package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SimpleFormDemo;
import util.TestBase;

public class SimpleFormData  {
    SimpleFormDemo sd;
    @Given("user is at home page of a website")
        public void user_is_at_home_page_of_a_website () {
        TestBase.initialize();
    }
    @When("user enters text {string} in EnterMessage Box")
    public void userEntersTextInEnterMessageBox(String message) {
        sd= new SimpleFormDemo();
        sd.enter_Message(message);
    }

    @And("User clicks on Show Message")
    public void userClicksOnShowMessage() {
        sd.click_Show_Message_Button();
    }

    @Then("Entered text {string} Should be displayed")
    public void enteredTextShouldBeDisplayed(String expectedMessage) {
        Assert.assertEquals(expectedMessage,sd.get_Displayed_Message());
    }


}
