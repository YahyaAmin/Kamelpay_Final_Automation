package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static Hooks.Base_Class.driver;


public class SendMoneyPage {

    public static String other_field = "//android.view.ViewGroup[5]/android.widget.EditText";
    public static String save_beneficary_button = "//android.widget.TextView[@text='Save Beneficiary']";
    public static String add_new_beneficiary_button = "//android.widget.TextView[@text='Add New Beneficiary']";
    public static String cash_pickup_button = "//android.widget.TextView[@text='Cash Pickup']";
    public static String otp_first_digit_field_send_money = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String last_name_beneficiary = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String last_name_beneficiary1 = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String phone_num_temp = "//android.view.ViewGroup[3]/android.widget.EditText";
    public static String first_name_beneficiary = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String first_name_beneficiary1 = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String sender_amount_field = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String bank_accountbutton = "//android.widget.TextView[@text='Bank Account']";

    public static String click_outside_exchange_rates = "//android.widget.TextView[@text='Receiver']";

    public static String first_saved_beneficary = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    public static String confirm_button = "//android.widget.TextView[@text='Confirm']";

    public static String track_history = "//android.widget.TextView[@text='Track History']";

    public static String mobile_wallet_button = "//android.widget.TextView[@text='Mobile Wallet']";
    public static String first_bank_in_list = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup";
    public static String send_money_button = "//android.widget.TextView[@text='Send Money']";

    public static String send_money_button2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.widget.TextView";

    public static String search_county_wait(String country){return "//android.widget.TextView[@text='"+country+"']";}

    public static String search_for_country_send_money = "//android.widget.EditText[@index='1']";

    public static String click_outside_on_send_money = "//android.widget.TextView[@text='Select Other Country']";

    public static String add_new_beneficiary = "//android.widget.TextView[@text='Add New Beneficiary']";

    public static String phone_number_field_beneficiary = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String phone_number_field_beneficiary1 = "//android.view.ViewGroup[4]/android.widget.EditText";

    public static String account_title_field_beneficiary = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String account_title_field_beneficiary1 = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String iban_number_beneficiary = "//android.view.ViewGroup[3]/android.widget.EditText";

    public static String iban_number_beneficiary1 = "//android.view.ViewGroup[4]/android.widget.EditText";

    public static String click_outside_beneficary2 = "//android.widget.TextView[@text='IBAN / Account Number']";

    public static String family_support_option_at_reason_to_pay = "//android.widget.TextView[@text='Family Support']";

    public static String other_option_at_reason_to_pay = "//android.widget.TextView[@text='Other']";
    public static String remittance_purpose_field_beneficiary = "//android.view.ViewGroup[5]/android.view.ViewGroup[1]";

    public static String remittance_purpose_field_beneficiary1 = "//android.view.ViewGroup[6]/android.widget.EditText";

    public static String send_money_at_confirmation = "//android.widget.TextView[@text='Send Money']";

    public static String agree_terms_box = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]";

    public SendMoneyPage(){}

    public static AndroidElement get_send_money_button(){return driver.findElement(By.xpath(send_money_button));}

    public static AndroidElement get_add_new_beneficiary(){return driver.findElement(By.xpath(add_new_beneficiary));}

    public static AndroidElement get_search_for_country_send_money(){return driver.findElement(By.xpath(search_for_country_send_money));}

    public static AndroidElement searched_country_locator(String country_name){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+country_name+"']"));}

    public static AndroidElement get_sendmoneybutton2(){return driver.findElement(By.xpath(send_money_button2));}

    public static AndroidElement get_bank_accountbutton(){return driver.findElement(By.xpath(bank_accountbutton));}

    public static AndroidElement get_first_bank_in_list(){return driver.findElement(By.xpath(first_bank_in_list));}

    public static AndroidElement get_confirm_button(){return driver.findElement(By.xpath(confirm_button));}

    public static AndroidElement get_other_field(){return driver.findElement(By.xpath(other_field));}

    public static AndroidElement get_sender_amount_field(){return driver.findElement(By.xpath(sender_amount_field));}

    public static AndroidElement get_click_outside_exchange_rates(){return driver.findElement(By.xpath(click_outside_exchange_rates));}

    public static AndroidElement get_first_name_beneficiary(){return driver.findElement(By.xpath(first_name_beneficiary));}

    public static AndroidElement get_first_name_beneficiary1(){return driver.findElement(By.xpath(first_name_beneficiary1));}

    public static AndroidElement get_last_name_beneficiary(){return driver.findElement(By.xpath(last_name_beneficiary));}

    public static AndroidElement get_last_name_beneficiary1(){return driver.findElement(By.xpath(last_name_beneficiary1));}
    public static AndroidElement get_phone_number_field_beneficiary(){return driver.findElement(By.xpath(phone_number_field_beneficiary));}

    public static AndroidElement get_phone_number_field_beneficiary1(){return driver.findElement(By.xpath(phone_number_field_beneficiary1));}

    public static AndroidElement click_outside_beneficiary_page1(){return driver.findElement(By.xpath("//android.widget.TextView[@text='Mobile Number']"));}

    public static AndroidElement get_account_title_field_beneficiary(){return driver.findElement(By.xpath(account_title_field_beneficiary));}

    public static AndroidElement get_account_title_field_beneficiary1(){return driver.findElement(By.xpath(account_title_field_beneficiary1));}

    public static AndroidElement get_iban_number_beneficiary(){return driver.findElement(By.xpath(iban_number_beneficiary));}

    public static AndroidElement get_iban_number_beneficiary1(){return driver.findElement(By.xpath(iban_number_beneficiary1));}

    public static AndroidElement get_click_outside_beneficary2(){return driver.findElement(By.xpath(click_outside_beneficary2));}

    public static AndroidElement get_remittance_purpose_field_beneficiary(){return driver.findElement(By.xpath(remittance_purpose_field_beneficiary));}

    public static AndroidElement get_remittance_purpose_field_beneficiary1(){return driver.findElement(By.xpath(remittance_purpose_field_beneficiary1));}
    public static AndroidElement get_agree_terms_box(){return driver.findElement(By.xpath(agree_terms_box));}

    public static AndroidElement get_send_money_at_confirmation(){return driver.findElement(By.xpath(send_money_at_confirmation));}

    public static AndroidElement get_otp_first_digit_field_send_money(){return driver.findElement(By.xpath(otp_first_digit_field_send_money));}

    public static AndroidElement get_first_saved_beneficary(){return driver.findElement(By.xpath(first_saved_beneficary));}

    public static AndroidElement get_cash_pickup_button(){return driver.findElement(By.xpath(cash_pickup_button));}

    public static AndroidElement get_mobile_wallet_button(){return driver.findElement(By.xpath(mobile_wallet_button));}

    public static AndroidElement get_track_history(){return driver.findElement(By.xpath(track_history));}

    public static AndroidElement get_add_new_beneficiary_button(){return driver.findElement(By.xpath(add_new_beneficiary));}

    public static AndroidElement get_save_beneficary_button(){return driver.findElement(By.xpath(save_beneficary_button));}

    public static AndroidElement get_phone_num_temp(){return driver.findElement(By.xpath(phone_num_temp));}

    public static AndroidElement get_family_support_option_at_reason_to_pay(){return driver.findElement(By.xpath(family_support_option_at_reason_to_pay));}

    public static AndroidElement get_other_option_at_reason_to_pay(){return driver.findElement(By.xpath(other_option_at_reason_to_pay));}
}
