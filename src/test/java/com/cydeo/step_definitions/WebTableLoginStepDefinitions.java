package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginStepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("User is on cydeo web table login page")
    public void user_is_on_cydeo_web_table_login_page() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }

    @When("User enter username")
    public void user_enter_username() {

    }

    @When("User enter password")
    public void user_enter_password() {

    }


    @And("User click login button")
    public void userClickLoginButton() {
        webTableLoginPage.loginButton.click();
    }

    @When("User enter username {string}")
    public void userEnterUsername(String arg0) {
        webTableLoginPage.usernameInput.sendKeys(arg0);
    }

    @And("User enter password {string}")
    public void userEnterPassword(String arg0) {
        webTableLoginPage.passwordInput.sendKeys(arg0);
    }

    @Then("User sees URL ends with orders")
    public void user_sees_url_ends_with_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("orders"));

    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {

        webTableLoginPage.usernameInput.sendKeys(credentials.get("username"));
        webTableLoginPage.passwordInput.sendKeys(credentials.get("password"));
        webTableLoginPage.loginButton.click();

    }

    @When("User enter username {string} password {string} and clicks login")
    public void userEnterUsernamePasswordAndClicksLogin(String username, String pw) {

        webTableLoginPage.login(username, pw);

    }
}
