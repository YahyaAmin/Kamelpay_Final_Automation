package Step_Definitions;

import Pages.Android.LoginPage;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.LoginPage.*;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;


public class LoginSteps {

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


    @Given("User is on Login Page")
    public void user_is_on_login_page() throws InterruptedException {
        Thread.sleep(4000);
    }

    @When("User enters correct phone number")
    public void userEntersUsernameAndPassword() {
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_no_on_mainscreen)));
         LoginPage.getphone_no_mainscreen().sendKeys("505636092");
    }


    @And("User enters correct password")
    public void userEntersCorrectPassword() throws InterruptedException {
        LoginPage.getpassword_mainscreen().sendKeys("Password123!");
        LoginPage.get_viewpassword_mainscreen().click();
        Thread.sleep(2000);
        LoginPage.get_viewpassword_mainscreen().click();
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage.getlogin_button_mainscreen().click();
    }

    @And("User clicks on dont allow biometric button")
    public void userClicksOnDontAllowBiometricButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dont_allow_biometric_button_xpath)));
        LoginPage.get_dontallow_biometric_button().click();
        Thread.sleep(2000);
    }

    @Then("User should successfully login")
    public void userShouldSuccessfullyLogin() throws InterruptedException {
        Thread.sleep(2000);
    }


    @And("User clicks on sidebar menu")
    public void userClicksOnSidebarMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(three_lines_home_button_at_homescreen)));
        LoginPage.get_sidebar_button().click();

    }


    @When("User clicks on settings from sidebar menu")
    public void userClicksOnSettingsFromSidebarMenu() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(settings_button_sidebar)));
        LoginPage.get_settingsbutton_sidebar().click();
        Thread.sleep(2000);
    }

    @And("User clicks on setup pin login button")
    public void userClicksOnSetupPinLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(setup_pin_login_button)));
        LoginPage.getsetuppinloginbutton().click();

    }

    public String pin_1st = getRandomNumberLowerAndUpperBound(1,2);
    public String pin_2nd = getRandomNumberLowerAndUpperBound(1,2);
    public String pin_3rd = getRandomNumberLowerAndUpperBound(1,2);
    public String pin_4th = getRandomNumberLowerAndUpperBound(1,2);

    @When("User enters pin to setup pin")
    public void userEntersPinToSetupPin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));
        LoginPage.get_enternewpin_pinlogin().sendKeys(pin_1st+pin_2nd+pin_3rd+pin_4th);
    }

    @And("User enters the same confirm pin")
    public void userEntersTheSameConfirmPin() {
        LoginPage.get_confirmpin_pinlogin().sendKeys(pin_1st+pin_2nd+pin_3rd+pin_4th);
    }


    @When("User clicks on submit button at pin setup screen")
    public void userClicksOnSubmitButtonAtPinSetupScreen() throws InterruptedException {
        LoginPage.get_submitbutton_pinlogin().click();
        Thread.sleep(9000);
    }

    @And("User clicks on back button at the top left")
    public void userClicksOnBackButtonAtTheTopLeft() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(back_button_top_left)));
        LoginPage.get_backbutton_topleft().click();
    }


    @And("User clicks on logout button from settings panel")
    public void userClicksOnLogoutButtonFromSettingsPanel() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logout_button_settings_panel)));
        LoginPage.get_logoutbutton_settingspanel().click();
    }

    @And("User enters their correct pin")
    public void userEntersTheirCorrectPin() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_for_entering_correct_pin_screen)));
        LoginPage.enterpintologin(pin_1st).click();
        LoginPage.enterpintologin(pin_2nd).click();
        LoginPage.enterpintologin((pin_3rd)).click();
        LoginPage.enterpintologin(pin_4th).click();

    }

    @And("User clicks on Forgot password")
    public void userClicksOnForgotPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(forgot_password_at_login_screen)));
        LoginPage.getforgotpassword_loginscreen().click();
    }

    @When("User enters a valid E-id")
    public void userEntersAValidEId() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e_id_field_at_forgot_password_screen)));
        LoginPage.getEIDField_forgotpasswordflow().clear();
        LoginPage.getEIDField_forgotpasswordflow().sendKeys("784197848020307");
    }

    @And("User enters a valid phone number")
    public void userEntersAValidPhoneNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_forgot_password_screen)));
        LoginPage.getphonenumberfield_forgotpassword().clear();
        LoginPage.getphonenumberfield_forgotpassword().sendKeys("505636092");
    }

    @When("User clicks on next button at forgot password page")
    public void userClicksOnNextButtonAtForgotPasswordPage() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage.getnextbutton_forgotpasswordfield().click();
    }

    @And("User enters valid OTP")
    public void userEntersValidOTP() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_1st_digit_at_forgot_password_flow)));
        LoginPage.getotp1stdigit_forgotpasswordflow().sendKeys("666666");
    }

    @And("User clicks on next button at OTP screen")
    public void userClicksOnNextButtonAtOTPScreen() throws InterruptedException {
        LoginPage.getnextbutton_otpscreen().click();
        Thread.sleep(2000);
    }

    @When("User enters valid new password")
    public void userEntersNewPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_password_forgot_password_flow)));
        LoginPage.getenternewpassword_forgotpassword().sendKeys("Vista123!");
    }


    @And("User enters valid confirm new password")
    public void userEntersValidConfirmNewPassword() throws InterruptedException {
        LoginPage.getconfirmnewpassword_forgotpassword().sendKeys("Vista123!");
        LoginPage.getview_password_forgot_password_flow().click();
        Thread.sleep(2000);
        LoginPage.getview_password_forgot_password_flow().click();
    }


    @Then("User clicks on confirm button at forgot password page")
    public void userClicksOnConfirmButtonAtForgotPasswordPage() throws InterruptedException {
        LoginPage.getchangebutton_forgotpasswordflow().click();
        Thread.sleep(2000);
    }

    @And("User enters correct new password")
    public void userEntersCorrectNewPassword() {
        LoginPage.getpassword_mainscreen().sendKeys("Vista123!");
    }


    @When("User enters incorrect phone number")
    public void userEntersIncorrectPhoneNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_no_on_mainscreen)));
        LoginPage.getphonenumberfield_forgotpassword().clear();
        LoginPage.getphonenumberfield_forgotpassword().sendKeys(getRandomNumberLowerAndUpperBound(5,10));
    }

    @Then("User shouldn't be able to login")
    public void userShouldnTBeAbleToLogin() throws InterruptedException {
        Thread.sleep(4000);
    }

    @And("User enters incorrect password")
    public void userEntersIncorrectPassword() throws InterruptedException {

        LoginPage.getpassword_mainscreen().sendKeys(getRandomString(true, true, true,true,false,10));
        LoginPage.get_viewpassword_mainscreen().click();
        Thread.sleep(3000);
        LoginPage.get_viewpassword_mainscreen().click();

    }

    @And("User enters incorrect pin for login")
    public void userEntersIncorrectPinForLogin() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_for_entering_correct_pin_screen)));
        LoginPage.enterpintologin(getRandomNumberLowerAndUpperBound(1,2)).click();
        LoginPage.enterpintologin(getRandomNumberLowerAndUpperBound(1,2)).click();
        LoginPage.enterpintologin((getRandomNumberLowerAndUpperBound(1,2))).click();
        LoginPage.enterpintologin(getRandomNumberLowerAndUpperBound(1,2)).click();
        Thread.sleep(5000);

    }

    @Then("User shouldn't be able to change password")
    public void userShouldnTBeAbleToChangePassword() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Then("User clicks on cant login button")
    public void userClicksOnCantLoginButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cant_login_button_on_pin_login_screen)));
        LoginPage.getcantloginbutton_enterpinscreen().click();
        Thread.sleep(1000);
    }


    @And("User clicks on skip button")
    public void userClicksOnSkipButton() throws InterruptedException {
        Thread.sleep(1300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(skip_button)));
        LoginPage.getskipbutton().click();
    }

    @And("User clicks on My Profile button")
    public void userClicksOnMyProfileButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(my_profile_button)));
        LoginPage.getmyprofilebutton().click();
    }

    @When("User clicks on Passwords and Biometrics Button")
    public void userClicksOnPasswordsAndBiometricsButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwords_and_biometrics_button)));
        LoginPage.getpasswordsandbiomterics().click();
    }

    @And("User clicks on logout button")
    public void userClicksOnLogoutButton() throws InterruptedException {
        Thread.sleep(1500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logout_button)));
        LoginPage.getlogoutbutton().click();
    }

    @Then("User resets password to original password")
    public void userResetsPasswordToOriginalPassword() throws InterruptedException {
        LoginPage.getmyprofilebutton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwords_and_biometrics_button)));
        LoginPage.getpasswordsandbiomterics().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(change_password_button_settings)));
        LoginPage.get_changepasswordbutton_settings().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(old_password_field_at_change_password)));
        LoginPage.get_old_password_field_at_change_password().sendKeys("Vista123!");
        LoginPage.get_new_password_field_at_change_password().sendKeys("Password123!");
        LoginPage.get_enter_confirm_password_field().sendKeys("Password123!");
        LoginPage.get_submitbutton_pinlogin().click();
        Thread.sleep(3000);


    }


    @And("User enters valid last four digits of their card")
    public void userEntersValidLastFourDigitsOfTheirCard() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(last_four_card_digits_forgot_password_flow)));
        Thread.sleep(500);
        get_last_four_card_digits_forgot_password_flow().sendKeys("0123");
    }


    @When("User enters their valid E-id")
    public void userEntersTheirValidEId() {
        LoginPage.get_eid_field_forgot_pass().sendKeys("784197848020307");
    }
}
