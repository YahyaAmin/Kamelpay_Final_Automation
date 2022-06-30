package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static Hooks.Base_Class.driver;

public class SettingsPage {

    public static String zip_code_field = "//android.view.ViewGroup[4]/android.widget.EditText";

    public static String click_out = "//android.widget.TextView[@text='Zip code']";
    public static String street_name = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String update2_button = "//android.widget.TextView[@text='Update']";

    public static String change_password_button = "//android.widget.TextView[@text='Change Password']";

    public static String street_number_field = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String building_number_field = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String update_button = "//android.widget.TextView[@text='UPDATE']";

    public static String enter_old_password_field = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String personal_information_button = "//android.widget.TextView[@text='Personal Information']";

    public static String enter_new_password_field = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String enter_confirm_password_field = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String view_password_button = "//android.view.ViewGroup[2]/android.widget.TextView";


    public SettingsPage() {}

    public static AndroidElement get_change_password_button(){return driver.findElement(By.xpath(change_password_button));}

    public static AndroidElement get_enter_old_password_field(){return driver.findElement(By.xpath(enter_old_password_field));}

    public static AndroidElement get_enter_new_password_field(){return driver.findElement(By.xpath(enter_new_password_field));}

    public static AndroidElement get_enter_confirm_password_field(){return driver.findElement(By.xpath(enter_confirm_password_field));}

    public static AndroidElement get_view_password_button(){return driver.findElement(By.xpath(view_password_button));}

    public static AndroidElement get_personal_information_button(){return driver.findElement(By.xpath(personal_information_button));}

    public static AndroidElement get_update_button(){return driver.findElement(By.xpath(update_button));}

    public static AndroidElement get_building_number_field(){return driver.findElement(By.xpath(building_number_field));}

    public static AndroidElement get_street_number_field(){return driver.findElement(By.xpath(street_number_field));}

    public static AndroidElement get_street_name(){return driver.findElement(By.xpath(street_name));}

    public static AndroidElement get_zip_code_field(){return driver.findElement(By.xpath(zip_code_field));}

    public static AndroidElement get_click_out(){return driver.findElement(By.xpath(click_out));}

    public static AndroidElement get_update2_button(){return driver.findElement(By.xpath(update2_button));}

}
