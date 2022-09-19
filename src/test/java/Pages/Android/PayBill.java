package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static Hooks.Base_Class.driver;


public class PayBill {

    public static String apply_button = "//android.widget.TextView[@text='Apply']";
    public static String promo_code_field = "//android.widget.EditText";
    public static String add_account_to_beneficiary_button = "//android.view.ViewGroup/android.view.ViewGroup[4]";
    public static String reference_number_hesco = "//android.widget.EditText";
    public static String mobile_number_field_zong = "//android.widget.EditText";

    public static String zong_recharge_package = "//android.widget.TextView[@text='Zong USD $1 (PKR 119)']";
    public static String get_recharge_usd(String amount){return "//android.widget.TextView[@text='"+amount+"']";}
    public static String zong_prepaid_button = "//android.widget.TextView[@text='Zong Prepaid']";
    public static String mobile_prepaid_button = "//android.widget.TextView[@text='Mobile Prepaid']";
    public static String reference_number_LESCO = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String wait_gujarat = "//android.widget.TextView[@text='Bill Due Date']";
    public static String mobile_number_aavantika = "//android.view.ViewGroup[3]/android.widget.EditText";
    public static String pampanga_button = "//android.widget.TextView[@text='Pampanga I Electric Cooperative Inc.']";
    public static String cignal_tv_button = "//android.widget.TextView[@text='Cignal TV']";
    public static String otp_first_digit_pay_bill = "//android.view.ViewGroup[1]/android.widget.EditText";
    public static String agree_terms_and_conditions_cignal_tv = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]";

    public static String enter_amount_field_cignal_tv = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String account_number_field_cignal_tv = "//android.view.ViewGroup[3]/android.widget.EditText";
    public static String subscriber_name_field = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String subscriber_name_field_cignal_tv = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String utility_button = "//android.widget.TextView[@text='Utility']";

    public static String account_number_field_pampanga = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String mobile_number_field_tata_power = "//android.view.ViewGroup[3]/android.widget.EditText";
    public static String consumer_number_tata_power = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String search_field_at_pay_utility = "//android.widget.EditText";
    public static String pay_bill_button = "//android.widget.TextView[@text='Utility Bills']";

    public static String pay_new_bill_button = "//android.widget.TextView[@text='Pay Bills']";

    public static String pay_bill = "//android.widget.TextView[@text='Pay New Bill']";

    public static String search_country_at_pay_bill = "//android.widget.EditText";

    public static String consumer_number_at_pay_bill = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String mobile_number_field_at_pay_bill = "//android.view.ViewGroup[3]/android.widget.EditText";
    public static String first_company_in_list = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    public static String customer_number_field = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String searched_country_at_pay_bill(String country){return "//android.widget.TextView[@text='"+country+"']";}

    public static String beneficiary_name_field = "//android.view.ViewGroup[5]/android.widget.EditText";

    public PayBill(){}

    public static AndroidElement get_pay_bill_button(){return driver.findElement(By.xpath(pay_bill_button));}

    public static AndroidElement get_search_country_at_pay_bill(){return driver.findElement(By.xpath(search_country_at_pay_bill));}
    public static AndroidElement get_pay_new_bill_button(){return driver.findElement(By.xpath(pay_new_bill_button));}

    public static AndroidElement get_searched_country_at_pay_bill(String country){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+country+"']"));}

    public static AndroidElement get_utility_button(){return driver.findElement(By.xpath(utility_button));}

    public static AndroidElement get_search_field_at_pay_utility(){return driver.findElement(By.xpath(search_field_at_pay_utility));}

    public static AndroidElement get_first_company_in_list(){return driver.findElement(By.xpath(first_company_in_list));}

    public static AndroidElement get_mobile_number_field_at_pay_bill(){return driver.findElement(By.xpath(mobile_number_field_at_pay_bill));}

    public static AndroidElement get_consumer_number_at_pay_bill(){return driver.findElement(By.xpath(consumer_number_at_pay_bill));}

    public static AndroidElement get_consumer_number_tata_power(){return driver.findElement(By.xpath(consumer_number_tata_power));}

    public static AndroidElement get_mobile_number_field_tata_power(){return driver.findElement(By.xpath(mobile_number_field_tata_power));}

    public static AndroidElement get_subscriber_name_field(){return driver.findElement(By.xpath(subscriber_name_field));}

    public static AndroidElement get_account_number_field_cignal_tv(){return driver.findElement(By.xpath(account_number_field_cignal_tv));}

    public static AndroidElement get_enter_amount_field_cignal_tv(){return driver.findElement(By.xpath(enter_amount_field_cignal_tv));}

    public static AndroidElement get_agree_terms_and_conditions_cignal_tv(){return driver.findElement(By.xpath(agree_terms_and_conditions_cignal_tv));}

    public static AndroidElement get_otp_first_digit_pay_bill(){return driver.findElement(By.xpath(otp_first_digit_pay_bill));}

    public static AndroidElement get_cignal_tv_button(){return driver.findElement(By.xpath(cignal_tv_button));}

    public static AndroidElement get_pampanga_button(){return driver.findElement(By.xpath(pampanga_button));}

    public static AndroidElement get_customer_number_field(){return driver.findElement(By.xpath(customer_number_field));}

    public static AndroidElement get_mobile_number_aavantika(){return driver.findElement(By.xpath(mobile_number_aavantika));}

    public static AndroidElement get_wait_gujarat(){return driver.findElement(By.xpath(wait_gujarat));}

    public static AndroidElement get_reference_number_LESCO(){return driver.findElement(By.xpath(reference_number_LESCO));}

    public static AndroidElement get_mobile_prepaid_button(){return driver.findElement(By.xpath(mobile_prepaid_button));}

    public static AndroidElement get_zong_prepaid_button(){return driver.findElement(By.xpath(zong_prepaid_button));}

    public static AndroidElement get_get_recharge_usd(String amount){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+amount+"Zong USD $1 (PKR 119)']"));}

    public static AndroidElement get_mobile_number_field_zong(){return driver.findElement(By.xpath(mobile_number_field_zong));}

    public static AndroidElement get_reference_number_hesco(){return driver.findElement(By.xpath(reference_number_hesco));}

    public static AndroidElement get_add_account_to_beneficiary_button(){return driver.findElement(By.xpath(add_account_to_beneficiary_button));}

    public static AndroidElement get_beneficiary_name_field(){return driver.findElement(By.xpath(beneficiary_name_field));}

    public static AndroidElement get_promo_code_field(){return driver.findElement(By.xpath(promo_code_field));}

    public static AndroidElement get_apply_button(){return driver.findElement(By.xpath(apply_button));}

    public static AndroidElement get_pay_bill(){return driver.findElement(By.xpath(pay_bill));}

    public static AndroidElement get_account_number_field_pampanga(){return driver.findElement(By.xpath(account_number_field_pampanga)); }

    public static AndroidElement get_zong_recharge_package(){return driver.findElement(By.xpath(zong_recharge_package));}

    public static AndroidElement get_subscriber_name_field_cignal_tv(){return driver.findElement(By.xpath(subscriber_name_field_cignal_tv));}

}
