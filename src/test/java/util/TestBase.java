package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
        driver.get(props.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }
 }

