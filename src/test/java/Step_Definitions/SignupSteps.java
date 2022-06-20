package Step_Definitions;

import Tests.Password_Builder;
import io.cucumber.java.en.And;
import Pages.Android.SignupPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.LoginPage.phone_no_on_mainscreen;
import static Pages.Android.SignupPage.*;
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(i_am_ready_button_at_signup)));
        SignupPage.get_i_am_ready_button_at_signup().click();
        Thread.sleep(1000);
    }


    @And("User enters their valid phone number for registration")
    public void userEntersTheirValidPhoneNumberForRegistration() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_register_yourself_page)));
        SignupPage.get_phone_number_field_at_register_yourself_page().sendKeys(getRandomNumberLowerAndUpperBound(12,14));
    }

    @When("User enters their valid username for registration")
    public void userEntersTheirValidUsernameForRegistration() {
        SignupPage.get_username_field_at_register_yourself_page().sendKeys(getRandomString(true,true,true,false,false,10));

    }

    String valid_password = getRandomString(true,true,true,true,false,20);

    @And("User enters their valid password")
    public void userEntersTheirValidPassword() {
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
        Thread.sleep(2000);
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
        Thread.sleep(1000);
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
        Thread.sleep(2000);
        SignupPage.get_confirm_your_password_at_register_yourself_page().sendKeys(different_confirm_password);
        SignupPage.get_view_password_eye_button().click();
        Thread.sleep(2000);
        SignupPage.get_view_password_eye_button().click();
    }
}
