package Step_Definitions;

import Pages.Android.PayBill;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Hooks.Base_Class.driver;
import static Pages.Android.MobileTopUpPage.mobile_topup_button;
import static Pages.Android.PayBill.*;



public class PayBill_Steps {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    @Given("User clicks on utility bills")
    public void userClicksOnUtilityBills() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_topup_button)));
        PayBill.get_pay_bill_button().click();
    }

    @And("User clicks on pay new bill button")
    public void userClicksOnPayNewBillButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pay_new_bill_button)));
        Thread.sleep(1000);
        PayBill.get_pay_new_bill_button().click();
    }

    @When("User searches for country at Pay Bill")
    public void userSearchesForCountryAtPayBill() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_country_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_search_country_at_pay_bill().sendKeys("India");
    }

    @And("User clicks on the searched country at Pay Bill")
    public void userClicksOnTheSearchedCountryAtPayBill() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searched_country_at_pay_bill("India"))));
        PayBill.get_searched_country_at_pay_bill("India").click();
    }

    @And("User clicks on Utility button at bill type")
    public void userClicksOnUtilityButtonAtBillType() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(utility_button)));
        Thread.sleep(1000);
        PayBill.get_utility_button().click();
    }

    @When("User searches for company")
    public void userSearchesForCompany() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search_field_at_pay_utility)));
        Thread.sleep(1000);
        PayBill.get_search_field_at_pay_utility().sendKeys("KSEB");
    }

    @And("User clicks on the first country in the list")
    public void userClicksOnTheFirstCountryInTheList() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_company_in_list)));
        Thread.sleep(1000);
        PayBill.get_first_company_in_list().click();
    }

    @And("User enters their valid mobile number of KSEB")
    public void userEntersTheirValidMobileNumberOfKSEB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobile_number_field_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_mobile_number_field_at_pay_bill().sendKeys("9012345678");
    }

    @When("User enters consumer number of KSEB")
    public void userEntersConsumerNumberOfKSEB() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(consumer_number_at_pay_bill)));
        Thread.sleep(1000);
        PayBill.get_consumer_number_at_pay_bill().sendKeys("1234567890123");
    }

    @Then("User should move to bill is past")
    public void userShouldMoveToBillIsPast() throws InterruptedException {
        Thread.sleep(3000);
    }
}
