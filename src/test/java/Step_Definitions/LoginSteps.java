package Step_Definitions;

import Pages.Android.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class LoginSteps  {



    @Given("User is on Login Page")
    public void user_is_on_login_page() throws InterruptedException {
        Thread.sleep(4000);
        LoginPage.getlogin_button_mainscreen().click();
        Thread.sleep(3000);
        LoginPage.getlogin_button_mainscreen().click();
        System.out.println("abc");
    }

    @When("User enters username and password")
    public void userEntersUsernameAndPassword() {
        System.out.println("b");
    }
}
