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
    public void userEntersAValidPhoneNumberAtTopup() {
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
        MobileTopUpPage.get_second_recharge_package().click();
    }

    @When("User clicks on I agree terms and conditions checkbox at Mobile Top Up")
    public void userClicksOnIAgreeTermsAndConditionsCheckboxAtMobileTopUp() throws InterruptedException {
        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(agree_terms_checkbox)));
        MobileTopUpPage.get_agree_terms_checkbox().click();
        Thread.sleep(1000);
    }

    @And("User clicks on pay now button")
    public void userClicksOnPayNowButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pay_now_button)));
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
    public void userEntersAnInvalidPhoneNumberAtTopup() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_mobile_topup)));
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
}
