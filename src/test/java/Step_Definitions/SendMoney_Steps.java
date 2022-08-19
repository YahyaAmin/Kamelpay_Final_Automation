package Step_Definitions;

import Pages.Android.LoginPage;
import Pages.Android.SendMoneyPage;
import Pages.Android.SignupPage;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.CardManagementPage.centiv_card_at_homescreen;
import static Pages.Android.CardManagementPage.payd_card_homescreen;
import static Pages.Android.SendMoneyPage.*;
import static Pages.Android.SignupPage.get_phone_number_field_at_register_yourself_page;
import static Tests.Useful_functions.*;


public class SendMoney_Steps {

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

    @And("User clicks on Send Money Button")
    public void userClicksOnSendMoneyButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payd_card_homescreen)));
        SendMoneyPage.get_send_money_button().click();
    }

    @And("User clicks on Send Money at Send Money screen")
    public void userClicksOnSendMoneyAtSendMoneyScreen() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(add_new_beneficiary)));
        SendMoneyPage.get_sendmoneybutton2().click();
    }

    public String searched_country = "Pakistan";

    @When("User searches for country")
    public void userSearchesForCountry() throws InterruptedException {
        Thread.sleep(2500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(click_outside_on_send_money)));
        SendMoneyPage.get_search_for_country_send_money().sendKeys(searched_country);
    }

    @And("User clicks on country they searched for")
    public void userClicksOnCountryTheySearchedFor() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_county_wait(searched_country))));
        SendMoneyPage.searched_country_locator(searched_country).click();
        Thread.sleep(4000);
    }

    @And("User clicks on the bank account button")
    public void userClicksOnTheBankAccountButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(bank_accountbutton)));
        SendMoneyPage.get_bank_accountbutton().click();
        Thread.sleep(3000);
    }

    @When("User selects the first bank in the list")
    public void userSelectsTheFirstBankInTheList() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_bank_in_list)));
        SendMoneyPage.get_first_bank_in_list().click();
    }

    @And("User clicks the confirm button")
    public void userClicksTheConfirmButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirm_button)));
        SendMoneyPage.get_confirm_button().click();
        Thread.sleep(1000);
    }

    @When("User enters the amount they want to send")
    public void userEntersTheAmountTheyWantToSend() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sender_amount_field)));
        SendMoneyPage.get_sender_amount_field().sendKeys(getRandomNumberLowerAndUpperBound(2,4));
        Thread.sleep(3000);
        SendMoneyPage.get_click_outside_exchange_rates().click();
    }

    @And("User scrolls down at exchange rate page")
    public void userScrollsDownAtExchangeRatePage() {
        scrollDown();
    }

    @When("User enters first name of beneficiary")
    public void userEntersFirstNameOfBeneficiary() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_name_beneficiary)));
        SendMoneyPage.get_first_name_beneficiary().sendKeys(getRandomString(false,true,true,false,false,8));
    }

    @And("User enters last name of beneficiary")
    public void userEntersLastNameOfBeneficiary() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(last_name_beneficiary)));
        SendMoneyPage.get_last_name_beneficiary().sendKeys(getRandomString(false,true,true,false,false,6));

    }

    @And("User enters phone number of beneficiary")
    public void userEntersPhoneNumberOfBeneficiary() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_beneficiary)));
        SendMoneyPage.get_phone_number_field_beneficiary().sendKeys(getRandomNumberLowerAndUpperBound(9,10));
        SendMoneyPage.click_outside_beneficiary_page1().click();
    }

    @And("User enters account title")
    public void userEntersAccountTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(account_title_field_beneficiary)));
        SendMoneyPage.get_account_title_field_beneficiary().sendKeys(getRandomString(false,true,true,false,false,8));
    }

    @When("User enters Iban number")
    public void userEntersIbanNumber() {
        SendMoneyPage.get_iban_number_beneficiary().sendKeys(getRandomString(false,false,true,false,false,2)+getRandomNumberLowerAndUpperBound(2,3)+getRandomString(false,false,true,false,false,4)+getRandomNumberLowerAndUpperBound(16,17));
        SendMoneyPage.get_click_outside_beneficary2().click();

    }

    @And("User enters remittance purpose")
    public void userEntersRemittancePurpose() {
        SendMoneyPage.get_remittance_purpose_field_beneficiary().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(family_support_option_at_reason_to_pay)));
        SendMoneyPage.get_family_support_option_at_reason_to_pay().click();

    }

    @When("User clicks I agree terms and conditions box")
    public void userClicksIAgreeTermsAndConditionsBox() throws InterruptedException {
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(agree_terms_box)));
        Thread.sleep(500);
        SendMoneyPage.get_agree_terms_box().click();
    }

    @And("User clicks on Send Money at confirmation screen")
    public void userClicksOnSendMoneyAtConfirmationScreen() {
        SendMoneyPage.get_send_money_at_confirmation().click();
    }

    @Then("User should be able to successfully send money")
    public void userShouldBeAbleToSuccessfullySendMoney() throws InterruptedException {
        Thread.sleep(7000);
    }

    @And("User enters valid OTP at send money flow")
    public void userEntersValidOTPAtSendMoneyFlow() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_first_digit_field_send_money)));
        SendMoneyPage.get_otp_first_digit_field_send_money().sendKeys("666666");
    }

    @When("User clicks on the first saved beneficiary")
    public void userClicksOnTheFirstSavedBeneficiary() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_saved_beneficary)));
        SendMoneyPage.get_first_saved_beneficary().click();
    }

    @Then("User shouldnt be able to send money")
    public void userShouldntBeAbleToSendMoney() throws InterruptedException {
        Thread.sleep(4000);
    }

    @When("User clicks on Send Money Button at Centiv card")
    public void userClicksOnSendMoneyButtonAtCentivCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(centiv_card_at_homescreen)));
        SendMoneyPage.get_send_money_button().click();
    }

    @And("User clicks on cash pickup button")
    public void userClicksOnCashPickupButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cash_pickup_button)));
        SendMoneyPage.get_cash_pickup_button().click();
    }

    @When("User searches for Bangladesh")
    public void userSearchesForBangladesh() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(click_outside_on_send_money)));
        SendMoneyPage.get_search_for_country_send_money().sendKeys("Bangladesh");
        Thread.sleep(2500);
    }

    @And("User clicks on Bangladesh")
    public void userClicksOnBangladesh() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_county_wait("Bangladesh"))));
        Thread.sleep(1000);
        SendMoneyPage.searched_country_locator("Bangladesh").click();
        Thread.sleep(4000);
    }

    @And("User clicks on Mobile Wallet")
    public void userClicksOnMobileWallet() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_wallet_button)));
        SendMoneyPage.get_mobile_wallet_button().click();
    }

    @When("User clicks on track history")
    public void userClicksOnTrackHistory() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(track_history)));
        SendMoneyPage.get_track_history().click();
    }

    @Then("User should be redirected to their track history")
    public void userShouldBeRedirectedToTheirTrackHistory() throws InterruptedException {
        Thread.sleep(5000);
        scrollDown();
        Thread.sleep(3000);
    }

    @When("User leaves beneficiary first name empty")
    public void userLeavesBeneficiaryFirstNameEmpty() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_name_beneficiary)));
        SendMoneyPage.get_first_name_beneficiary().sendKeys("");
    }

    @When("User scrolls up")
    public void userScrollsUp() throws InterruptedException {
        scrollUp();
    }


    @Given("I sleep the thread")
    public void iSleepTheThread() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User clicks on add new beneficary button")
    public void userClicksOnAddNewBeneficaryButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(add_new_beneficiary_button)));
        SendMoneyPage.get_add_new_beneficiary_button().click();
    }

    @When("User enters the amount to zero")
    public void userEntersTheAmountToZero() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sender_amount_field)));
        SendMoneyPage.get_sender_amount_field().sendKeys("0");
        Thread.sleep(3000);
        SendMoneyPage.get_click_outside_exchange_rates().click();
    }

    @When("User enters first name of beneficiary at add beneficiary")
    public void userEntersFirstNameOfBeneficiaryAtAddBeneficiary() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_name_beneficiary)));
        SendMoneyPage.get_first_name_beneficiary1().sendKeys(getRandomString(false,true,true,false,false,8));
    }

    @And("User enters last name of beneficiary at add beneficiary")
    public void userEntersLastNameOfBeneficiaryAtAddBeneficiary() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(last_name_beneficiary1)));
        SendMoneyPage.get_last_name_beneficiary1().sendKeys(getRandomString(false,true,true,false,false,6));

    }

    @When("User enters phone number of beneficiary at add beneficary")
    public void userEntersPhoneNumberOfBeneficiaryAtAddBeneficary() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_beneficiary1)));
        SendMoneyPage.get_phone_number_field_beneficiary1().sendKeys(getRandomNumberLowerAndUpperBound(9,10)+getRandomNumberLowerAndUpperBound(3,4));
        Thread.sleep(1000);
        //int phone_num=Integer.parseInt(ph_number);
        String ph_num1 = get_phone_number_field_beneficiary1().getText().replace(" ","");
        long phone_num1=Long.parseLong(ph_num1);
        if (phone_num1<999999999) {
            SendMoneyPage.get_phone_number_field_beneficiary1().sendKeys(getRandomNumberLowerAndUpperBound(9,10)+getRandomNumberLowerAndUpperBound(3,4));
        }
        SendMoneyPage.click_outside_beneficiary_page1().click();
    }

    @And("User enters account title at add beneficary")
    public void userEntersAccountTitleAtAddBeneficary() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(account_title_field_beneficiary1)));
        SendMoneyPage.get_account_title_field_beneficiary1().sendKeys(getRandomString(false,true,true,false,false,8));
    }

    @When("User enters Iban number at add beneficiary")
    public void userEntersIbanNumberAtAddBeneficiary() {
        SendMoneyPage.get_iban_number_beneficiary1().sendKeys(getRandomString(false,false,true,false,false,2)+getRandomNumberLowerAndUpperBound(2,3)+getRandomString(false,false,true,false,false,4)+getRandomNumberLowerAndUpperBound(16,17));
        SendMoneyPage.get_click_outside_beneficary2().click();
    }

    @And("User enters remittance purpose at add beneficiary")
    public void userEntersRemittancePurposeAtAddBeneficiary() {
        SendMoneyPage.get_remittance_purpose_field_beneficiary1().sendKeys(getRandomString(false,true,true,false,true,9));

    }

    @And("User clicks on save beneficiary button")
    public void userClicksOnSaveBeneficiaryButton() throws InterruptedException {
        Thread.sleep(2000);
        SendMoneyPage.get_save_beneficary_button().click();
    }

    @Then("User should successfully add beneficiary")
    public void userShouldSuccessfullyAddBeneficiary() throws InterruptedException {
        Thread.sleep(5000);
    }

    @And("User enters phone number of beneficiary for a Pakistani number")
    public void userEntersPhoneNumberOfBeneficiaryForAPakistaniNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_beneficiary)));
        SendMoneyPage.get_phone_number_field_beneficiary().sendKeys("345"+getRandomNumberLowerAndUpperBound(7,8));
        SendMoneyPage.click_outside_beneficiary_page1().click();
    }

    @And("User enters phone number of beneficiary for a Bangladeshi number")
    public void userEntersPhoneNumberOfBeneficiaryForABangladeshiNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_beneficiary)));
        SendMoneyPage.get_phone_number_field_beneficiary().sendKeys("15"+getRandomNumberLowerAndUpperBound(8,9));
        SendMoneyPage.click_outside_beneficiary_page1().click();
    }

    @And("User enters phone number of beneficiary for a Pakistani number for saved beneficiary")
    public void userEntersPhoneNumberOfBeneficiaryForAPakistaniNumberForSavedBeneficiary() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_num_temp)));
        SendMoneyPage.get_phone_num_temp().sendKeys("345"+getRandomNumberLowerAndUpperBound(7,8));
        SendMoneyPage.click_outside_beneficiary_page1().click();
    }

    @And("User enters remittance purpose as other remittance purpose")
    public void userEntersRemittancePurposeAsOtherRemittancePurpose() {
        SendMoneyPage.get_remittance_purpose_field_beneficiary().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(other_option_at_reason_to_pay)));
        SendMoneyPage.get_other_option_at_reason_to_pay().click();
    }

    @And("User enters the reason for sending money")
    public void userEntersTheReasonForSendingMoney() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(other_field)));
        SendMoneyPage.get_other_field().sendKeys(getRandomString(false,true,true,false,false,8));
    }

    @When("User scrolls down at send money page again")
    public void userScrollsDownAtSendMoneyPageAgain() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_num_temp)));
        scrollDown_CardManagement();
    }
}
