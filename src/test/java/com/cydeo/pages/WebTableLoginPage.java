package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * no parameters!
     * When we call this method, it will directly log in using
     * Username: Test
     * Password: Tester
     */
    public void login() {
        usernameInput.sendKeys("Test");
        passwordInput.sendKeys("Tester");
        loginButton.click();
    }


    /**
     * This method will accept two arguments and login.
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    /**
     * This method will log in using credentials from configuration.properties class
     */
    public void loginWithConfig(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

}
