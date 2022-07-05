package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static Hooks.Base_Class.driver;


public class PayBill {

    public static String utility_button = "//android.widget.TextView[@text='Utility']";

    public static String mobile_number_field_tata_power = "//android.view.ViewGroup[3]/android.widget.EditText";
    public static String consumer_number_tata_power = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String search_field_at_pay_utility = "//android.widget.EditText";
    public static String pay_bill_button = "//android.widget.TextView[@text='Utility Bills']";

    public static String pay_new_bill_button = "//android.widget.TextView[@text='Pay New Bill']";

    public static String search_country_at_pay_bill = "//android.widget.EditText";

    public static String consumer_number_at_pay_bill = "//android.view.ViewGroup[3]/android.widget.EditText";
    public static String mobile_number_field_at_pay_bill = "//android.view.ViewGroup[2]/android.widget.EditText";
    public static String first_company_in_list = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    public static String searched_country_at_pay_bill(String country){return "//android.widget.TextView[@text='"+country+"']";}

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

}
