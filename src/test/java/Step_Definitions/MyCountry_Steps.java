package Step_Definitions;
import Pages.Android.LoginPage;
import Pages.Android.MyCountry;
import Pages.Android.PayBill;
import Pages.Android.SendMoneyPage;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.CardManagementPage.card_management_button;
import static Pages.Android.CardManagementPage.centiv_card_at_homescreen;
import static Pages.Android.PayBill.*;
import static Pages.Android.SendMoneyPage.phone_number_field_beneficiary;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;
import static Pages.Android.MyCountry.*;
import static Tests.Useful_functions.*;


public class MyCountry_Steps {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

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


    @When("User clicks on MY country button")
    public void userClicksOnMYCountryButton() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(my_country_button)));
        MyCountry.get_my_country_button().click();
    }


    @And("User clicks on JazzCash at Popular Banks")
    public void userClicksOnJazzCashAtPopularBanks() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_for_popular_bank("JazzCash"))));
        MyCountry.get_wait_for_popular_bank("JazzCash").click();
    }

    @Then("User should see error message that this feature is only for PayD Card")
    public void userShouldSeeErrorMessageThatThisFeatureIsOnlyForPayDCard() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User clicks on next button")
    public void userClicksOnNextButton() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage.getnextbutton_forgotpasswordfield().click();
    }

    @And("User scrolls down at My country page")
    public void userScrollsDownAtMyCountryPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_my_country_page)));
        scrollDown();
    }

    @And("User scrolls to the right at my country page")
    public void userScrollsToTheRightAtMyCountryPage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(zong_prepaid_button)));
        scrollRightPost();
        Thread.sleep(2000);
        scrollRightPost();
        Thread.sleep(2000);
        scrollRightPre();
        Thread.sleep(2000);
        scrollRightPre();
    }

    @When("User clicks on Ufone Postpaid")
    public void userClicksOnUfonePostpaid() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ufone_post_paid)));
        MyCountry.get_ufone_post_paid().click();
    }

    @And("User enters a valid phone number for Ufone")
    public void userEntersAValidPhoneNumberForUfone() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ufone_mobile_number_field)));
        MyCountry.get_ufone_mobile_number_field().sendKeys("03293766000");
    }

    @When("User clicks on Mobilink Postpaid button")
    public void userClicksOnMobilinkPostpaidButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(postpaid_button("Mobilink Postpaid"))));
        MyCountry.get_postpaid_button("Mobilink Postpaid").click();
    }

    @And("User enters a invalid phone number at Mobilink")
    public void userEntersAInvalidPhoneNumberAtMobilink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ufone_mobile_number_field)));
        MyCountry.get_ufone_mobile_number_field().sendKeys(getRandomNumberLowerAndUpperBound(1,9));
    }

    @Then("User should see invalid phone number error")
    public void userShouldSeeInvalidPhoneNumberError() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User enters a phone number more than eleven digits")
    public void userEntersAPhoneNumberMoreThanElevenDigits() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ufone_mobile_number_field)));
        MyCountry.get_ufone_mobile_number_field().sendKeys(getRandomNumberLowerAndUpperBound(13,17));
    }

    @And("User enters a phone number with special characters")
    public void userEntersAPhoneNumberWithSpecialCharacters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ufone_mobile_number_field)));
        MyCountry.get_ufone_mobile_number_field().sendKeys(getRandomString(true,false,false,true,false,11));
    }

    @And("User enters a phone number with spaces")
    public void userEntersAPhoneNumberWithSpaces() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ufone_mobile_number_field)));
        MyCountry.get_ufone_mobile_number_field().sendKeys(getRandomString(true,false,false,false,true,11));
    }

    @And("User enters a phone number with random eleven digits")
    public void userEntersAPhoneNumberWithRandomElevenDigits() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ufone_mobile_number_field)));
        MyCountry.get_ufone_mobile_number_field().sendKeys(getRandomNumberLowerAndUpperBound(11,12));
    }

    @Then("User should see invalid reference")
    public void userShouldSeeInvalidReference() throws InterruptedException {
        Thread.sleep(4000);
    }

    @And("User enters mobile number less than twelve digits")
    public void userEntersMobileNumberLessThanTwelveDigits() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_zong)));
        PayBill.get_mobile_number_field_zong().sendKeys(getRandomNumberLowerAndUpperBound(4,11));
    }

    @And("User enters mobile number more than twelve digits")
    public void userEntersMobileNumberMoreThanTwelveDigits() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_zong)));
        PayBill.get_mobile_number_field_zong().sendKeys(getRandomNumberLowerAndUpperBound(14,17));
    }

    @And("User enters mobile number has spaces")
    public void userEntersMobileNumberHasSpaces() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_zong)));
        PayBill.get_mobile_number_field_zong().sendKeys(getRandomString(true,false,false,false,true,12));
    }

    @And("User enters mobile number has special characters")
    public void userEntersMobileNumberHasSpecialCharacters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_zong)));
        PayBill.get_mobile_number_field_zong().sendKeys(getRandomString(true,false,false,true,false,12));
    }

    @When("User leaves OTP empty")
    public void userLeavesOTPEmpty() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_first_digit_pay_bill)));
    }

    @Then("User should see invalid OTP")
    public void userShouldSeeInvalidOTP() throws InterruptedException {
        Thread.sleep(3000);
    }

    @When("User enters OTP with special characters")
    public void userEntersOTPWithSpecialCharacters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_first_digit_pay_bill)));
        PayBill.get_otp_first_digit_pay_bill().sendKeys(getRandomString(true,false,false,true,false,6));
    }

    @When("User enters OTP but OTP has spaces")
    public void userEntersOTPButOTPHasSpaces() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_first_digit_pay_bill)));
        PayBill.get_otp_first_digit_pay_bill().sendKeys(getRandomString(true,false,false,false,true,6));
    }

    @When("User enters OTP but it is an incorrect six digit OTP")
    public void userEntersOTPButItIsAnIncorrectSixDigitOTP() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_first_digit_pay_bill)));
        PayBill.get_otp_first_digit_pay_bill().sendKeys(getRandomString(true,false,false,false,false,6));
    }

    @When("User clicks on LESCO at MyCountry")
    public void userClicksOnLESCOAtMyCountry() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LESCO_button)));
        MyCountry.get_LESCO_button().click();
    }

    @When("User clicks on SNGPL at MyCountry")
    public void userClicksOnSNGPLAtMyCountry() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SNGPL_button)));
        MyCountry.get_SNGPL_button().click();
    }

    @Then("User should see error processing transaction")
    public void userShouldSeeErrorProcessingTransaction() throws InterruptedException {
        Thread.sleep(6000);
    }

    @When("User clicks on Central Depositary Company Pakistan")
    public void userClicksOnCentralDepositaryCompanyPakistan() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(central_despoitory_company_pakistan)));
        MyCountry.get_central_despoitory_company_pakistan().click();
    }

    @And("User enters a reference number at financial services")
    public void userEntersAReferenceNumberAtFinancialServices() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_field_financial_services)));
        MyCountry.get_reference_field_financial_services().sendKeys(getRandomNumberLowerAndUpperBound(8,12));
    }

    @And("User enters Pakistani phone number of beneficiary")
    public void userEntersPakistaniPhoneNumberOfBeneficiary() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_beneficiary)));
        SendMoneyPage.get_phone_number_field_beneficiary().clear();
        SendMoneyPage.get_phone_number_field_beneficiary().sendKeys("345"+getRandomNumberLowerAndUpperBound(7,8));
        SendMoneyPage.click_outside_beneficiary_page1().click();
    }

    @And("User enters a valid account title")
    public void userEntersAValidAccountTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(account_title_field)));
        MyCountry.get_account_title_field().sendKeys(getRandomString(false,true,true,false,true,8));

    }

    @And("User enters a valid IBAN number")
    public void userEntersAValidIBANNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(iban_no_field)));
        MyCountry.get_iban_no_field().sendKeys(getRandomString(true,false,true,false,false,24));
    }

    @When("User clicks on UBL Fund Management")
    public void userClicksOnUBLFundManagement() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ubl_fund_manage)));
        MyCountry.get_ubl_fund_manage().click();
    }

    @When("User clicks on HESCO at My Country")
    public void userClicksOnHESCOAtMyCountry() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HESCO_button)));
        MyCountry.get_HESCO_button().click();
    }

    @And("User scrolls down at My country page again")
    public void userScrollsDownAtMyCountryPageAgain() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HESCO_button)));
        scrollDown();
    }
}
