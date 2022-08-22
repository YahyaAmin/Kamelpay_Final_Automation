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

    @Given("User clicks on the cafeteria button at home page")
    public void userClicksOnTheCafeteriaButtonAtHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cafeteria_button)));
        DiscountsPage.get_cafeteria_button().click();
    }

    @Given("User clicks on the discounts button at home page")
    public void userClicksOnTheDiscountsButtonAtHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(discounts_button)));
        DiscountsPage.get_discounts_button().click();
    }

    @And("User selects category {string}")
    public void userSelectsCategory(String category) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(category_selector(category))));
        DiscountsPage.get_category_selector(category).click();
    }

    @When("User selects their sub-category {string}")
    public void userSelectsTheirSubCategory(String sub_ctgry) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sub_category_selector(sub_ctgry))));
        DiscountsPage.get_sub_category_selector(sub_ctgry).click();
    }

    @And("User clicks on the second offer available")
    public void userClicksOnTheSecondOfferAvailable() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(offers_wait)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_offer)));
        DiscountsPage.get_second_offer().click();
    }

    @When("User enters a valid six digit merchant pin for UAT")
    public void userEntersAValidSixDigitMerchantPinForUAT() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(merchant_pin_field)));
        DiscountsPage.get_merchant_pin_field().sendKeys("122418");
    }

    @When("User enters the amount they want")
    public void userEntersTheAmountTheyWant() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_amount_field_wait)));
        DiscountsPage.get_amount_field().sendKeys(getRandomNumberLowerAndUpperBound(2,3));
    }

    @And("User clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submit_button)));
        DiscountsPage.get_submit_button().click();
    }

    @And("User clicks on redeem button")
    public void userClicksOnRedeemButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(redeem_button)));
        DiscountsPage.get_redeem_button().click();
    }

    @Then("User should see successfully avail the offer")
    public void userShouldSeeSuccessfullyAvailTheOffer() throws InterruptedException {
        Thread.sleep(4000);
    }
}
