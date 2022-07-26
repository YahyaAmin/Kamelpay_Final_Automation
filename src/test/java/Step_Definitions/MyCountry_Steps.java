package Step_Definitions;
import Pages.Android.LoginPage;
import Pages.Android.MyCountry;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.CardManagementPage.centiv_card_at_homescreen;
import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;
import static Pages.Android.MyCountry.*;
import static Tests.Useful_functions.*;


public class MyCountry_Steps {

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


    @When("User clicks on MY country button")
    public void userClicksOnMYCountryButton() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(my_country_button)));
        MyCountry.get_my_country_button().click();
    }


    @And("User clicks on JazzCash at Popular Banks")
    public void userClicksOnJazzCashAtPopularBanks() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_for_popular_bank("JazzCash"))));
        MyCountry.get_wait_for_popular_bank("JazzCash").click();
    }

    @Then("User should see error message that this feature is only for PayD Card")
    public void userShouldSeeErrorMessageThatThisFeatureIsOnlyForPayDCard() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("User clicks on next button")
    public void userClicksOnNextButton() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage.getnextbutton_forgotpasswordfield().click();
    }

    @And("User scrolls down at My country page")
    public void userScrollsDownAtMyCountryPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wait_my_country_page)));
        scrollDown();
    }
}
