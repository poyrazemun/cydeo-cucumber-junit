package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class GoogleStepDefinitions {


    GoogleSearchPage googleSearchPage = new GoogleSearchPage();//pages'deki classin objectini cagirabilmek icin bunu kullaniyorum.

    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);


    }

    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }


    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }


    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String arg0) {

        googleSearchPage.searchBox.sendKeys(arg0 + Keys.ENTER);

    }

    @Then("user sees {string} in the google title")
    public void userSeesInTheGoogleTitle(String arg0) {
        String expectedTitle = arg0 + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }


    @Then("user should see {string} in the result")
    public void userShouldSeeInTheResult(String arg0) {
        System.out.println("googleSearchPage.getCapital(arg0).getText() = " + googleSearchPage.getCapital(arg0).getText());
    }
}
