package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Hooks.Base_Class.driver;

public class CardManagementPage {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    public static String card_management_button = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]";

    public CardManagementPage(){}

    public static AndroidElement get_card_management_button(){return driver.findElement(By.xpath(card_management_button));}


}
