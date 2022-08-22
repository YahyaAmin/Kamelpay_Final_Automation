package Step_Definitions;

import Pages.Android.DiscountsPage;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.DiscountsPage.*;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;

public class Discounts_Steps {

    public String getRandomString(boolean Digits, boolean Lower, boolean Upper, boolean Punctuation, boolean Spaces, int length) {

        Password_Builder.PasswordGenerator passwordGenerator = new Password_Builder.PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(Digits)
                .useLower(Lower)
                .useUpper(Upper)
                .usePunctuation(Punctuation)
                .useSpaces(Spaces)
                .build();
        String password = passwordGenerator.generate(length); // output ex.: lrU12fmM 75iwI90o
        return password;

    }

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    @Given("User clicks on the pharmacy button at home page")
    public void userClicksOnThePharmacyButtonAtHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pharmacy_button)));
        DiscountsPage.get_pharmacy_button().click();
    }


    @And("User searches for the desired vendor {string}")
    public void userSearchesForTheDesiredVendor(String vendor) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_vendors_field)));
        DiscountsPage.get_search_vendors_field().sendKeys(vendor);
    }

    @When("User clicks on the desired vendor {string}")
    public void userClicksOnTheDesiredVendor(String vndr) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(vendor_selector(vndr))));
        DiscountsPage.get_vendor_selector(vndr).click();
    }

    @And("User clicks on the first offer available")
    public void userClicksOnTheFirstOfferAvailable() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(offers_wait)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_offer)));
        DiscountsPage.get_first_offer().click();
    }

    @When("User enters an invalid six digit merchant pin")
    public void userEntersAnInvalidSixDigitMerchantPin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(merchant_pin_field)));
        DiscountsPage.get_merchant_pin_field().sendKeys(getRandomNumberLowerAndUpperBound(6,7));
    }

    @Then("User should see error invalid merchant pin")
    public void userShouldSeeErrorInvalidMerchantPin() throws InterruptedException {
        Thread.sleep(4000);
    }

    @When("User enters an invalid merchant pin with spaces")
    public void userEntersAnInvalidMerchantPinWithSpaces() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(merchant_pin_field)));
        DiscountsPage.get_merchant_pin_field().sendKeys(getRandomString(true,false,false,false,true,6));
    }

    @Given("User clicks on Travel Agency button at home page")
    public void userClicksOnTravelAgencyButtonAtHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(travel_agency_button)));
        DiscountsPage.get_travel_agency_button().click();
    }

    @When("User enters an invalid merchant pin with special characters")
    public void userEntersAnInvalidMerchantPinWithSpecialCharacters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(merchant_pin_field)));
        DiscountsPage.get_merchant_pin_field().sendKeys(getRandomString(true,false,false,true,false,6));
    }

    @When("User leaves merchant pin empty")
    public void userLeavesMerchantPinEmpty() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(merchant_pin_field)));
        DiscountsPage.get_merchant_pin_field().sendKeys("");
    }
}
