package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static Hooks.Base_Class.driver;


public class MobileTopUpPage {

    public static String pay_now_button = "//android.widget.TextView[@text='Pay Now']";

    public static String first_service_provider = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";
    public static String mobile_topup_button = "//android.widget.TextView[@text='Mobile Topup']";

    public static String add_topup_button = "//android.widget.TextView[@text='Add Topup']";

    public static String second_recharge_package = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public static String phone_number_field_at_mobile_topup = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String agree_terms_checkbox = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]";

    public MobileTopUpPage(){}


    public static AndroidElement get_mobile_topup_button(){return driver.findElement(By.xpath(mobile_topup_button));}

    public static AndroidElement get_add_topup_button(){return driver.findElement(By.xpath(add_topup_button));}

    public static AndroidElement get_phone_number_field_at_mobile_topup(){return driver.findElement(By.xpath(phone_number_field_at_mobile_topup));}

    public static AndroidElement get_first_service_provider(){return driver.findElement(By.xpath(first_service_provider));}

    public static AndroidElement get_second_recharge_package(){return driver.findElement(By.xpath(second_recharge_package));}

    public static AndroidElement get_agree_terms_checkbox(){return driver.findElement(By.xpath(agree_terms_checkbox));}

    public static AndroidElement get_pay_now_button(){return driver.findElement(By.xpath(pay_now_button));}

}
