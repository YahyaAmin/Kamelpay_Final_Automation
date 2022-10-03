package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;

public class SignupPage {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    public static String eid_field_before_scan_id = "//android.widget.EditText[@index='1']";
    public static String enter_card_last_digits = "//android.view.ViewGroup[1]/android.widget.EditText";
    private static String proceed_button = "//android.widget.TextView[@text='Proceed']";

    public static String card_last_four_digits_sigunp = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String verify_button_after_signup = "//android.widget.TextView[@text='Verify']";

    private static String view_password_eye_button = "//android.view.ViewGroup[3]/android.view.ViewGroup[2]";

    public static String get_new_card_button = "//android.widget.TextView[@text='Get Your New Card']";

    public static String dont_have_an_account_signup_button = "//android.widget.TextView[@text='Signup']";

    private static String view_password_button_at_signup_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]";
    public static String payd_card_select_button_at_signup = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    public static String i_am_ready_button_at_signup = "//android.widget.TextView[@text='I am ready']";

    public static String phone_number_field_at_register_yourself_page = "//android.view.ViewGroup[2]/android.widget.EditText";

    private static String username_field_at_register_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";

    public static String enter_your_password_at_register_yourself_page = "//android.widget.EditText[@text='Enter your Password']";

    private static String email_field_at_signup = "//android.widget.EditText[@text='Enter your email address']";

    private static String confirm_your_password_at_register_yourself_page = "//android.widget.EditText[@text='Enter your confirm password']";

    public static String sign_up_button_at_register_yourself_page = "//android.widget.TextView[@text='Register']";

    public static String enter_otp_1st_slot_sign_up = "//android.view.ViewGroup[1]/android.widget.EditText";

    private static String i_agree_termsandcondition = "//android.view.ViewGroup[5]/android.view.ViewGroup[1]";

    private static String next_button_at_otp_screen_sign_up_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]";

    private static String click_outside_on_regiter_yourself_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]";

    private static String dont_allow_biometric_button_after_sign_up = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]";

    public static String centiv_card_select_button_at_sign_up = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    //private static String verify_button_after_sign_up = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]";

    private static String card_number_last_4_digits_1st_digit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    private static String click_outside_on_card_activation_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]";

    private static String proceed_button_on_card_activation_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";

    public SignupPage(){}

    public static AndroidElement get_dont_have_an_account_signup_button(){return driver.findElement(By.xpath(dont_have_an_account_signup_button));}

    public static AndroidElement get_view_password_button_at_signup_flow(){return driver.findElement(By.xpath(view_password_button_at_signup_flow));}

    public static AndroidElement get_payd_card_select_button_at_signup(){return driver.findElement(By.xpath(payd_card_select_button_at_signup));}

    public WebElement get_payd_card_select_button_at_signup_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(payd_card_select_button_at_signup)));}

    public static AndroidElement get_i_am_ready_button_at_signup(){return driver.findElement(By.xpath(i_am_ready_button_at_signup));}

    public WebElement get_i_am_ready_button_at_signup_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(i_am_ready_button_at_signup)));}

    public static AndroidElement get_phone_number_field_at_register_yourself_page(){return driver.findElement(By.xpath(phone_number_field_at_register_yourself_page));}

    public WebElement get_phone_number_field_at_register_yourself_page_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_number_field_at_register_yourself_page)));}

    public static AndroidElement get_username_field_at_register_yourself_page(){return driver.findElement(By.xpath(username_field_at_register_yourself_page));}

    public static AndroidElement get_enter_your_password_at_register_yourself_page(){return driver.findElement(By.xpath(enter_your_password_at_register_yourself_page));}

    public static AndroidElement get_confirm_your_password_at_register_yourself_page(){return driver.findElement(By.xpath(confirm_your_password_at_register_yourself_page));}

    public static AndroidElement get_sign_up_button_at_register_yourself_page(){return driver.findElement(By.xpath(sign_up_button_at_register_yourself_page));}

    public static AndroidElement get_enter_otp_1st_slot_sign_up(){return driver.findElement(By.xpath(enter_otp_1st_slot_sign_up));}

    public static AndroidElement get_next_button_at_otp_screen_sign_up_flow(){return driver.findElement(By.xpath(next_button_at_otp_screen_sign_up_flow));}

    public static AndroidElement get_click_outside_on_regiter_yourself_page(){return driver.findElement(By.xpath(click_outside_on_regiter_yourself_page));}

    public static AndroidElement get_dont_allow_biometric_button_after_sign_up(){return driver.findElement(By.xpath(dont_allow_biometric_button_after_sign_up));}

    public static AndroidElement getCardLastFourDigits(){return driver.findElement(By.xpath(enter_card_last_digits));}

    public static AndroidElement get_centiv_card_select_button_at_sign_up(){return driver.findElement(By.xpath(centiv_card_select_button_at_sign_up));}

    //public static AndroidElement get_verify_button_after_sign_up(){return driver.findElement(By.xpath(verify_button_after_sign_up));}

    public static AndroidElement get_card_number_last_4_digits_1st_digit(){return driver.findElement(By.xpath(card_number_last_4_digits_1st_digit));}

    public static AndroidElement get_click_outside_on_card_activation_page(){return driver.findElement(By.xpath(click_outside_on_card_activation_page));}

    public static AndroidElement get_proceed_button_on_card_activation_page(){return driver.findElement(By.xpath(proceed_button_on_card_activation_page));}

    public static AndroidElement get_email_field_at_signup(){return driver.findElement(By.xpath(email_field_at_signup));}

    public static AndroidElement get_view_password_eye_button(){return driver.findElement(By.xpath(view_password_eye_button));}

    public static AndroidElement get_card_last_four_digits_sigunp(){return driver.findElement(By.xpath(card_last_four_digits_sigunp));}

    public static AndroidElement get_i_agree_termsandcondition(){return driver.findElement(By.xpath(i_agree_termsandcondition));}

    public static AndroidElement getGetNewCard(){return driver.findElement(By.xpath(get_new_card_button));}

    public static AndroidElement getverify_button_after_signup(){return driver.findElement(By.xpath(verify_button_after_signup));}

    public static AndroidElement getproceed_button(){return driver.findElement(By.xpath(proceed_button));}

    public static AndroidElement get_eid_field_before_scan_id(){return driver.findElement(By.xpath(eid_field_before_scan_id));}

}
