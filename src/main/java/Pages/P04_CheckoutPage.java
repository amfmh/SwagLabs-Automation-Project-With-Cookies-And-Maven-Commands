package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_CheckoutPage {
    private final WebDriver driver;
    private final By FIRSTNAME = By.id("first-name");
    private final By LASTNAME = By.id("last-name");
    private final By ZIPCODE = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public P04_CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public P04_CheckoutPage fillingInformationForm(String fName, String lName, String zip) {
        Utility.sendData(driver, FIRSTNAME, fName);
        Utility.sendData(driver, LASTNAME, lName);
        Utility.sendData(driver, ZIPCODE, zip);
        return this;
    }

    public P05_OverviewPage clickOnContinueButton() {
        Utility.clickingOnElement(driver, continueButton);
        return new P05_OverviewPage(driver);
    }
}
