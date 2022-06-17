package Step_Definitions;

import Tests.Password_Builder;
import io.cucumber.java.en.And;
import Pages.Android.SignupPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;


public class SignupSteps {

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
        SignupPage.get_phone_number_field_at_register_yourself_page().sendKeys(getRandomNumberLowerAndUpperBound(11,13));
    }

    @When("User enters their valid username for registration")
    public void userEntersTheirValidUsernameForRegistration() {
        SignupPage.get_username_field_at_register_yourself_page().sendKeys(getRandomString(true,true,true,false,false,10));

    }

    String valid_password = getRandomString(true,true,true,true,false,18);

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
        SignupPage.get_sign_up_button_at_register_yourself_page().click();
        Thread.sleep(3000);
    }

    @Then("User should be able to sign up successfully")
    public void userShouldBeAbleToSignUpSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("User enters valid OTP at register yourself")
    public void userEntersValidOTPAtRegisterYourself() throws InterruptedException {
        Thread.sleep(3000);
        SignupPage.get_enter_otp_1st_slot_sign_up().sendKeys("666666");
        Thread.sleep(1000);
    }

    @When("User selects Centiv card")
    public void userSelectsCentivCard() throws InterruptedException {
        SignupPage.get_centiv_card_select_button_at_sign_up().click();
        Thread.sleep(1000);
    }

    @Then("User shouldn't be able to sign in")
    public void userShouldnTBeAbleToSignIn() throws InterruptedException {
        Thread.sleep(1000);
    }


    @And("User enters phone number with less than nine digits")
    public void userEntersPhoneNumberWithLessThanNineDigits() {
        SignupPage.get_phone_number_field_at_register_yourself_page().sendKeys(getRandomNumberLowerAndUpperBound(1,9));
    }
}
