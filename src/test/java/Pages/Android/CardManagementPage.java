package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Hooks.Base_Class.driver;

public class CardManagementPage {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    public static String tap_to_view_transaction_history = "//android.widget.TextView[@text='Tap to See Transactions']";

    public static String card_status_popup_byid = "rootView";

    public static String cross_button_popup_id = "trailingIcon";

    public static String temporary_block_button = "//android.widget.TextView[@text='Temporary Block']";

    public static String block_unblock_button = "//android.widget.TextView[@text='Block/Unblock']";

    public static String unblock_button = "//android.widget.TextView[@text='Unblock']";

    public static String otp_1st_at_card_management = "//android.widget.EditText[@text='0']";

    public static String next_button = "//android.widget.TextView[@text='Next']";

    public static String enter_new_pin_for_card = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText[@index='0']";

    public static String confirm_new_pin_for_card = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText[@index='0']";

    public static String change_pin_card_management = "//android.widget.TextView[@text='Change Pin']";

    public static String card_management_button = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]";

    public static String whatsapp_button = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView[@index='0']";

    public static String centiv_card_at_homescreen = "//android.widget.TextView[@text='CentiV']";

    public static String payd_card_homescreen = "//android.widget.TextView[@text='PayD']";


    public CardManagementPage(){}

    public static AndroidElement get_card_management_button(){return driver.findElement(By.xpath(card_management_button));}

    public static AndroidElement get_whatsappbutton(){return driver.findElement(By.xpath(whatsapp_button));}

    public static AndroidElement get_centiv_card_at_homescreen(){return driver.findElement(By.xpath(centiv_card_at_homescreen));}

    public static AndroidElement get_payd_card_homescreen(){return driver.findElement(By.xpath(payd_card_homescreen));}

    public static AndroidElement get_changepin_cardmanagement(){return driver.findElement(By.xpath(change_pin_card_management));}

    public static AndroidElement get_enter_new_pin_for_card(){return driver.findElement(By.xpath(enter_new_pin_for_card));}

    public static AndroidElement get_confirm_new_pin_for_card(){return driver.findElement(By.xpath(confirm_new_pin_for_card));}

    public static AndroidElement get_next_button(){return driver.findElement(By.xpath(next_button));}

    public static AndroidElement get_otp_1st_at_card_management(){return driver.findElement(By.xpath(otp_1st_at_card_management));}
    public static AndroidElement get_block_unblock_button(){return driver.findElement(By.xpath(block_unblock_button));}

    public static AndroidElement get_temporary_block_button(){return driver.findElement(By.xpath(temporary_block_button));}

    public static AndroidElement get_card_status_popup_byid(){return driver.findElementById(card_status_popup_byid);}

    public static AndroidElement get_cross_button_popup_id(){return driver.findElementById(cross_button_popup_id);}

    public static AndroidElement get_unblock_button(){return driver.findElement(By.xpath(unblock_button));}

    public static AndroidElement get_tap_to_view_transaction_history(){return driver.findElement(By.xpath(tap_to_view_transaction_history));}

}
