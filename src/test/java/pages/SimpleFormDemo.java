package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestBase;

public class SimpleFormDemo extends TestBase {

    @FindBy(id="user-message")
    WebElement enterMessage;

    @FindBy(xpath = ".//form[@id='get-input']/button")
    WebElement showMessage;


    public SimpleFormDemo(){

        PageFactory.initElements(driver,this);
    }


}
