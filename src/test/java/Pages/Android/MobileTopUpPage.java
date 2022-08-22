package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static Hooks.Base_Class.driver;


public class MobileTopUpPage {

    public static String top_up_etisalat_button = "//android.widget.TextView[@text='Top Up Etisalat']";
    public static String top_up_du_prepaid_button = "//android.widget.TextView[@text='Top Up Du']";
    public static String search_existing_beneficiaries = "//android.widget.EditText";

    public static String search_service_providers = "//android.widget.EditText";
    public static String  wait_country = "//android.widget.TextView[@text='Pakistan']";
    public static String next_button = "//android.widget.TextView[@text='Next']";
    public static String pay_now_button = "//android.widget.TextView[@text='Pay Now']";

    public static String second_service_provider = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[1]";
    public static String search_country = "//android.widget.EditText";
    public static String first_service_provider = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]";
    public static String mobile_topup_button = "//android.widget.TextView[@text='Mobile Topup']";

    public static String add_topup_button = "//android.widget.TextView[@text='Add Topup']";

    public static String existing_beneficary = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup";

    public static String recharge_package_for_existing_beneficiary = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
    public static String second_recharge_package = "//android.view.ViewGroup[3]/android.widget.TextView";

    public static String phone_number_field_at_mobile_topup = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String agree_terms_checkbox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]";

    public static String save_account_to_beneficary = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public static String country_selector_function(String user_defined_country) {return "//android.widget.TextView[@text='"+user_defined_country + "']";}

    public static String country_code = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup";

    public MobileTopUpPage(){}


    public static AndroidElement get_mobile_topup_button(){return driver.findElement(By.xpath(mobile_topup_button));}

    public static AndroidElement get_add_topup_button(){return driver.findElement(By.xpath(add_topup_button));}

    public static AndroidElement get_phone_number_field_at_mobile_topup(){return driver.findElement(By.xpath(phone_number_field_at_mobile_topup));}

    public static AndroidElement get_first_service_provider(){return driver.findElement(By.xpath(first_service_provider));}

    public static AndroidElement get_second_recharge_package(String amount){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+amount+" AED Data Recharge']"));}

    public static String get_country_xpath(String amount){return "//android.widget.TextView[@text='"+amount+" AED Data Recharge']";}

    public static AndroidElement get_agree_terms_checkbox(){return driver.findElement(By.xpath(agree_terms_checkbox));}

    public static AndroidElement get_pay_now_button(){return driver.findElement(By.xpath(pay_now_button));}

    public static AndroidElement get_next_button(){return driver.findElement(By.xpath(next_button));}

    public static AndroidElement get_save_account_to_beneficary(){return driver.findElement(By.xpath(save_account_to_beneficary));}

    public static AndroidElement get_country_code(){return driver.findElement(By.xpath(country_code));}

    public static AndroidElement get_search_country(){return driver.findElement(By.xpath(search_country));}

    public static AndroidElement get_country(String country){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+country+"']"));}

    public static AndroidElement get_existing_beneficary(){return driver.findElement(By.xpath(existing_beneficary));}

    public static AndroidElement get_search_existing_beneficiaries(){return driver.findElement(By.xpath(search_existing_beneficiaries));}

    public static AndroidElement get_search_service_providers(){return driver.findElement(By.xpath(search_service_providers));}

    public static AndroidElement get_country_selector_function(String user_defined_country){return driver.findElement(By.xpath(country_selector_function(user_defined_country)));}

    public static AndroidElement get_rechrg_package(){return driver.findElement(By.xpath(second_recharge_package));}

    public static AndroidElement get_recharge_package_for_existing_beneficiary(){return driver.findElement(By.xpath(recharge_package_for_existing_beneficiary));}

    public static AndroidElement get_top_up_du_prepaid_button(){return driver.findElement(By.xpath(top_up_du_prepaid_button));}

    public static AndroidElement get_top_up_etisalat_button(){return driver.findElement(By.xpath(top_up_etisalat_button));}

    public static AndroidElement get_second_service_provider(){return driver.findElement(By.xpath(second_service_provider));}

}
