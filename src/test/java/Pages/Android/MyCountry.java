package Pages.Android;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;


public class MyCountry {

    public static WebDriverWait wait = new WebDriverWait(driver, 30);

    public static String postpaid_button(String service_name){return "//android.widget.TextView[@text='"+service_name+"']";}
    public static String my_country_button = "//android.widget.TextView[@text='My Country']";

    public static String reference_field_financial_services = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String central_despoitory_company_pakistan = "//android.widget.TextView[@text='Central Depositary Company Pakistan']";

    public static String ufone_mobile_number_field = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String LESCO_button = "//android.widget.TextView[@text='LESCO (Lahore Electricity Corporate)']";

    public static String SNGPL_button = "//android.widget.TextView[@text='SNGPL (Sui Northern Gas Company)']";
    public static String wait_for_popular_bank(String bank_name){return "//android.widget.TextView[@text='"+bank_name+"']";}

    public static String ufone_post_paid = "//android.widget.TextView[@text='Ufone Postpaid']";
    public static String wait_my_country_page = "//android.widget.TextView[@text='Send money or Pay bills']";

    public MyCountry (){}

    public static AndroidElement get_my_country_button(){return driver.findElement(By.xpath(my_country_button));}

    public static AndroidElement get_wait_for_popular_bank(String bank_name){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+bank_name+"']"));}

    public static AndroidElement get_ufone_post_paid(){return driver.findElement(By.xpath(ufone_post_paid));}

    public static AndroidElement get_ufone_mobile_number_field(){return driver.findElement(By.xpath(ufone_mobile_number_field));}

    public static AndroidElement get_postpaid_button(String service_name){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+service_name+"']"));}

    public static AndroidElement get_LESCO_button(){return driver.findElement(By.xpath(LESCO_button));}

    public static AndroidElement get_SNGPL_button(){return driver.findElement(By.xpath(SNGPL_button));}

    public static AndroidElement get_central_despoitory_company_pakistan(){return driver.findElement(By.xpath(central_despoitory_company_pakistan));}

    public static AndroidElement get_reference_field_financial_services(){return driver.findElement(By.xpath(reference_field_financial_services));}

}
