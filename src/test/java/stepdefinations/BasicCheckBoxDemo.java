package stepdefinations;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.BasicCheckBoxDemoPage;
import util.TestBase;

public class BasicCheckBoxDemo extends TestBase {

    BasicCheckBoxDemoPage basicCheckBoxDemoPage;
    @Given("user should be at basicCheckBoxDemo page of a website")
    public void userShouldBeAtBasicCheckBoxDemoPageOfAWebsite() {
        TestBase.initialize("url1");
    }

    @When("user enters clicks on optionone checkBox")
    public void userEntersClicksOnOptionCheckBox() {
        basicCheckBoxDemoPage=new BasicCheckBoxDemoPage();
        basicCheckBoxDemoPage.clickOnOption1();
    }

    @And("User clicks on CheckAll button")
    public void userClicksOnCheckAllButton() {
        basicCheckBoxDemoPage.setCheckAll();
    }

    @Then("All the check BoxexShould be checked")
    public void allTheCheckBoxexShouldBeChecked() {
        Assert.assertEquals(true,basicCheckBoxDemoPage.checlAllCheckBox());
    }
    @Then("Close the browser1")
    public void closeTheBrowser1() {
        basicCheckBoxDemoPage.closeBrowser();
    }
}
