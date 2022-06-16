package Step_Definitions;

import Pages.Android.LoginPage;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;


public class LoginSteps {

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


    @Given("User is on Login Page")
    public void user_is_on_login_page() throws InterruptedException {
        Thread.sleep(5000);
        LoginPage.getphone_no_mainscreen().clear();

    }

    @When("User enters correct phone number")
    public void userEntersUsernameAndPassword() {

         LoginPage.getphone_no_mainscreen().sendKeys("123456789");
    }


    @And("User enters correct password")
    public void userEntersCorrectPassword() throws InterruptedException {
        LoginPage.getpassword_mainscreen().sendKeys("Password123!");
        LoginPage.get_viewpassword_mainscreen().click();
        Thread.sleep(3000);
        LoginPage.get_viewpassword_mainscreen().click();
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        LoginPage.getlogin_button_mainscreen().click();
    }

    @And("User clicks on dont allow biometric button")
    public void userClicksOnDontAllowBiometricButton() {
        LoginPage.get_dontallow_biometric_button().click();
    }

    @Then("User should successfully login")
    public void userShouldSuccessfullyLogin() throws InterruptedException {
        Thread.sleep(4000);
    }


    @And("User clicks on sidebar menu")
    public void userClicksOnSidebarMenu() {
        LoginPage.get_sidebar_button().click();

    }


    @When("User clicks on settings from sidebar menu")
    public void userClicksOnSettingsFromSidebarMenu() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage.get_settingsbutton_sidebar().click();
        Thread.sleep(2000);
    }

    @And("User clicks on setup pin login button")
    public void userClicksOnSetupPinLoginButton() {
        LoginPage.get_setuppinbutton_sidebar().click();

    }

    public String pin_1st = getRandomNumberLowerAndUpperBound(1,2);
    public String pin_2nd = getRandomNumberLowerAndUpperBound(1,2);
    public String pin_3rd = getRandomNumberLowerAndUpperBound(1,2);
    public String pin_4th = getRandomNumberLowerAndUpperBound(1,2);

    @When("User enters pin to setup pin")
    public void userEntersPinToSetupPin() {
        LoginPage.get_enternewpin_pinlogin().sendKeys(pin_1st+pin_2nd+pin_3rd+pin_4th);
    }

    @And("User enters the same confirm pin")
    public void userEntersTheSameConfirmPin() {
        LoginPage.get_confirmpin_pinlogin().sendKeys(pin_1st+pin_2nd+pin_3rd+pin_4th);
    }


    @When("User clicks on submit button at pin setup screen")
    public void userClicksOnSubmitButtonAtPinSetupScreen() throws InterruptedException {
        LoginPage.get_submitbutton_pinlogin().click();
        Thread.sleep(8000);
    }

    @And("User clicks on back button at the top left")
    public void userClicksOnBackButtonAtTheTopLeft() throws InterruptedException {
        LoginPage.get_backbutton_topleft().click();
        Thread.sleep(2000);
    }


    @And("User clicks on logout button from settings panel")
    public void userClicksOnLogoutButtonFromSettingsPanel() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage.get_logoutbutton_settingspanel().click();
    }

    @And("User enters their correct pin")
    public void userEntersTheirCorrectPin() throws InterruptedException {
        LoginPage.enterpintologin(pin_1st).click();
        LoginPage.enterpintologin(pin_2nd).click();
        LoginPage.enterpintologin((pin_3rd)).click();
        LoginPage.enterpintologin(pin_4th).click();
        Thread.sleep(5000);

    }

    @And("User clicks on Forgot password")
    public void userClicksOnForgotPassword() {
        LoginPage.getforgotpassword_loginscreen().click();
    }

    @When("User enters a valid E-id")
    public void userEntersAValidEId() {
        LoginPage.getEIDField_forgotpasswordflow().sendKeys("784197848020307");
    }

    @And("User enters a valid phone number")
    public void userEntersAValidPhoneNumber() {
        LoginPage.getphonenumberfield_forgotpassword().sendKeys("123456789");
    }

    @When("User clicks on next button at forgot password page")
    public void userClicksOnNextButtonAtForgotPasswordPage() {
        LoginPage.getnextbutton_forgotpasswordfield().click();
    }

    @And("User enters valid OTP")
    public void userEntersValidOTP() {
        LoginPage.getotp1stdigit_forgotpasswordflow().sendKeys("666666");
    }

    @And("User clicks on next button at OTP screen")
    public void userClicksOnNextButtonAtOTPScreen() {
        LoginPage.getnextbutton_otpscreen().click();
    }

    @When("User enters valid new password")
    public void userEntersNewPassword() {
        LoginPage.getenternewpassword_forgotpassword().sendKeys("Password123!");
    }


    @And("User enters valid confirm new password")
    public void userEntersValidConfirmNewPassword() {
        LoginPage.getconfirmnewpassword_forgotpassword().sendKeys("Password123!");
    }


    @Then("User clicks on confirm button at forgot password page")
    public void userClicksOnConfirmButtonAtForgotPasswordPage() throws InterruptedException {
        LoginPage.getchangebutton_forgotpasswordflow().click();
        Thread.sleep(2000);
    }

    @And("User enters correct new password")
    public void userEntersCorrectNewPassword() {
        LoginPage.getpassword_mainscreen().sendKeys("Password123!");
    }
}
