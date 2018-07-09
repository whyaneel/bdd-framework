package com.bddframework.definitions;

import com.bddframework.hooks.WebDriverHook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ACUOLoginPage {

    WebDriver driver;

    @Given("launch Firefox with application")
    public void launch_Firefox_with_application() {
        driver = WebDriverHook.driver;
        driver.get("https://uat.acuo.com/");
    }

    @When("user enter valid username and valid password")
    public void user_enter_valid_username_and_valid_password() {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user@acuocpty.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@Password1");
        driver.findElement(By.xpath("//div[@class='Login__buttonHolder___3TWr4']")).click();
    }

    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        List<WebElement> foundElement = driver.findElements(By.xpath("//div[@class='Login__pw_error___3qDZz']"));
        if (foundElement.size()!=1)
        {
            System.out.println("Login Successful");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

}
