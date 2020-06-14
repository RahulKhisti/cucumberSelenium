package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestBase;

public class BasicCheckBoxDemoPage extends TestBase {

    @FindBy(xpath = "//label[text()='Option 1']/input")
        WebElement option1;
    @FindBy(xpath = "//label[text()='Option 2']/input")
    WebElement option2;
    @FindBy(xpath = "//label[text()='Option 3']/input")
    WebElement option3;
    @FindBy(xpath = "//label[text()='Option 4']/input")
    WebElement option4;

    @FindBy(id="check1")
        WebElement checkAll;


public BasicCheckBoxDemoPage() {
    PageFactory.initElements(driver, this);
}
    public void clickOnOption1(){
     option1.click();
    }
    public void setCheckAll(){
    checkAll.click();
    }

    public boolean checlAllCheckBox() {
        boolean check ;
        if (option1.isSelected()==false || option2.isSelected()==false || option3.isSelected()==false || option4.isSelected()==false) {
            check = false;
        } else {
             check=true;
        }
        return check;
    }

    public void closeBrowser() {
        driver.close();
    }


}
