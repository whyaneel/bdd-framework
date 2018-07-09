package com.bddframework.hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHook {
    public static WebDriver driver;

    @Before
    public void open() {
        String clientOS = System.getProperty("os.name");
        System.out.println("This is " + clientOS);

        //TODO : This Web Driver is only for Mac OS X 64 Bit, we can use if-else to decide Web Driver conditionally
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver_mac64");

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        driver.close();
    }
}
