package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTableStepDefinitions {


    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        List<String> actualOptionsAsText = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);

        //System.out.println(actualOptionsAsText);

        Assert.assertTrue(expectedMonths.equals(actualOptionsAsText));




    }


}
