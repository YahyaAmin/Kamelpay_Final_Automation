package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static Hooks.Base_Class.driver;


public class MobileTopUpPage {

    public static String next_button = "//android.widget.TextView[@text='Next']";
    public static String pay_now_button = "//android.widget.TextView[@text='Pay Now']";

    public static String first_service_provider = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]";
    public static String mobile_topup_button = "//android.widget.TextView[@text='Mobile Topup']";

    public static String add_topup_button = "//android.widget.TextView[@text='Add Topup']";

    public static String second_recharge_package = "//android.widget.TextView[@text='20.00 AED Recharge']";

    public static String phone_number_field_at_mobile_topup = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String agree_terms_checkbox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]";

    public static String save_account_to_beneficary = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public MobileTopUpPage(){}


    public static AndroidElement get_mobile_topup_button(){return driver.findElement(By.xpath(mobile_topup_button));}

    public static AndroidElement get_add_topup_button(){return driver.findElement(By.xpath(add_topup_button));}

    public static AndroidElement get_phone_number_field_at_mobile_topup(){return driver.findElement(By.xpath(phone_number_field_at_mobile_topup));}

    public static AndroidElement get_first_service_provider(){return driver.findElement(By.xpath(first_service_provider));}

    public static AndroidElement get_second_recharge_package(){return driver.findElement(By.xpath(second_recharge_package));}

    public static AndroidElement get_agree_terms_checkbox(){return driver.findElement(By.xpath(agree_terms_checkbox));}

    public static AndroidElement get_pay_now_button(){return driver.findElement(By.xpath(pay_now_button));}

    public static AndroidElement get_next_button(){return driver.findElement(By.xpath(next_button));}

    public static AndroidElement get_save_account_to_beneficary(){return driver.findElement(By.xpath(save_account_to_beneficary));}

}
