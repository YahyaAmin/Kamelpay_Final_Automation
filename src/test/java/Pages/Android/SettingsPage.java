package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static Hooks.Base_Class.driver;

public class SettingsPage {


    public static String change_password_button = "//android.widget.TextView[@text='Change Password']";

    public static String enter_old_password_field = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String enter_new_password_field = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String enter_confirm_password_field = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String view_password_button = "//android.view.ViewGroup[2]/android.widget.TextView";


    public SettingsPage() {}

    public static AndroidElement get_change_password_button(){return driver.findElement(By.xpath(change_password_button));}

    public static AndroidElement get_enter_old_password_field(){return driver.findElement(By.xpath(enter_old_password_field));}

    public static AndroidElement get_enter_new_password_field(){return driver.findElement(By.xpath(enter_new_password_field));}

    public static AndroidElement get_enter_confirm_password_field(){return driver.findElement(By.xpath(enter_confirm_password_field));}

    public static AndroidElement get_view_password_button(){return driver.findElement(By.xpath(view_password_button));}


}
