package Step_Definitions;

import Pages.Android.SendMoneyPage;
import Pages.Android.SignupPage;
import Tests.Password_Builder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;
import static Pages.Android.CardManagementPage.payd_card_homescreen;
import static Pages.Android.SendMoneyPage.*;


public class SendMoney_Steps {

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

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    @And("User clicks on Send Money Button")
    public void userClicksOnSendMoneyButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payd_card_homescreen)));
        SendMoneyPage.get_send_money_button().click();
    }

    @And("User clicks on Send Money at Send Money screen")
    public void userClicksOnSendMoneyAtSendMoneyScreen() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(add_new_beneficiary)));
        SendMoneyPage.get_send_money_button().click();
    }

    public String searched_country = "Pakistan";

    @When("User searches for country")
    public void userSearchesForCountry() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(click_outside_on_send_money)));
        SendMoneyPage.get_search_for_country_send_money().sendKeys(searched_country);
    }

    @And("User clicks on country they searched for")
    public void userClicksOnCountryTheySearchedFor() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_county_wait(searched_country))));
        SendMoneyPage.searched_country_locator(searched_country).click();
    }
}
