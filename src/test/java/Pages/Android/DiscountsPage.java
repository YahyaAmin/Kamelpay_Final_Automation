package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Hooks.Base_Class.driver;

public class DiscountsPage {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    public static String redeem_button = "//android.widget.TextView[@text='Redeem']";
    public static String submit_button = "//android.widget.TextView[@text='Submit']";
    public static String amount_field = "//android.widget.EditText";
    public static String cafeteria_button = "//android.widget.TextView[@text='Cafeteria']";

    public static String discounts_button = "//android.widget.TextView[@text='Discounts']";
    public static String merchant_pin_field = "//android.view.ViewGroup[1]/android.widget.EditText";
    public static String pharmacy_button = "//android.widget.TextView[@text='Pharmacy']";

    public static String travel_agency_button = "//android.widget.TextView[@text='Travel Agency']";

    public static String offers_wait = "//android.widget.TextView[@text='Offers']";
    public static String first_offer = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup";

    public static String second_offer = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    public static String search_vendors_field = "//android.widget.EditText";

    public static String enter_amount_field_wait = "//android.widget.TextView[@text='Enter Amount']";

    public static String category_selector(String category){return "//android.widget.TextView[@text='"+category+"']";}

    public static String sub_category_selector(String sub_category){return "//android.widget.TextView[@text='"+sub_category+"']";}

    public static String vendor_selector(String choose_vendor){return "//android.widget.TextView[@text='"+ choose_vendor +"']";}

    public DiscountsPage(){}

    public static AndroidElement get_pharmacy_button(){return driver.findElement(By.xpath(pharmacy_button));}

    public static AndroidElement get_search_vendors_field(){return driver.findElement(By.xpath(search_vendors_field));}

    public static AndroidElement get_vendor_selector(String choose_vendor){return driver.findElement(By.xpath(vendor_selector(choose_vendor)));}

    public static AndroidElement get_first_offer(){return driver.findElement(By.xpath(first_offer));}

    public static AndroidElement get_merchant_pin_field(){return driver.findElement(By.xpath(merchant_pin_field));}

    public static AndroidElement get_offers_wait(){return driver.findElement(By.xpath(offers_wait));}

    public static AndroidElement get_travel_agency_button(){return driver.findElement(By.xpath(travel_agency_button));}

    public static AndroidElement get_cafeteria_button(){return driver.findElement(By.xpath(cafeteria_button));}

    public static AndroidElement get_discounts_button(){return driver.findElement(By.xpath(discounts_button));}

    public static AndroidElement get_category_selector(String catgry){return driver.findElement(By.xpath(category_selector(catgry)));}

    public static AndroidElement get_sub_category_selector(String sub_catgry){return driver.findElement(By.xpath(category_selector(sub_catgry)));}

    public static AndroidElement get_second_offer(){return driver.findElement(By.xpath(second_offer));}

    public static AndroidElement get_enter_amount_field_wait(){return driver.findElement(By.xpath(enter_amount_field_wait));}

    public static AndroidElement get_amount_field(){return driver.findElement(By.xpath(amount_field));}

    public static AndroidElement get_submit_button(){return driver.findElement(By.xpath(submit_button));}

    public static AndroidElement get_redeem_button(){return driver.findElement(By.xpath(redeem_button));}

}
