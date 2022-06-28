package Step_Definitions;

import Pages.Android.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.Android.CardManagementPage;

import java.time.Duration;

import static Hooks.Base_Class.driver;
import static Pages.Android.CardManagementPage.*;
import static Tests.Useful_functions.*;

public class CardManagement_Steps {

    public WebDriverWait wait = new WebDriverWait(driver, 30);
    @Given("User clicks on card management button")
    public void userClicksOnCardManagementButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(card_management_button)));
        CardManagementPage.get_card_management_button().click();
    }

    @Then("User should be redirected to home page")
    public void userShouldBeRedirectedToHomePage() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User clicks on Whatsapp customer support button")
    public void userClicksOnWhatsappCustomerSupportButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(whatsapp_button)));
        CardManagementPage.get_whatsappbutton().click();
    }

    @Then("User should be redirected to Whatsapp customer support")
    public void userShouldBeRedirectedToWhatsappCustomerSupport() throws InterruptedException {
        Thread.sleep(3000);
        driver.runAppInBackground(Duration.ofSeconds(-1));
    }

    @Given("User clicks on Centiv card")
    public void userClicksOnCentivCard() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(centiv_card_at_homescreen)));
        CardManagementPage.get_centiv_card_at_homescreen().click();
        Thread.sleep(2000);
    }

    @When("User scrolls to the right")
    public void userScrollsToTheRight() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(card_management_button)));
        scrollRight();
    }

    @And("User clicks on Payd card")
    public void userClicksOnPaydCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payd_card_homescreen)));
        CardManagementPage.get_payd_card_homescreen().click();
    }

    @Then("User should move to card management page")
    public void userShouldMoveToCardManagementPage() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User clicks on change pin button at card management screen")
    public void userClicksOnChangePinButtonAtCardManagementScreen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(change_pin_card_management)));
        CardManagementPage.get_changepin_cardmanagement().click();
    }

    @When("User scrolls down")
    public void userScrollsDown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(centiv_card_at_homescreen)));
        scrollDown();
    }

    String pin_for_card_1st = getRandomNumberLowerAndUpperBound(1,2);
    String pin_for_card_2nd = getRandomNumberLowerAndUpperBound(1,2);
    String pin_for_card_3rd = getRandomNumberLowerAndUpperBound(1,2);
    String pin_for_card_4th = getRandomNumberLowerAndUpperBound(1,2);

    @When("User enters a new valid pin for card")
    public void userEntersANewValidPinForCard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_for_card)));
        CardManagementPage.get_enter_new_pin_for_card().sendKeys(pin_for_card_1st+pin_for_card_2nd+pin_for_card_3rd+pin_for_card_4th);
    }

    @And("User enters correct new confirm pin")
    public void userEntersCorrectNewConfirmPin() {
        CardManagementPage.get_confirm_new_pin_for_card().sendKeys(pin_for_card_1st+pin_for_card_2nd+pin_for_card_3rd+pin_for_card_4th);
    }

    @When("User clicks on next button change pin screen")
    public void userClicksOnNextButtonChangePinScreen() {
        CardManagementPage.get_next_button().click();
    }

    @Then("Card pin should change successfully")
    public void cardPinShouldChangeSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
    }

    @When("User enters valid OTP after card management")
    public void userEntersValidOTPAfterCardManagement() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_1st_at_card_management)));
        CardManagementPage.get_otp_1st_at_card_management().sendKeys("666666");
    }

    @Then("User shouldnt be able to change pin")
    public void userShouldntBeAbleToChangePin() throws InterruptedException {
        LoginPage.getnextbutton_otpscreen().click();
        Thread.sleep(3000);
    }

    @When("User leaves OTP empty at card management")
    public void userLeavesOTPEmptyAtCardManagement() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_1st_at_card_management)));
        CardManagementPage.get_otp_1st_at_card_management().sendKeys("");
    }

    @When("User enters OTP less than six digits")
    public void userEntersOTPLessThanSixDigits() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_1st_at_card_management)));
        CardManagementPage.get_otp_1st_at_card_management().sendKeys(getRandomNumberLowerAndUpperBound(1,6));
    }

    @When("User enters invalid OTP")
    public void userEntersInvalidOTP() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp_1st_at_card_management)));
        CardManagementPage.get_otp_1st_at_card_management().sendKeys(getRandomNumberLowerAndUpperBound(6,7));
    }

}
