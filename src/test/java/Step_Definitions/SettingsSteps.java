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
import static Tests.Useful_functions.*;

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

    String password_without_uppercase = getRandomString(true,true,false,true,false,20);
    String password_without_lowercase = getRandomString(true,false,true,true,false,20);

    String password_without_number = getRandomString(false,true,true,true,false,20);

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

    
}
