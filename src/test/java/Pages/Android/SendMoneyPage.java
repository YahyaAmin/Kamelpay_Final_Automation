package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static Hooks.Base_Class.driver;


public class SendMoneyPage {

    public static String send_money_button = "//android.widget.TextView[@text='Send Money']";

    public static String search_county_wait(String country){return "//android.widget.TextView[@text='"+country+"']";}

    public static String search_for_country_send_money = "//android.widget.EditText[@index='1']";

    public static String click_outside_on_send_money = "//android.widget.TextView[@text='Select Other Country']";

    public static String add_new_beneficiary = "//android.widget.TextView[@text='Add New Beneficiary']";


    public SendMoneyPage(){}

    public static AndroidElement get_send_money_button(){return driver.findElement(By.xpath(send_money_button));}

    public static AndroidElement get_add_new_beneficiary(){return driver.findElement(By.xpath(add_new_beneficiary));}

    public static AndroidElement get_search_for_country_send_money(){return driver.findElement(By.xpath(search_for_country_send_money));}

    public static AndroidElement searched_country_locator(String country_name){return driver.findElement(By.xpath("android.widget.TextView[@text='"+country_name+"']"));}

}
