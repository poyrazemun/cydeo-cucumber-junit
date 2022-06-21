package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();//bu line butun acik windowlarin 'Window handle'larini bir yerde saklamamiza lazim oluyor.

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().equals(expectedTitle));
    }


    public static void waitForInvisibilityOf(WebElement webElement) {

        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


    /**
     * bu method Dropdown menudeki butun optionlari alip String'e donusturuyor
     *
     * @param dropdownElement
     * @return List of String
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
        Select select = new Select(dropdownElement);

        List<WebElement> actualOptions = select.getOptions();
        List<String> actualOptionsAsText = new ArrayList<>();

        for (int i = 0; i < actualOptions.size(); i++) {
            String a = actualOptions.get(i).getText();
            actualOptionsAsText.add(a);
        }

        return actualOptionsAsText;
    }


    /**
     * This method will accept a group of radio buttons as a List of WebElement!!
     * It will loop through the List and click to the radio button with provided attributeValue!!
     *
     * @param radiobuttons
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radiobuttons, String attributeValue) {

        for (WebElement each : radiobuttons) {

            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                each.click();
            }
        }
    }




}
