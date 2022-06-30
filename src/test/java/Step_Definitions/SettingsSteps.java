package Step_Definitions;

import Pages.Android.LoginPage;
import Pages.Android.SettingsPage;
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
import static Pages.Android.SettingsPage.*;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;
import static Tests.Useful_functions.scrollDown;


public class SettingsSteps {
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

    @Given("User clicks on settings button at the bottom right")
    public void userClicksOnSettingsButtonAtTheBottomRight() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(my_profile_button)));
        LoginPage.getmyprofilebutton().click();
    }

    @Then("User should be directed to the settings page")
    public void userShouldBeDirectedToTheSettingsPage() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Then("User should move back to main page")
    public void userShouldMoveBackToMainPage() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("User clicks on change password button")
    public void userClicksOnChangePasswordButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(change_password_button)));
        SettingsPage.get_change_password_button().click();
    }

    @And("User enters their old password")
    public void userEntersTheirOldPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_old_password_field)));
        SettingsPage.get_enter_old_password_field().sendKeys("Password123!");
    }

    @And("User enters their new password")
    public void userEntersTheirNewPassword() {
        SettingsPage.get_enter_new_password_field().sendKeys("Vista123!");
    }

    @When("User enters their confirm password")
    public void userEntersTheirConfirmPassword() {
        SettingsPage.get_enter_confirm_password_field().sendKeys("Vista123!");
    }

    @And("User clicks on view password button")
    public void userClicksOnViewPasswordButton() throws InterruptedException {
        SettingsPage.get_view_password_button().click();
        Thread.sleep(2300);
        SettingsPage.get_view_password_button().click();
    }

    @And("User enters their new password after changing password")
    public void userEntersTheirNewPasswordAfterChangingPassword() throws InterruptedException {
        LoginPage.getpassword_mainscreen().sendKeys("Vista123!");
        LoginPage.get_viewpassword_mainscreen().click();
        Thread.sleep(2000);
        LoginPage.get_viewpassword_mainscreen().click();
    }

    @And("User resets their password to original password")
    public void userResetsTheirPasswordToOriginalPassword() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(my_profile_button)));
        LoginPage.getmyprofilebutton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwords_and_biometrics_button)));
        LoginPage.getpasswordsandbiomterics().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(change_password_button)));
        SettingsPage.get_change_password_button().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_old_password_field)));
        SettingsPage.get_enter_old_password_field().sendKeys("Vista123!");
        SettingsPage.get_enter_new_password_field().sendKeys("Password123!");
        SettingsPage.get_enter_confirm_password_field().sendKeys("Password123!");
        SettingsPage.get_view_password_button().click();
        SettingsPage.get_view_password_button().click();
        Thread.sleep(1700);
        SettingsPage.get_view_password_button().click();
        LoginPage.get_submitbutton_pinlogin().click();
        Thread.sleep(9000);

    }

    @And("User leaves their old password empty")
    public void userLeavesTheirOldPasswordEmpty() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submit_button_on_setup_pin_page)));
        SettingsPage.get_enter_old_password_field().sendKeys("");
    }

    @And("User leaves their new password empty")
    public void userLeavesTheirNewPasswordEmpty() {
        SettingsPage.get_enter_new_password_field().sendKeys("");
    }

    @When("User leaves their confirm password empty")
    public void userLeavesTheirConfirmPasswordEmpty() {
        SettingsPage.get_enter_confirm_password_field().sendKeys("");
    }

    @Then("User shouldnt be able to change password")
    public void userShouldntBeAbleToChangePassword() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User enters an incorrect old password")
    public void userEntersAnIncorrectOldPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submit_button_on_setup_pin_page)));
        SettingsPage.get_enter_old_password_field().sendKeys(getRandomString(true,true,true,true,false,20));
    }

    String pin_less_than_4_digits = getRandomNumberLowerAndUpperBound(1,4);

    String password_without_uppercase = getRandomString(true,true,false,true,false,20);
    String password_without_lowercase = getRandomString(true,false,true,true,false,20);

    String password_without_number = getRandomString(false,true,true,true,false,20);

    String password_without_special_character = getRandomString(true,true,true,false,false,20);

    String password_with_spaces = getRandomString(true,true,true,true,true,20);

    String pin_with_spaces = getRandomString(true,false,false,false,true,4);

    String pin_with_special_characters = getRandomString(true,false,false,true,false,4);

    @And("User enters their new password without uppercase letters")
    public void userEntersTheirNewPasswordWithoutUppercaseLetters() {
        SettingsPage.get_enter_new_password_field().sendKeys(password_without_uppercase);
    }

    @When("User enters their confirm password without uppercase letters")
    public void userEntersTheirConfirmPasswordWithoutUppercaseLetters() {
        SettingsPage.get_enter_confirm_password_field().sendKeys(password_without_uppercase);
    }


    @And("User enters their new password without lowercase letters")
    public void userEntersTheirNewPasswordWithoutLowercaseLetters() {
        SettingsPage.get_enter_new_password_field().sendKeys(password_without_lowercase);
    }

    @When("User enters their confirm password without lowercase letters")
    public void userEntersTheirConfirmPasswordWithoutLowercaseLetters() {
        SettingsPage.get_enter_confirm_password_field().sendKeys(password_without_lowercase);
    }


    @And("User enters their new password without a number")
    public void userEntersTheirNewPasswordWithoutANumber() {
        SettingsPage.get_enter_new_password_field().sendKeys(password_without_number);
    }

    @When("User enters their confirm password without a number")
    public void userEntersTheirConfirmPasswordWithoutANumber() {
        SettingsPage.get_enter_confirm_password_field().sendKeys(password_without_number);
    }

    @And("User enters their new password without a special character")
    public void userEntersTheirNewPasswordWithoutASpecialCharacter() {
        SettingsPage.get_enter_new_password_field().sendKeys(password_without_special_character);
    }

    @When("User enters their confirm password without a special character")
    public void userEntersTheirConfirmPasswordWithoutASpecialCharacter() {
        SettingsPage.get_enter_confirm_password_field().sendKeys(password_without_special_character);
    }

    @And("User enters their new password with spaces")
    public void userEntersTheirNewPasswordWithSpaces() {
        SettingsPage.get_enter_new_password_field().sendKeys(password_with_spaces);
    }

    @When("User enters their confirm password with spaces")
    public void userEntersTheirConfirmPasswordWithSpaces() {
        SettingsPage.get_enter_confirm_password_field().sendKeys(password_with_spaces);
    }

    @And("User enters their new passwords")
    public void userEntersTheirNewPasswords() {
        SettingsPage.get_enter_new_password_field().sendKeys(getRandomString(true,true,true,true,false,20));
    }

    @When("User enters a different confirm passwords")
    public void userEntersADifferentConfirmPasswords() {
        SettingsPage.get_enter_confirm_password_field().sendKeys(getRandomString(true,true,true,true,false,20));
    }

    @When("User leaves pin empty")
    public void userLeavesPinEmpty() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));
        LoginPage.get_enternewpin_pinlogin().sendKeys("");
    }

    @And("User leaves confirm pin empty")
    public void userLeavesConfirmPinEmpty() {
        LoginPage.get_confirmpin_pinlogin().sendKeys("");
    }

    @Then("User shouldnt be able to change pin code")
    public void userShouldntBeAbleToChangePinCode() throws InterruptedException {
        Thread.sleep(3000);
    }

    @When("User enters their setup pin with less than four digits")
    public void userEntersTheirSetupPinWithLessThanFourDigits() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));
        LoginPage.get_enternewpin_pinlogin().sendKeys(pin_less_than_4_digits);
    }

    @And("User enters their setup confirm pin with less than four digits")
    public void userEntersTheirSetupConfirmPinWithLessThanFourDigits() {
        LoginPage.get_confirmpin_pinlogin().sendKeys(pin_less_than_4_digits);
    }

    @When("User enters their setup pin but pin has spaces")
    public void userEntersTheirSetupPinButPinHasSpaces() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));
        LoginPage.get_enternewpin_pinlogin().sendKeys(pin_with_spaces);
    }

    @And("User enters their setup confirm pin but pin has spaces")
    public void userEntersTheirSetupConfirmPinButPinHasSpaces() {
        LoginPage.get_confirmpin_pinlogin().sendKeys(pin_with_spaces);
    }

    @When("User enters their setup pin but pin has special characters")
    public void userEntersTheirSetupPinButPinHasSpecialCharacters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));
        LoginPage.get_enternewpin_pinlogin().sendKeys(pin_with_special_characters);
    }

    @And("User enters their setup confirm pin but pin has special characters")
    public void userEntersTheirSetupConfirmPinButPinHasSpecialCharacters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));
        LoginPage.get_confirmpin_pinlogin().sendKeys(pin_with_special_characters);
    }

    @And("User enters a different confirm pin at setup pin")
    public void userEntersADifferentConfirmPinAtSetupPin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));
        LoginPage.get_confirmpin_pinlogin().sendKeys(getRandomNumberLowerAndUpperBound(4,5));
    }

    @When("User clicks on personal information button")
    public void userClicksOnPersonalInformationButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(personal_information_button)));
        SettingsPage.get_personal_information_button().click();
    }

    @And("User clicks on update button")
    public void userClicksOnUpdateButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(update_button)));
        SettingsPage.get_update_button().click();
    }

    @When("User enters a new building number")
    public void userEntersANewBuildingNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(building_number_field)));
        SettingsPage.get_building_number_field().clear();
        SettingsPage.get_building_number_field().sendKeys(getRandomNumberLowerAndUpperBound(1,4));
    }


    @And("User enters their street number")
    public void userEntersTheirStreetNumber() {
        SettingsPage.get_street_number_field().clear();
        SettingsPage.get_street_number_field().sendKeys(getRandomNumberLowerAndUpperBound(1,4));
    }

    @When("User enters their street name")
    public void userEntersTheirStreetName() {
        SettingsPage.get_street_name().clear();
        SettingsPage.get_street_name().sendKeys(getRandomString(false,true,true,false,true,10));
    }

    @And("User enters a zip code")
    public void userEntersAZipCode() {
        SettingsPage.get_zip_code_field().clear();
        SettingsPage.get_zip_code_field().sendKeys(getRandomNumberLowerAndUpperBound(1,6));
        SettingsPage.get_click_out().click();
    }

    @When("User clicks on the update button")
    public void userClicksOnTheUpdateButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(update2_button)));
        SettingsPage.get_update2_button().click();

    }

    @Then("User info should be updated")
    public void userInfoShouldBeUpdated() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(update_button)));
        Thread.sleep(1500);
        scrollDown();
        Thread.sleep(1500);
    }

    @When("User leaves their street name empty")
    public void userLeavesTheirStreetNameEmpty() {
        SettingsPage.get_street_name().clear();
    }

    @And("User leaves their zip code empty")
    public void userLeavesTheirZipCodeEmpty() {
        SettingsPage.get_zip_code_field().clear();
        SettingsPage.get_click_out().click();
    }

    @Then("User info should not be updated")
    public void userInfoShouldNotBeUpdated() throws InterruptedException {
        Thread.sleep(2000);
    }
}
