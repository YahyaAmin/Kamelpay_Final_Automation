package Step_Definitions;

import Pages.Android.LoginPage;
import Pages.Android.PayBill;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Hooks.Base_Class.driver;
import static Pages.Android.MobileTopUpPage.mobile_topup_button;
import static Pages.Android.PayBill.*;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;


public class PayBill_Steps {

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

    @Given("User clicks on utility bills")
    public void userClicksOnUtilityBills() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_topup_button)));
        PayBill.get_pay_bill_button().click();
    }

    @And("User clicks on pay new bill button")
    public void userClicksOnPayNewBillButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pay_new_bill_button)));
        Thread.sleep(500);
        PayBill.get_pay_new_bill_button().click();
    }

    @When("User searches for country at Pay Bill")
    public void userSearchesForCountryAtPayBill() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_country_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_search_country_at_pay_bill().sendKeys("India");
    }

    @And("User clicks on the searched country at Pay Bill")
    public void userClicksOnTheSearchedCountryAtPayBill() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searched_country_at_pay_bill("India"))));
        PayBill.get_searched_country_at_pay_bill("India").click();
    }

    @And("User clicks on Utility button at bill type")
    public void userClicksOnUtilityButtonAtBillType() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(utility_button)));
        Thread.sleep(1000);
        PayBill.get_utility_button().click();
    }

    @When("User searches for company")
    public void userSearchesForCompany() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("KSEB");
    }

    @And("User clicks on the first country in the list")
    public void userClicksOnTheFirstCountryInTheList() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @And("User enters their valid mobile number of KSEB")
    public void userEntersTheirValidMobileNumberOfKSEB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_mobile_number_field_at_pay_bill().sendKeys("9012345678");
    }

    @When("User enters consumer number of KSEB")
    public void userEntersConsumerNumberOfKSEB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_consumer_number_at_pay_bill().sendKeys("1234567890123");
    }

    @Then("User should move to bill is past")
    public void userShouldMoveToBillIsPast() throws InterruptedException {
        Thread.sleep(3000);
    }

    @When("User searches for company Tata Power")
    public void userSearchesForCompanyTataPower() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("Tata Power (Mumbai)");
    }

    @And("User enters their valid mobile number of Tata Power")
    public void userEntersTheirValidMobileNumberOfTataPower() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_tata_power)));
        PayBill.get_consumer_number_tata_power().sendKeys("112233445566");
    }

    @And("User enters valid mobile number for Tata Power")
    public void userEntersValidMobileNumberForTataPower() throws InterruptedException {
        PayBill.get_mobile_number_field_tata_power().sendKeys("9012345678");
        Thread.sleep(1000);
    }

    @And("User searches for Philippines")
    public void userSearchesForPhilippines() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_country_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_search_country_at_pay_bill().sendKeys("Philippines");
    }

    @When("User clicks on Philippines")
    public void userClicksOnPhilippines() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searched_country_at_pay_bill("Philippines"))));
        PayBill.get_searched_country_at_pay_bill("Philippines").click();
    }

    @And("User searches for company Cignal TV")
    public void userSearchesForCompanyCignalTV() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("Cignal TV");
    }

    @When("User enters a valid subscriber name at Cignal TV")
    public void userEntersAValidSubscriberNameAtCignalTV() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subscriber_name_field)));
        PayBill.get_subscriber_name_field().sendKeys("JOHN DOE");
    }

    @And("User enters a valid account number at Cignal TV")
    public void userEntersAValidAccountNumberAtCignalTV() {
        PayBill.get_account_number_field_cignal_tv().sendKeys("9001758799");
    }

    @And("User enters amount at Cignal TV")
    public void userEntersAmountAtCignalTV() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_amount_field_cignal_tv)));
        Thread.sleep(1500);
        PayBill.get_enter_amount_field_cignal_tv().sendKeys(getRandomNumberLowerAndUpperBound(2,4));
    }

    @And("User enters agree terms and conditions")
    public void userEntersAgreeTermsAndConditions() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(agree_terms_and_conditions_cignal_tv)));
        Thread.sleep(2500);
        PayBill.get_agree_terms_and_conditions_cignal_tv().click();
    }

    @When("User enters OTP at pay bill flow")
    public void userEntersOTPAtPayBillFlow() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_first_digit_pay_bill)));
        PayBill.get_otp_first_digit_pay_bill().sendKeys("666666");
    }

    @Then("User should be successfully able to pay bill")
    public void userShouldBeSuccessfullyAbleToPayBill() throws InterruptedException {
        Thread.sleep(6000);
    }

    @And("User clicks on Cignal TV")
    public void userClicksOnCignalTV() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cignal_tv_button)));
        Thread.sleep(1000);
        PayBill.get_cignal_tv_button().click();
    }

    @And("User searches for Pampanga I")
    public void userSearchesForPampangaI() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("Pampanga I");
    }

    @And("User clicks on Pampanga I")
    public void userClicksOnPampangaI() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pampanga_button)));
        Thread.sleep(1000);
        PayBill.get_pampanga_button().click();
    }

    @When("User enters a valid subscriber name at Pampanga I")
    public void userEntersAValidSubscriberNameAtPampangaI() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subscriber_name_field)));
        PayBill.get_subscriber_name_field().sendKeys("JOHN DOE");
    }

    @And("User enters a valid account number at Pampanga I")
    public void userEntersAValidAccountNumberAtPampangaI() {
        PayBill.get_account_number_field_cignal_tv().sendKeys("06066679");
    }

    @When("User searches for company Aavantika")
    public void userSearchesForCompanyAavantika() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("Aavantika");
    }

    @And("User clicks on the company Aavantika")
    public void userClicksOnTheCompanyAavantika() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters customer number")
    public void userEntersCustomerNumber() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(customer_number_field)));
        Thread.sleep(700);
        get_customer_number_field().sendKeys("2233445566");
    }

    @And("User enters valid mobile number for Aavantika")
    public void userEntersValidMobileNumberForAavantika() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_aavantika)));
        get_mobile_number_aavantika().sendKeys("9012345678");
    }

    @Then("User should see bill is past")
    public void userShouldSeeBillIsPast() throws InterruptedException {
        Thread.sleep(6000);
    }

    @When("User searches for company Adani Gas")
    public void userSearchesForCompanyAdaniGas() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("Adani Gas Ltd");
    }

    @When("User searches for company Gujarat Gas Ltd")
    public void userSearchesForCompanyGujaratGasLtd() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("Gujarat Gas");
    }

    @When("User enters customer number for Aavantika")
    public void userEntersCustomerNumberForAavantika() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(customer_number_field)));
        Thread.sleep(700);
        get_customer_number_field().sendKeys("1000083625");
    }

    @And("User clicks on the company Gujarat Gas Ltd")
    public void userClicksOnTheCompanyGujaratGasLtd() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters customer number for Gujarat LTD")
    public void userEntersCustomerNumberForGujaratLTD() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(customer_number_field)));
        Thread.sleep(700);
        get_customer_number_field().sendKeys("500000937265");
    }

    @And("User enters valid mobile number for Gujarat")
    public void userEntersValidMobileNumberForGujarat() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_aavantika)));
        get_mobile_number_aavantika().sendKeys("9841025363");
    }

    @When("User clicks on next button at Gujarat")
    public void userClicksOnNextButtonAtGujarat() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_gujarat)));
        Thread.sleep(2000);
        LoginPage.getnextbutton_forgotpasswordfield().click();
    }

    @When("User searches for PLDT")
    public void userSearchesForPLDT() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("PLDT");
    }

    @And("User clicks on PLDT")
    public void userClicksOnPLDT() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters account number for PLDT")
    public void userEntersAccountNumberForPLDT() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(customer_number_field)));
        Thread.sleep(700);
        get_customer_number_field().sendKeys("7788990011");
    }

    @And("User enters valid telephone number for PLDT")
    public void userEntersValidTelephoneNumberForPLDT() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_aavantika)));
        get_mobile_number_aavantika().sendKeys("832826648");
    }

    @And("User searches for Pakistan")
    public void userSearchesForPakistan() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_country_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_search_country_at_pay_bill().sendKeys("Pakistan");
    }

    @When("User clicks on Pakistan")
    public void userClicksOnPakistan() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searched_country_at_pay_bill("Pakistan"))));
        PayBill.get_searched_country_at_pay_bill("Pakistan").click();
    }

    @When("User searches for LESCO")
    public void userSearchesForLESCO() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("LESCO");
    }

    @And("User clicks on LESCO")
    public void userClicksOnLESCO() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters a valid referrence number")
    public void userEntersAValidReferrenceNumber() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_LESCO)));
        Thread.sleep(1000);
        PayBill.get_reference_number_LESCO().sendKeys("04116738439200");
    }

    @When("User searches for PTCL Landline")
    public void userSearchesForPTCLLandline() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("PTCL Landline");
    }

    @And("User clicks on PTCL Landline")
    public void userClicksOnPTCLLandline() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters a valid referrence number for PTCL")
    public void userEntersAValidReferrenceNumberForPTCL() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_LESCO)));
        Thread.sleep(1000);
        PayBill.get_reference_number_LESCO().sendKeys("2937763091");
    }

    @Then("User should see biller unavailable")
    public void userShouldSeeBillerUnavailable() throws InterruptedException {
        Thread.sleep(6000);
    }

    @When("User searches for SSGC")
    public void userSearchesForSSGC() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("SSGC");
    }

    @And("User clicks on SSGC")
    public void userClicksOnSSGC() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters a valid referrence number for SSGC")
    public void userEntersAValidReferrenceNumberForSSGC() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_LESCO)));
        Thread.sleep(1000);
        PayBill.get_reference_number_LESCO().sendKeys("6372229438");
    }

    @Then("User should see request timed out")
    public void userShouldSeeRequestTimedOut() throws InterruptedException {
        Thread.sleep(6000);
    }

    @When("User searches for KWSB")
    public void userSearchesForKWSB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("KWSB");
    }

    @And("User clicks on KWSB")
    public void userClicksOnKWSB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters a valid referrence number for KWSB")
    public void userEntersAValidReferrenceNumberForKWSB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_LESCO)));
        Thread.sleep(1000);
        PayBill.get_reference_number_LESCO().sendKeys("76740217800040");
    }

    @When("User searches for K-Electric")
    public void userSearchesForKElectric() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("K-Electric");
    }

    @And("User clicks on K-Electric")
    public void userClicksOnKElectric() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters a valid referrence number for K-Electric")
    public void userEntersAValidReferrenceNumberForKElectric() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_LESCO)));
        Thread.sleep(1000);
        PayBill.get_reference_number_LESCO().sendKeys("0509320091734");
    }

    @When("User searches for SNGPL")
    public void userSearchesForSNGPL() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("SNGPL");
    }

    @And("User clicks on SNGPL")
    public void userClicksOnSNGPL() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters a valid consumer number for SNGPL")
    public void userEntersAValidConsumerNumberForSNGPL() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_LESCO)));
        Thread.sleep(1000);
        PayBill.get_reference_number_LESCO().sendKeys("45849090047");
    }

    @And("User clicks on Mobile Prepaid button")
    public void userClicksOnMobilePrepaidButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_prepaid_button)));
        Thread.sleep(1000);
        get_mobile_prepaid_button().click();
    }

    @And("User clicks on Zong Prepaid Button")
    public void userClicksOnZongPrepaidButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(zong_prepaid_button)));
        Thread.sleep(1000);
        get_zong_prepaid_button().click();
    }

    @And("User enters valid mobile number for Zong Prepaid Button")
    public void userEntersValidMobileNumberForZongPrepaidButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_LESCO)));
        Thread.sleep(1000);
        PayBill.get_reference_number_LESCO().sendKeys("3938010321");
    }

    @And("User selects a recharge package of {int} USD")
    public void userSelectsARechargePackageOfUSD(int arg0) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(get_recharge_usd("2"))));
        PayBill.get_get_recharge_usd("2").click();
    }

    @And("User enters their mobile number for Zong")
    public void userEntersTheirMobileNumberForZong() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_zong)));
        PayBill.get_mobile_number_field_zong().sendKeys("923938010321");
    }

    @When("User searches for HESCO")
    public void userSearchesForHESCO() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(2000);
        PayBill.get_search_field_at_pay_utility().sendKeys("HESCO");
    }

    @And("User clicks on HESCO")
    public void userClicksOnHESCO() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @When("User enters an invalid reference number for HESCO")
    public void userEntersAnInvalidReferenceNumberForHESCO() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reference_number_hesco)));
        Thread.sleep(1000);
        PayBill.get_reference_number_hesco().sendKeys("18739209142040");
    }

    @Then("User should see account status is invalid")
    public void userShouldSeeAccountStatusIsInvalid() throws InterruptedException {
        Thread.sleep(5000);
    }

    @When("User clicks on add account to beneficiary button")
    public void userClicksOnAddAccountToBeneficiaryButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(add_account_to_beneficiary_button)));
        PayBill.get_add_account_to_beneficiary_button().click();
    }

    @And("User enters a valid beneficiary name")
    public void userEntersAValidBeneficiaryName() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(beneficiary_name_field)));
        Thread.sleep(1000);
        PayBill.get_beneficiary_name_field().sendKeys(getRandomString(false,true,true,false,false,8));
    }

    @Then("User should see error please enter mobile number")
    public void userShouldSeeErrorPleaseEnterMobileNumber() throws InterruptedException {
        Thread.sleep(4000);
    }

    @When("User enters their mobile number less than ten digits for KSEB")
    public void userEntersTheirMobileNumberLessThanTenDigitsForKSEB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_mobile_number_field_at_pay_bill().sendKeys(getRandomNumberLowerAndUpperBound(7,9));
    }

    @Then("User should see error please enter a valid mobile number")
    public void userShouldSeeErrorPleaseEnterAValidMobileNumber() throws InterruptedException {
        Thread.sleep(4000);
    }

    @When("User enters their mobile number more than ten digits for KSEB")
    public void userEntersTheirMobileNumberMoreThanTenDigitsForKSEB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_mobile_number_field_at_pay_bill().sendKeys(getRandomNumberLowerAndUpperBound(11,14));
    }

    @When("User enters their random ten digit mobile number for KSEB")
    public void userEntersTheirRandomTenDigitMobileNumberForKSEB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_mobile_number_field_at_pay_bill().sendKeys(getRandomNumberLowerAndUpperBound(10,11));
    }

    @Then("User should see error please enter a valid consumer number")
    public void userShouldSeeErrorPleaseEnterAValidConsumerNumber() throws InterruptedException {
        Thread.sleep(4000);
    }

    @And("User enters consumer number of KSEB less than thirteen digits")
    public void userEntersConsumerNumberOfKSEBLessThanThirteenDigits() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_consumer_number_at_pay_bill().sendKeys(getRandomNumberLowerAndUpperBound(5,12));
    }

    @And("User enters consumer number of KSEB more than thirteen digits")
    public void userEntersConsumerNumberOfKSEBMoreThanThirteenDigits() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_consumer_number_at_pay_bill().sendKeys(getRandomNumberLowerAndUpperBound(14,17));
    }

    @And("User enters consumer number of KSEB is a random thirteen digit number")
    public void userEntersConsumerNumberOfKSEBIsARandomThirteenDigitNumber() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_consumer_number_at_pay_bill().sendKeys(getRandomNumberLowerAndUpperBound(13,14));
    }

    @And("User enters consumer number of KSEB is a random number with spaces")
    public void userEntersConsumerNumberOfKSEBIsARandomNumberWithSpaces() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_consumer_number_at_pay_bill().sendKeys(getRandomString(true,false,false,false,true,13));
    }

    @And("User enters consumer number of KSEB is a random number with special characters")
    public void userEntersConsumerNumberOfKSEBIsARandomNumberWithSpecialCharacters() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_consumer_number_at_pay_bill().sendKeys(getRandomString(true,false,false,true,false,13));
    }

    @When("User enters their mobile number at KSEB but number has spaces")
    public void userEntersTheirMobileNumberAtKSEBButNumberHasSpaces() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_mobile_number_field_at_pay_bill().sendKeys(getRandomString(true,false,false,false,true,10));
    }

    @When("User enters their mobile number at KSEB but number has special characters")
    public void userEntersTheirMobileNumberAtKSEBButNumberHasSpecialCharacters() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_mobile_number_field_at_pay_bill().sendKeys(getRandomString(true,false,false,true,false,10));
    }

    @Then("User should not be able to save beneficary")
    public void userShouldNotBeAbleToSaveBeneficary() throws InterruptedException {
        Thread.sleep(5000);
    }

    @And("User forgets to enter beneficary name")
    public void userForgetsToEnterBeneficaryName() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(beneficiary_name_field)));
        Thread.sleep(1000);
    }

    @When("User enters a valid promo code")
    public void userEntersAValidPromoCode() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promo_code_field)));
        PayBill.get_promo_code_field().sendKeys("free");
        Thread.sleep(1000);
    }

    @And("User clicks on apply button")
    public void userClicksOnApplyButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(apply_button)));
        PayBill.get_apply_button().click();

    }

    @Then("User should be successfully able to pay bill without discount")
    public void userShouldBeSuccessfullyAbleToPayBillWithoutDiscount() throws InterruptedException {
        Thread.sleep(6000);
    }

    @When("User enters an invalid promo code")
    public void userEntersAnInvalidPromoCode() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promo_code_field)));
        PayBill.get_promo_code_field().sendKeys(getRandomString(true,true,true,false,false,6));
        Thread.sleep(1000);
    }

    @When("User clicks on pay new bill button again")
    public void userClicksOnPayNewBillButtonAgain() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pay_bill)));
        Thread.sleep(500);
        PayBill.get_pay_bill().click();
    }
}
