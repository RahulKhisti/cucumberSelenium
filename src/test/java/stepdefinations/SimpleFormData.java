package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFormData {

@Given("user is at home page of a website")
    public void user_is_at_home_page_of_a_website () {


}


    @When("user clicks on input Forms tab")
    public void userClicksOnInputFormsTab() {

    }

    @And("user enters text {string} in EnterMessage Box")
    public void userEntersTextInEnterMessageBox(String arg0) {
    }

    @And("User clicks on Show Message")
    public void userClicksOnShowMessage() {
    }

    @Then("Entered text Should be displayed")
    public void enteredTextShouldBeDisplayed() {
    }

    @And("user enters Text in EnterMessage Box")
    public void userEntersTextInEnterMessageBox(DataTable dt) {
    dt.asList().get(0);
    }
}
