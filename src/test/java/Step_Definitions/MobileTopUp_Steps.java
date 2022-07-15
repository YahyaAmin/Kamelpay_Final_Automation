package Step_Definitions;

import Pages.Android.MobileTopUpPage;
import Pages.Android.SignupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Hooks.Base_Class.driver;
import static Pages.Android.MobileTopUpPage.*;
import static Pages.Android.SignupPage.get_phone_number_field_at_register_yourself_page;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;


public class MobileTopUp_Steps {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    @When("User clicks on Mobile Top Up button")
    public void userClicksOnMobileTopUpButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_topup_button)));
        MobileTopUpPage.get_mobile_topup_button().click();
    }

    @And("User clicks on Add Topup button")
    public void userClicksOnAddTopupButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(add_topup_button)));
        MobileTopUpPage.get_add_topup_button().click();
    }

    @When("User enters a valid phone number at topup")
    public void userEntersAValidPhoneNumberAtTopup() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_mobile_topup)));
        MobileTopUpPage.get_phone_number_field_at_mobile_topup().sendKeys(getRandomNumberLowerAndUpperBound(9,10)+getRandomNumberLowerAndUpperBound(3,4));

        String ph_num = get_phone_number_field_at_mobile_topup().getText().replace(" ","");
        int phone_num=Integer.parseInt(ph_num);
        if (phone_num<99999999) {
            MobileTopUpPage.get_phone_number_field_at_mobile_topup().sendKeys(getRandomNumberLowerAndUpperBound(9,10)+getRandomNumberLowerAndUpperBound(3,4));
        }
    }

    @And("User selects the first service provider")
    public void userSelectsTheFirstServiceProvider() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_service_provider)));
        MobileTopUpPage.get_first_service_provider().click();
    }

    @When("User selects a recharge package")
    public void userSelectsARechargePackage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(second_recharge_package)));
        MobileTopUpPage.get_second_recharge_package("20.00").click();
    }

    @When("User clicks on I agree terms and conditions checkbox at Mobile Top Up")
    public void userClicksOnIAgreeTermsAndConditionsCheckboxAtMobileTopUp() throws InterruptedException {
        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(agree_terms_checkbox)));
        MobileTopUpPage.get_agree_terms_checkbox().click();
        Thread.sleep(1000);
    }

    @And("User clicks on pay now button")
    public void userClicksOnPayNowButton() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pay_now_button)));
        Thread.sleep(1000);
        MobileTopUpPage.get_pay_now_button().click();
    }

    @Then("User should be able to topup successfully")
    public void userShouldBeAbleToTopupSuccessfully() throws InterruptedException {
        Thread.sleep(6000);
    }

    @And("User clicks on next button at recharge page")
    public void userClicksOnNextButtonAtRechargePage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(next_button)));
        MobileTopUpPage.get_next_button().click();
        Thread.sleep(2000);
    }

    @When("User enters an invalid phone number at topup")
    public void userEntersAnInvalidPhoneNumberAtTopup() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_mobile_topup)));
        Thread.sleep(500);
        MobileTopUpPage.get_phone_number_field_at_mobile_topup().sendKeys(getRandomNumberLowerAndUpperBound(8,9));

    }

    @Then("User shouldnt be able to topup")
    public void userShouldntBeAbleToTopup() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("User clicks on save beneficiary button at topup")
    public void userClicksOnSaveBeneficiaryButtonAtTopup() throws InterruptedException {
       MobileTopUpPage.get_save_account_to_beneficary().click();
       Thread.sleep(1500);
    }

    @When("User clicks on country code")
    public void userClicksOnCountryCode() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(country_code)));
        MobileTopUpPage.get_country_code().click();
    }

    String country1 = "Pakistan";
    @And("User searches for first country")
    public void userSearchesForFirstCountry() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_country)));
        MobileTopUpPage.get_search_country().sendKeys(country1);
    }

    @When("User clicks on their searched country")
    public void userClicksOnTheirSearchedCountry() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_country)));
        MobileTopUpPage.get_country(country1).click();
    }

    @And("User clicks on the first existing beneficiary")
    public void userClicksOnTheFirstExistingBeneficiary() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(existing_beneficary)));
        Thread.sleep(1000);
        MobileTopUpPage.get_existing_beneficary().click();
    }

    @Then("User should see the country code and flag at phone number")
    public void userShouldSeeTheCountryCodeAndFlagAtPhoneNumber() throws InterruptedException {
        Thread.sleep(5000);
    }


    @When("User selects a recharge package of {int} AED")
    public void userSelectsARechargePackageOfAED(int arg0) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(get_country_xpath("55.00"))));
        MobileTopUpPage.get_second_recharge_package("55.00").click();
    }

    @And("User searches for existing beneficiaries")
    public void userSearchesForExistingBeneficiaries() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(existing_beneficary)));
        Thread.sleep(1000);
        MobileTopUpPage.get_search_existing_beneficiaries().sendKeys("khizer");
        Thread.sleep(3000);
        MobileTopUpPage.get_search_existing_beneficiaries().clear();
        MobileTopUpPage.get_search_existing_beneficiaries().sendKeys("wasif");
        Thread.sleep(3000);
        MobileTopUpPage.get_search_existing_beneficiaries().clear();
        MobileTopUpPage.get_search_existing_beneficiaries().sendKeys("yahya");
        Thread.sleep(1000);

    }

    @Then("User should successfully be able to search beneficiaries")
    public void userShouldSuccessfullyBeAbleToSearchBeneficiaries() throws InterruptedException {
        Thread.sleep(1500);
    }

    @And("User searches for different service providers")
    public void userSearchesForDifferentServiceProviders() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_service_provider)));
        Thread.sleep(1000);
        MobileTopUpPage.get_search_service_providers().sendKeys("Etisalat");
        Thread.sleep(2000);
        MobileTopUpPage.get_search_service_providers().clear();
        Thread.sleep(1000);
        MobileTopUpPage.get_search_service_providers().sendKeys("Du Prepaid");
        Thread.sleep(2000);
        MobileTopUpPage.get_search_service_providers().clear();
        Thread.sleep(1000);
        MobileTopUpPage.get_search_service_providers().sendKeys("ABCD Topup");
        Thread.sleep(500);
    }

    @Then("User shouldnt be able to proceed")
    public void userShouldntBeAbleToProceed() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("User leaves phone number empty at topup")
    public void userLeavesPhoneNumberEmptyAtTopup() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_mobile_topup)));
        MobileTopUpPage.get_phone_number_field_at_mobile_topup().sendKeys("");
    }
}
