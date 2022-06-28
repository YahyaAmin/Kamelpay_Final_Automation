package Step_Definitions;

import Pages.Android.LoginPage;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import Pages.Android.SignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.SignupPage.*;
import static Tests.Useful_functions.getRandomDigit;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;


public class SignupSteps {

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

    @And("User clicks on Don't have an account? signup button")
    public void userClicksOnDonTHaveAnAccountSignupButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dont_have_an_account_signup_button)));
        SignupPage.get_dont_have_an_account_signup_button().click();
        Thread.sleep(1000);
    }


    @When("User selects PayD card")
    public void userSelectsPayDCard() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payd_card_select_button_at_signup)));
        SignupPage.get_payd_card_select_button_at_signup().click();
        Thread.sleep(1000);
    }

    @And("User clicks on I am ready button")
    public void userClicksOnIAmReadyButton() throws InterruptedException {
        SignupPage.get_i_am_ready_button_at_signup().click();
        Thread.sleep(1000);
    }


    @And("User enters their valid phone number for registration")
    public void userEntersTheirValidPhoneNumberForRegistration() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_register_yourself_page)));
        SignupPage.get_phone_number_field_at_register_yourself_page().sendKeys(getRandomNumberLowerAndUpperBound(9,10)+getRandomNumberLowerAndUpperBound(3,4));
    }

    @When("User enters their valid username for registration")
    public void userEntersTheirValidUsernameForRegistration() {
        SignupPage.get_username_field_at_register_yourself_page().sendKeys(getRandomString(true,true,true,false,false,10));

    }

    String valid_password = getRandomString(true,true,true,true,false,20);

    @And("User enters their valid password")
    public void userEntersTheirValidPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_your_password_at_register_yourself_page)));
        SignupPage.get_enter_your_password_at_register_yourself_page().sendKeys(valid_password);
    }

    @When("User enters a valid confirm password")
    public void userEntersAValidConfirmPassword() throws InterruptedException {
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(valid_password);
        SignupPage.get_view_password_eye_button().click();
        Thread.sleep(2000);
        SignupPage.get_view_password_eye_button().click();
    }

    @And("User clicks on sign up button")
    public void userClicksOnSignUpButton() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sign_up_button_at_register_yourself_page)));
        SignupPage.get_sign_up_button_at_register_yourself_page().click();
        Thread.sleep(3000);
    }

    @Then("User should be able to sign up successfully")
    public void userShouldBeAbleToSignUpSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User enters valid OTP at register yourself")
    public void userEntersValidOTPAtRegisterYourself() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_otp_1st_slot_sign_up)));
        SignupPage.get_enter_otp_1st_slot_sign_up().sendKeys("666666");
        Thread.sleep(1000);
    }

    @When("User selects Centiv card")
    public void userSelectsCentivCard() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(centiv_card_select_button_at_sign_up)));
        SignupPage.get_centiv_card_select_button_at_sign_up().click();
        Thread.sleep(1000);
    }

    @Then("User shouldn't be able to sign in")
    public void userShouldnTBeAbleToSignIn() throws InterruptedException {
        Thread.sleep(3000);
    }


    @And("User enters phone number with less than nine digits")
    public void userEntersPhoneNumberWithLessThanNineDigits() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_register_yourself_page)));
        SignupPage.get_phone_number_field_at_register_yourself_page().sendKeys(getRandomNumberLowerAndUpperBound(1,9));
    }

    @When("User enters username with special characters")
    public void userEntersUsernameWithSpecialCharacters() {
        SignupPage.get_username_field_at_register_yourself_page().sendKeys(getRandomString(true,true,true,true,false,12));
    }

    @When("User enters username with spaces")
    public void userEntersUsernameWithSpaces() {
        SignupPage.get_username_field_at_register_yourself_page().sendKeys(getRandomString(true,true,true,false,true,12));
    }

    String different_confirm_password = getRandomString(true,true,true,true,false,20);

    @When("User enters a different confirm password")
    public void userEntersADifferentConfirmPassword() throws InterruptedException {
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(different_confirm_password);
        SignupPage.get_view_password_eye_button().click();
        SignupPage.get_view_password_eye_button().click();
    }

    String password_without_uppercase = getRandomString(true,true,false,true,false,20);

    @And("User enters their password without uppercase letters")
    public void userEntersTheirAPasswordWithoutUppercaseLetters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_your_password_at_register_yourself_page)));
        SignupPage.get_enter_your_password_at_register_yourself_page().sendKeys(password_without_uppercase);
    }

    @When("User enters a confirm password without uppercase letters")
    public void userEntersAConfirmPasswordWithoutUppercaseLetters() throws InterruptedException {
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(password_without_uppercase);
        SignupPage.get_view_password_eye_button().click();
        Thread.sleep(2000);
        SignupPage.get_view_password_eye_button().click();
    }

    String password_without_number = getRandomString(false,true,true,true,false,20);

    @And("User enters their password without a number")
    public void userEntersTheirPasswordWithoutANumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_your_password_at_register_yourself_page)));
        SignupPage.get_enter_your_password_at_register_yourself_page().sendKeys(password_without_number);
    }

    @When("User enters a confirm password without a number")
    public void userEntersAConfirmPasswordWithoutANumber() throws InterruptedException {
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(password_without_number);
        SignupPage.get_view_password_eye_button().click();
        Thread.sleep(2000);
        SignupPage.get_view_password_eye_button().click();
    }

    String password_without_lowercase = getRandomString(true,false,true,true,false,20);

    @And("User enters their password without a lowercase letter")
    public void userEntersTheirPasswordWithoutALowercaseLetter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_your_password_at_register_yourself_page)));
        SignupPage.get_enter_your_password_at_register_yourself_page().sendKeys(password_without_lowercase);

    }

    @When("User enters a confirm password without a lowercase letter")
    public void userEntersAConfirmPasswordWithoutALowercaseLetter() throws InterruptedException {
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(password_without_lowercase);
        SignupPage.get_view_password_eye_button().click();
        Thread.sleep(2000);
        SignupPage.get_view_password_eye_button().click();
    }

    String password_without_special_character = getRandomString(true,true,true,false,false,20);

    @And("User enters their password without a special character")
    public void userEntersTheirPasswordWithoutASpecialCharacter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_your_password_at_register_yourself_page)));
        SignupPage.get_enter_your_password_at_register_yourself_page().sendKeys(password_without_special_character);
    }

    @When("User enters a confirm password without a special character")
    public void userEntersAConfirmPasswordWithoutASpecialCharacter() throws InterruptedException {
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(password_without_special_character);
        SignupPage.get_view_password_eye_button().click();
        Thread.sleep(2000);
        SignupPage.get_view_password_eye_button().click();
    }

    int random_pw_length = getRandomDigit(5);
    String short_password = getRandomString(true,true,true,true,false,random_pw_length);

    @And("User enters their password but password is too short")
    public void userEntersTheirPasswordButPasswordIsTooShort() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_your_password_at_register_yourself_page)));
        SignupPage.get_enter_your_password_at_register_yourself_page().sendKeys(short_password);;
    }

    @When("User enters a confirm password but password is too short")
    public void userEntersAConfirmPasswordButPasswordIsTooShort() throws InterruptedException {
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(short_password);
        SignupPage.get_view_password_eye_button().click();
        Thread.sleep(2000);
        SignupPage.get_view_password_eye_button().click();
    }

    @When("User enters last four digits of their card")
    public void userEntersLastFourDigitsOfTheirCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(card_last_four_digits_sigunp)));
        SignupPage.get_card_last_four_digits_sigunp().sendKeys(getRandomNumberLowerAndUpperBound(4,5));
    }

    @And("User clicks on I agree terms and conditions checkbox")
    public void userClicksOnIAgreeTermsAndConditionsCheckbox() {
        SignupPage.get_i_agree_termsandcondition().click();
    }

    @When("User clicks Get Your New Card button")
    public void userClicksGetYourNewCardButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(get_new_card_button)));
        SignupPage.getGetNewCard().click();
    }

    @When("User enters an invalid email")
    public void userEntersAnInvalidEmail() {
        SignupPage.get_email_field_at_signup().sendKeys(getRandomString(true,true,true,true,false,10));
    }

    @When("User enters email with spaces")
    public void userEntersEmailWithSpaces() {
        SignupPage.get_email_field_at_signup().sendKeys(getRandomString(true,true,true,true,false,10)+" "+"gmail.com");
    }

    @And("User enters invalid OTP at register yourself")
    public void userEntersInvalidOTPAtRegisterYourself() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_otp_1st_slot_sign_up)));
        SignupPage.get_enter_otp_1st_slot_sign_up().sendKeys(getRandomNumberLowerAndUpperBound(6,7));
        Thread.sleep(1000);
    }

    @And("User enters OTP with less than six digits")
    public void userEntersOTPWithLessThanSixDigits() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_otp_1st_slot_sign_up)));
        SignupPage.get_enter_otp_1st_slot_sign_up().sendKeys(getRandomNumberLowerAndUpperBound(1,6));
        LoginPage.getnextbutton_otpscreen().click();
        Thread.sleep(1000);
    }

    @And("User enters leaves OTP empty")
    public void userEntersLeavesOTPEmpty() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_otp_1st_slot_sign_up)));
        SignupPage.get_enter_otp_1st_slot_sign_up().sendKeys("");
        LoginPage.getnextbutton_otpscreen().click();
        Thread.sleep(1000);
    }

    @And("User clicks on verify button after signup")
    public void userClicksOnVerifyButtonAfterSignup() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(verify_button_after_signup)));
        SignupPage.getverify_button_after_signup().click();
    }

    @When("User enters their last four digits of card")
    public void userEntersTheirLastFourDigitsOfCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_card_last_digits)));
        SignupPage.getCardLastFourDigits().sendKeys(getRandomNumberLowerAndUpperBound(4,5));

    }

    @And("User clicks on proceed button")
    public void userClicksOnProceedButton() {
        SignupPage.getproceed_button().click();
    }

    @Then("User should move to scan ID page")
    public void userShouldMoveToScanIDPage() throws InterruptedException {
        Thread.sleep(5000);
    }

    @When("User enters last four digits of their card but with spaces")
    public void userEntersLastFourDigitsOfTheirCardButWithSpaces() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(card_last_four_digits_sigunp)));
        SignupPage.get_card_last_four_digits_sigunp().sendKeys(getRandomString(true,false,false,false,true,4));

    }


}
