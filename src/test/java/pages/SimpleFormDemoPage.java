package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestBase;

public class SimpleFormDemoPage extends TestBase {

    @FindBy(xpath = "//input[@id='user-message']")
    WebElement enterMessage;

    @FindBy(xpath = "//form[@id='get-input']/button")
    WebElement showMessage;

    @FindBy(id="display")
    WebElement displayMessage;

    public SimpleFormDemoPage(){

        PageFactory.initElements(driver,this);
    }
    public void enter_Message(String message){
        enterMessage.sendKeys(message);
    }
    public void click_Show_Message_Button(){
        showMessage.click();
    }
    public String get_Displayed_Message(){
        return displayMessage.getText();
    }

}
