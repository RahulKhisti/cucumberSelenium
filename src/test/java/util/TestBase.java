package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties props;

    public TestBase() {
        props = new Properties();
        try {
            FileInputStream fl = new FileInputStream("git/cucumberSelenium/src/test/java/config/config.properties");
            props.load(fl);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void initialize(){
        String browserName= props.getProperty("browser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.driver.chromedriver","/Users/Rahul/Downloads/chromedriver_win32/chromedriver");
            driver= new ChromeDriver();

        }

        }
 }

