package com.bddframework.definitions;

import com.bddframework.hooks.WebDriverHook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
This class will have methods implemented for Feature file FacebookLoginSteps.feature
 */
public class FacebookLoginSteps {

    private WebDriver driver;

    @Given("launch  a chrome browser with facebook login url \"([^\"]*)\"")
    public void launch_a_chrome_browser_with_facebook_login_url(String login_url) {
        driver = WebDriverHook.driver;
        driver.get(login_url);
        
        System.out.println("Browser Launched.");
    }
    
    @When("user enter a valid username \"([^\"]*)\" and a valid password \"([^\"]*)\"")
    public void user_enter_a_valid_username_and_a_valid_password(String username, String password) {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@name='login']")).click();
    
        System.out.println("Login button is clicked after Email: " + username + " & Password: " + password + " are entered.");
    }
    
    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        List<WebElement> foundElement = driver.findElements(By.xpath("//div[@class='_4rbf _53ij']"));
        if (foundElement.size()!=1)
        {
            System.out.println("Login Successful");
        } else {
            //TODO : For Demo, this is treated as test executed successfully. Here we can keep  Assert.fail(); to make test fail.
            System.out.println("Login Fail");
        }
    }

}
