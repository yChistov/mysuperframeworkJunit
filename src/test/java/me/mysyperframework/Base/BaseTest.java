package me.mysyperframework.Base;

import me.mysyperframework.API.ConciseAPI;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends ConciseAPI {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver",
                "D:\\JavaProject\\mysuperframeworkJunit\\src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
