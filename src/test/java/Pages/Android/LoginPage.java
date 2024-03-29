package Pages.Android;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Hooks.Base_Class.driver;


public class LoginPage{

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    public static String setup_pin_login_button = "//android.view.ViewGroup[@index='3']";

    private static String login_button_mainscreen = "//android.widget.TextView[@text='Login']";

    public static String phone_no_on_mainscreen = "//android.view.ViewGroup[1]/android.widget.EditText";

    private static String password_on_mainscreen_xpath = "(//android.widget.EditText)[2]";

    public static String eid_field_forgot_pass = "//android.widget.EditText[@index='1']";
    public static String dont_allow_biometric_button_xpath = "//android.widget.TextView[@text='No, Only Password Access']";

    public static String three_lines_home_button_at_homescreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";

    public static String my_profile_button = "//android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView";

    public static String settings_button_sidebar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";

    public static String setup_pin_button_sidebar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup";

    public static String enter_new_pin_1st = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    private static String enter_new_pin_2nd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";

    private static String enter_new_pin_3rd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    private static String enter_new_pin_4th = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText";

    private static String confirm_pin_1st = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    private static String confirm_pin_2nd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";

    private String confirm_pin_3rd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";

    private String confirm_pin_4th = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText";

    public static String submit_button_on_setup_pin_page = "//android.widget.TextView[@text='Submit']";

    public static String wait_for_entering_correct_pin_screen = "//android.inputmethodservice.Keyboard.Key[@content-desc='"+1+"']/android.view.ViewGroup/android.widget.TextView";
    public static String logout_button_settings_panel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    private static String logout_button_top_right_toolbar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";

    public static String logout_button = "//android.widget.TextView[@text='Log Out']";

    private static String pin_login_key_number_9 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"9\"]/android.view.ViewGroup/android.widget.TextView";

    private static String pin_login_key_number_1 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"1\"]/android.view.ViewGroup/android.widget.TextView";

    private static String pin_login_key_number_3 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"3\"]/android.view.ViewGroup/android.widget.TextView";

    private static String pin_login_key_number_5 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"5\"]/android.view.ViewGroup/android.widget.TextView";

    public static String forgot_password_at_login_screen = "//android.widget.TextView[@text='Forgot Password?']";

    public static String back_button_top_left = "(//android.widget.TextView)[1]";

    public static String e_id_field_at_forgot_password_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";

    public static String phone_number_field_at_forgot_password_screen = "//android.widget.EditText";

    private static String next_button_at_forgot_password_screen = "//android.widget.TextView[@text='Next']";

    private static String eye_button_to_view_password_login_screen = "//android.view.ViewGroup[2]/android.widget.TextView";

    public static String change_password_button_settings = "//android.widget.TextView[@text='Change Password']";

    public static String cant_login_button_on_pin_login_screen = "//android.widget.TextView[@text='Login']";

    public static String otp_1st_digit_at_forgot_password_flow = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String enter_new_password_forgot_password_flow = "//android.widget.EditText[@text='Enter your New password']";

    private static String confirm_new_password_forgot_password_flow = "//android.widget.EditText[@text='Enter your new confirm password']";


    private static String view_password_button_forgot_password_flow = "(//android.view.ViewGroup[2]/android.widget.TextView)[1]";

    private static String change_button_forgot_password_flow = "//android.widget.TextView[@text='Change']";

    public static String next_button_otp_verification_screen_forgot_password_flow = "//android.widget.TextView[@text='Verify']";

    public static String skip_button = "//android.widget.TextView[@text='Skip']";

    public static String old_password_field_at_change_password = "//android.view.ViewGroup[1]/android.widget.EditText";

    public static String passwords_and_biometrics_button = "//android.widget.TextView[@text='Passwords & Biometrics']";

    private static String view_password_forgot_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView";

    private static String enter_confirm_password_field = "//android.view.ViewGroup[3]/android.widget.EditText";

    private static String new_password_field_at_change_password = "//android.view.ViewGroup[2]/android.widget.EditText";

    public static String last_four_card_digits_forgot_password_flow = "//android.view.ViewGroup[1]/android.widget.EditText";

    public LoginPage(){}

    public static AndroidElement getlogin_button_mainscreen(){return driver.findElement(By.xpath(login_button_mainscreen));}

    public WebElement getlogin_button_mainscreen_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login_button_mainscreen)));}

    public static AndroidElement getphone_no_mainscreen(){return driver.findElement(By.xpath(phone_no_on_mainscreen));}

    public WebElement getphone_no_mainscreen_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phone_no_on_mainscreen)));}

    public static AndroidElement getpassword_mainscreen(){return driver.findElement(By.xpath(password_on_mainscreen_xpath));}

    public static AndroidElement get_viewpassword_mainscreen(){return driver.findElement(By.xpath(eye_button_to_view_password_login_screen));}

    public static AndroidElement get_dontallow_biometric_button(){return driver.findElement(By.xpath(dont_allow_biometric_button_xpath));}

    public WebElement get_dontallow_biometric_button_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dont_allow_biometric_button_xpath)));}

    public static AndroidElement get_sidebar_button(){return driver.findElement(By.xpath(three_lines_home_button_at_homescreen));}

    public WebElement get_sidebar_button_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(three_lines_home_button_at_homescreen)));}

    public static AndroidElement get_settingsbutton_sidebar(){return driver.findElement(By.xpath(settings_button_sidebar));}

    public WebElement get_settingsbutton_sidebar_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(settings_button_sidebar)));}

    public static AndroidElement get_setuppinbutton_sidebar(){return driver.findElement(By.xpath(setup_pin_button_sidebar));}

    public  WebElement get_setuppinbutton_sidebar_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(setup_pin_button_sidebar)));}

    public static AndroidElement get_enternewpin_pinlogin(){return driver.findElement(By.xpath(enter_new_pin_1st));}

    public WebElement get_enternewpin_pinlogin_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_new_pin_1st)));}

    public static AndroidElement get_old_password_field_at_change_password(){return driver.findElement(By.xpath(old_password_field_at_change_password));}


    public static AndroidElement get_confirmpin_pinlogin(){return driver.findElement(By.xpath(confirm_pin_1st));}

    public static AndroidElement get_submitbutton_pinlogin(){return driver.findElement(By.xpath(submit_button_on_setup_pin_page));}

    public static AndroidElement get_backbutton_topleft(){return driver.findElement(By.xpath(back_button_top_left));}

    public static AndroidElement get_logoutbutton_settingspanel(){return driver.findElement(By.xpath(logout_button_settings_panel));}

    public WebElement get_logoutbutton_settingspanel_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logout_button_settings_panel)));}

    public static AndroidElement enterpintologin(String digit) {return driver.findElement(By.xpath("//android.inputmethodservice.Keyboard.Key[@content-desc='"+digit+"']/android.view.ViewGroup"));}

    public WebElement get_enterpintologin_wait(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.inputmethodservice.Keyboard.Key[@content-desc='"+1+"']/android.view.ViewGroup/android.widget.TextView")));}

    public static AndroidElement getforgotpassword_loginscreen(){return driver.findElement(By.xpath(forgot_password_at_login_screen));}

    public static AndroidElement getEIDField_forgotpasswordflow(){return driver.findElement(By.xpath(e_id_field_at_forgot_password_screen));}

    public static AndroidElement getphonenumberfield_forgotpassword(){return driver.findElement(By.xpath(phone_number_field_at_forgot_password_screen));}

    public static AndroidElement getnextbutton_forgotpasswordfield(){return driver.findElement(By.xpath(next_button_at_forgot_password_screen));}

    public static AndroidElement get_eid_field_forgot_pass(){return driver.findElement(By.xpath(eid_field_forgot_pass));}

    public static AndroidElement getotp1stdigit_forgotpasswordflow() {return driver.findElement(By.xpath(otp_1st_digit_at_forgot_password_flow));}

    public static AndroidElement getnextbutton_otpscreen() {return driver.findElement(By.xpath(next_button_otp_verification_screen_forgot_password_flow));}

    public static AndroidElement getenternewpassword_forgotpassword() {return driver.findElement(By.xpath(enter_new_password_forgot_password_flow));}

    public static AndroidElement getconfirmnewpassword_forgotpassword() {return driver.findElement(By.xpath(confirm_new_password_forgot_password_flow));}

    public static AndroidElement getchangebutton_forgotpasswordflow() {return driver.findElement(By.xpath(change_button_forgot_password_flow));}

    public static AndroidElement getcantloginbutton_enterpinscreen()  {return driver.findElement(By.xpath(cant_login_button_on_pin_login_screen));}

    public static AndroidElement getmyprofilebutton(){return driver.findElement(By.xpath(my_profile_button));}

    public static AndroidElement getskipbutton(){return driver.findElement(By.xpath(skip_button));}

    public static AndroidElement getpasswordsandbiomterics(){return driver.findElement(By.xpath(passwords_and_biometrics_button));}

    public static AndroidElement getsetuppinloginbutton(){return driver.findElement(By.xpath(setup_pin_login_button));}

    public static AndroidElement getlogoutbutton(){return driver.findElement(By.xpath(logout_button));}

    public static AndroidElement getview_password_forgot_password_flow(){return driver.findElement(By.xpath(view_password_button_forgot_password_flow));}

    public static AndroidElement get_changepasswordbutton_settings(){return driver.findElement(By.xpath(change_password_button_settings));}

    public static AndroidElement get_new_password_field_at_change_password(){return driver.findElement(By.xpath(new_password_field_at_change_password));}

    public static AndroidElement get_enter_confirm_password_field(){return driver.findElement(By.xpath(enter_confirm_password_field));}

    public static AndroidElement get_last_four_card_digits_forgot_password_flow(){return driver.findElement(By.xpath(last_four_card_digits_forgot_password_flow));}

}
