package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.Android.CardManagementPage;
import static Hooks.Base_Class.driver;
import static Pages.Android.CardManagementPage.*;

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
}
