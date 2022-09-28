package Step_Definitions;

import Pages.Android.DiscountsPage;
import Tests.Password_Builder;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.DiscountsPage.*;
import static Tests.Useful_functions.*;

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
    public void userClicksOnThePharmacyButtonAtHomePage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popular_sub_category_wait)));
        Thread.sleep(500);

        //System.out.println("Pharmacy Button INVISIBLE?: " + ExpectedConditions.invisibilityOfElementLocated(By.xpath(pharmacy_button)));

        if (driver.findElements(By.xpath(pharmacy_button)).isEmpty()){
            scrollRightDiscounts();
            System.out.println("IiNF conidition is working fine");
        }

        Thread.sleep(500);
        get_pharmacy_button().click();
    }


    @And("User searches for the desired vendor {string}")
    public void userSearchesForTheDesiredVendor(String vendor) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_vendors_field)));
        Thread.sleep(1000);
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
    public void userClicksOnTravelAgencyButtonAtHomePage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popular_sub_category_wait)));
        Thread.sleep(500);
        //System.out.println("Travel Agency Invisible?: "+ ExpectedConditions.invisibilityOfElementLocated(By.xpath(travel_agency_button)));


        if (driver.findElements(By.xpath(travel_agency_button)).isEmpty()){
            scrollRightDiscounts();
            System.out.println("INf conidition is working fine");
        }

        Thread.sleep(500);
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
    public void userClicksOnTheCafeteriaButtonAtHomePage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popular_sub_category_wait)));
        Thread.sleep(500);

       // System.out.println("Cafeteria button INVISIBLE?: " + ExpectedConditions.invisibilityOfElementLocated(By.xpath(cafeteria_button)));

        if (driver.findElements(By.xpath(cafeteria_button)).isEmpty()){
            scrollRightDiscounts();
            System.out.println("INf conidition is working fine");
        }
        Thread.sleep(500);
        DiscountsPage.get_cafeteria_button().click();

    }

    @Given("User clicks on the discounts button at home page")
    public void userClicksOnTheDiscountsButtonAtHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(discounts_button)));
        DiscountsPage.get_discounts_button().click();
        //allow location while using app
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(while_using_app_button_id)));
        DiscountsPage.get_while_using_app_button_id().click();


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


    @And("User scrolls down to their desired deal")
    public void userScrollsDownToTheirDesiredDeal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(offers_wait)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_offer)));

//        Actions actions = new Actions(driver);
//        actions.moveToElement(get_mr_and_miss_gym_package());
//        actions.perform();

//        TouchActions action = new TouchActions(driver);
//        action.scroll(get_offers_wait(), 10, 100);
//        action.perform();



    }

    @And("User clicks on the desired deal")
    public void userClicksOnTheDesiredDeal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mr_and_miss_gym_package)));
        DiscountsPage.get_mr_and_miss_gym_package().click();
    }


    @When("User scrolls to the right at discounts page")
    public void userScrollsToTheRightAtDiscountsPage() throws InterruptedException {
        Thread.sleep(5000);
        scrollRightDiscounts();
        Thread.sleep(4000);

    }

    @When("User scrolls down to category {string}")
    public void userScrollsDownToCategory(String category) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popular_sub_category_wait)));

        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Personal Care\"))"));

        Thread.sleep(500);
    }

    @And("User scrolls down at the Mr and Mrs fitness page")
    public void userScrollsDownAtTheMrAndMrsFitnessPage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_deals_gym)));
        scrollDownMrandMrs();
        Thread.sleep(1000);
    }
}