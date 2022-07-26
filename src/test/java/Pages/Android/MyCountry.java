package Pages.Android;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;


public class MyCountry {

    public static WebDriverWait wait = new WebDriverWait(driver, 30);

    public static String my_country_button = "//android.widget.TextView[@text='My Country']";

    public static String wait_for_popular_bank(String bank_name){return "//android.widget.TextView[@text='"+bank_name+"']";}

    public static String wait_my_country_page = "//android.widget.TextView[@text='Send money or Pay bills']";

    public MyCountry (){}

    public static AndroidElement get_my_country_button(){return driver.findElement(By.xpath(my_country_button));}

    public static AndroidElement get_wait_for_popular_bank(String bank_name){return driver.findElement(By.xpath("//android.widget.TextView[@text='"+bank_name+"']"));}


}
