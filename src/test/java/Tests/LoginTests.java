//package Tests;
//import Hooks.Base_Class;
//import org.openqa.selenium.By;
//import org.springframework.core.annotation.Order;
//import org.testng.annotations.Test;
//
//
//public class LoginTests extends Base_Class {
//
//
//    public String login_button_mainscreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]";
//    public String phone_no_on_mainscreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
//    public String password_on_mainscreen_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
//
//    public String dont_allow_biometric_button_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]";
//
//    public String three_lines_home_button_at_homescreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
//
//    public String settings_button_sidebar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";
//
//    public String setup_pin_button_sidebar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup";
//
//    public String enter_new_pin_1st = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
//
//    public String enter_new_pin_2nd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
//
//    public String enter_new_pin_3rd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
//
//    public String enter_new_pin_4th = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText";
//
//    public String confirm_pin_1st = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
//
//    public String confirm_pin_2nd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
//
//    public String confirm_pin_3rd = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText";
//
//    public String confirm_pin_4th = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText";
//
//    public String submit_button_on_setup_pin_page = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";
//
//    public String logout_button_settings_panel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";
//
//    public String logout_button_top_right_toolbar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
//
//    public String pin_login_key_number_9 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"9\"]/android.view.ViewGroup/android.widget.TextView";
//
//    public String pin_login_key_number_1 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"1\"]/android.view.ViewGroup/android.widget.TextView";
//
//    public String pin_login_key_number_3 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"3\"]/android.view.ViewGroup/android.widget.TextView";
//
//    public String pin_login_key_number_5 = "//android.inputmethodservice.Keyboard.Key[@content-desc=\"5\"]/android.view.ViewGroup/android.widget.TextView";
//
//    public String forgot_password_at_login_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView";
//
//    public String back_button_top_left = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
//
//    public String e_id_field_at_forgot_password_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
//
//    public String phone_number_field_at_forgot_password_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
//
//    public String next_button_at_forgot_password_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";
//
//    public String eye_button_to_view_password_login_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]";
//
//    public String cant_login_button_on_pin_login_screen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView";
//
//    public String otp_1st_digit_at_forgot_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
//
//    public String enter_new_password_forgot_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
//
//    public String confirm_new_password_forgot_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
//
//    public String view_password_button_forgot_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView";
//
//    public String change_button_forgot_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";
//
//    public String next_button_otp_verification_screen_forgot_password_flow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]";
//
//
//
//    @Test(priority = 1) //Login with correct Phone no. and correct Password with pin login not setup
//    @Order(1)
//    public void loginCase1() throws InterruptedException {
//
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).clear();
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).sendKeys("123456789");
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
//        //Thread.sleep(2000);
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        //Thread.sleep(3000);
//
//        //dont allow biometric
//        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
//        Thread.sleep(4000);
//        //logged in
//        //close driver
//        driver.resetApp();
//
//    }
//
//
//    @Test(priority = 2) //Login with Pin after setting pin
//    @Order(2)
//    public void loginCase2() throws InterruptedException {
//
//        //login with phone no and password
//
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).clear();
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).sendKeys("123456789");
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
//        //Thread.sleep(1000);
//        //view password button
//        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
//        //Thread.sleep(1000);
//        //click on login
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        //Thread.sleep(3000);
//
//        //dont allow biometric
//        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
//        //Thread.sleep(3000);
//        //logged in
//
//        //setup pin login
//        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath(settings_button_sidebar)).click();
//        //Thread.sleep(2000);
//        driver.findElement(By.xpath(setup_pin_button_sidebar)).click();
//        //Thread.sleep(2000);
//        driver.findElement(By.xpath(enter_new_pin_1st)).click();
//        driver.findElement(By.xpath(enter_new_pin_1st)).sendKeys("9");
//        driver.findElement(By.xpath(enter_new_pin_2nd)).click();
//        driver.findElement(By.xpath(enter_new_pin_2nd)).sendKeys("1");
//        driver.findElement(By.xpath(enter_new_pin_3rd)).click();
//        driver.findElement(By.xpath(enter_new_pin_3rd)).sendKeys("3");
//        driver.findElement(By.xpath(enter_new_pin_4th)).click();
//        driver.findElement(By.xpath(enter_new_pin_4th)).sendKeys("5");
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath(confirm_pin_1st)).click();
//        driver.findElement(By.xpath(confirm_pin_1st)).sendKeys("9");
//        driver.findElement(By.xpath(confirm_pin_2nd)).click();
//        driver.findElement(By.xpath(confirm_pin_2nd)).sendKeys("1");
//        driver.findElement(By.xpath(confirm_pin_3rd)).click();
//        driver.findElement(By.xpath(confirm_pin_3rd)).sendKeys("3");
//        driver.findElement(By.xpath(confirm_pin_4th)).click();
//        driver.findElement(By.xpath(confirm_pin_4th)).sendKeys("5");
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath(submit_button_on_setup_pin_page)).click();
//        //Thread.sleep(9000);
//        driver.findElement(By.xpath(back_button_top_left)).click();
//        Thread.sleep(8000);
//        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
//        Thread.sleep(8000);
//
//        //logout of app after setting up pin
//        driver.findElement(By.xpath(logout_button_settings_panel)).click();
//        //Thread.sleep(3000);
//
//        //input correct pin to login and login to the app
//        driver.findElement(By.xpath(pin_login_key_number_9)).click();
//        driver.findElement(By.xpath(pin_login_key_number_1)).click();
//        driver.findElement(By.xpath(pin_login_key_number_3)).click();
//        driver.findElement(By.xpath(pin_login_key_number_5)).click();
//        Thread.sleep(4000);
//
//        driver.resetApp();
//    }
//
//    //Forgot password positive Case
//    @Test(priority = 4)
//    @Order(4)
//    public void loginCase4() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(forgot_password_at_login_screen)).click();
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath(e_id_field_at_forgot_password_screen)).sendKeys("784197848020307");
//        driver.findElement(By.xpath(phone_number_field_at_forgot_password_screen)).sendKeys("123456789");
//        driver.findElement(By.xpath(next_button_at_forgot_password_screen)).click();
//        //Thread.sleep(2000);
//        driver.findElement(By.xpath(otp_1st_digit_at_forgot_password_flow)).sendKeys("666666");
//        driver.findElement(By.xpath(next_button_otp_verification_screen_forgot_password_flow)).click();
//        //Thread.sleep(2000);
//        driver.findElement(By.xpath(enter_new_password_forgot_password_flow)).sendKeys("Password123!");
//        driver.findElement(By.xpath(confirm_new_password_forgot_password_flow)).sendKeys("Password123!");
//        driver.findElement(By.xpath(view_password_button_forgot_password_flow)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(view_password_button_forgot_password_flow)).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath(change_button_forgot_password_flow)).click();
//        Thread.sleep(2000);
//
//        //Login with updated password
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).clear();
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).sendKeys("123456789");
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
//        //Thread.sleep(2000);
//
//        //click on view password button
//        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
//        //Thread.sleep(1000);
//
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        //Thread.sleep(3000);
//
//        //dont allow biometric
//        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
//        Thread.sleep(4000);
//        //logged in
//
//        driver.resetApp();
//    }
//
//    @Test(priority = 5) //Login with invalid phone number and valid password
//    @Order(5)
//    public void loginCase5() throws InterruptedException {
//
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).clear();
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).sendKeys("125987378948");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
//        Thread.sleep(1000);
//        //click on view password button
//        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
//        Thread.sleep(1000);
//        //click login
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        Thread.sleep(4000);
//
//        driver.resetApp();
//    }
//
//    @Test(priority = 6) //Enter valid phone number and invalid password at login
//    @Order(6)
//    public void loginCase6() throws InterruptedException {
//
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).clear();
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).sendKeys("123456789");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Pbssword123!");
//        Thread.sleep(2000);
//
//        //view password button
//        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
//        Thread.sleep(1000);
//        //click login 3 times
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        Thread.sleep(3000);
//
//        //logged in
//        //close driver
//        driver.resetApp();
//
//    }
//
//
//    @Test(priority = 7) //Login with pin and enter invalid pin
//    @Order(7)
//    public void loginCase7() throws InterruptedException {
//
//        //login with phone no and password
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).clear();
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).sendKeys("123456789");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
//        Thread.sleep(1000);
//        //view password button
//        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
//        Thread.sleep(1000);
//        //click on login
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        Thread.sleep(3000);
//
//        //dont allow biometric
//        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
//        Thread.sleep(3000);
//        //logged in
//
//        //setup pin login
//        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(settings_button_sidebar)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(setup_pin_button_sidebar)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(enter_new_pin_1st)).click();
//        driver.findElement(By.xpath(enter_new_pin_1st)).sendKeys("9");
//        driver.findElement(By.xpath(enter_new_pin_2nd)).click();
//        driver.findElement(By.xpath(enter_new_pin_2nd)).sendKeys("1");
//        driver.findElement(By.xpath(enter_new_pin_3rd)).click();
//        driver.findElement(By.xpath(enter_new_pin_3rd)).sendKeys("3");
//        driver.findElement(By.xpath(enter_new_pin_4th)).click();
//        driver.findElement(By.xpath(enter_new_pin_4th)).sendKeys("5");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(confirm_pin_1st)).click();
//        driver.findElement(By.xpath(confirm_pin_1st)).sendKeys("9");
//        driver.findElement(By.xpath(confirm_pin_2nd)).click();
//        driver.findElement(By.xpath(confirm_pin_2nd)).sendKeys("1");
//        driver.findElement(By.xpath(confirm_pin_3rd)).click();
//        driver.findElement(By.xpath(confirm_pin_3rd)).sendKeys("3");
//        driver.findElement(By.xpath(confirm_pin_4th)).click();
//        driver.findElement(By.xpath(confirm_pin_4th)).sendKeys("5");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(submit_button_on_setup_pin_page)).click();
//        Thread.sleep(9000);
//        driver.findElement(By.xpath(back_button_top_left)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
//        Thread.sleep(1000);
//
//        //logout of app after setting up pin
//        driver.findElement(By.xpath(logout_button_settings_panel)).click();
//        Thread.sleep(3000);
//
//        //input correct pin to login and login to the app
//        driver.findElement(By.xpath(pin_login_key_number_9)).click();
//        driver.findElement(By.xpath(pin_login_key_number_9)).click();
//        driver.findElement(By.xpath(pin_login_key_number_3)).click();
//        driver.findElement(By.xpath(pin_login_key_number_5)).click();
//        Thread.sleep(4000);
//
//        driver.resetApp();
//    }
//
//    @Test(priority = 9) //Forgot password function with valid E_ID and invalid Phone number
//    @Order(9)
//    public void loginCase9() throws InterruptedException {
//
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(forgot_password_at_login_screen)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(e_id_field_at_forgot_password_screen)).sendKeys("784197848020307");
//        driver.findElement(By.xpath(phone_number_field_at_forgot_password_screen)).sendKeys("1277981237");
//        //click next button 3 times
//        driver.findElement(By.xpath(next_button_at_forgot_password_screen)).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(next_button_at_forgot_password_screen)).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(next_button_at_forgot_password_screen)).click();
//        Thread.sleep(5000);
//
//        driver.resetApp();
//    }
//
//    @Test(priority = 10) //check cant login button on Login With Pin screen
//    @Order(10)
//    public void loginCase10() throws InterruptedException {
//
//        //login with phone no and password
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).clear();
//        driver.findElement(By.xpath(phone_no_on_mainscreen)).sendKeys("123456789");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).clear();
//        driver.findElement(By.xpath(password_on_mainscreen_xpath)).sendKeys("Password123!");
//        Thread.sleep(1000);
//        //view password button
//        driver.findElement(By.xpath(eye_button_to_view_password_login_screen)).click();
//        Thread.sleep(1000);
//        //click on login
//        driver.findElement(By.xpath(login_button_mainscreen)).click();
//        Thread.sleep(3000);
//
//        //dont allow biometric
//        driver.findElement(By.xpath(dont_allow_biometric_button_xpath)).click();
//        Thread.sleep(3000);
//        //logged in
//
//        //setup pin login
//        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(settings_button_sidebar)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(setup_pin_button_sidebar)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(enter_new_pin_1st)).click();
//        driver.findElement(By.xpath(enter_new_pin_1st)).sendKeys("9");
//        driver.findElement(By.xpath(enter_new_pin_2nd)).click();
//        driver.findElement(By.xpath(enter_new_pin_2nd)).sendKeys("1");
//        driver.findElement(By.xpath(enter_new_pin_3rd)).click();
//        driver.findElement(By.xpath(enter_new_pin_3rd)).sendKeys("3");
//        driver.findElement(By.xpath(enter_new_pin_4th)).click();
//        driver.findElement(By.xpath(enter_new_pin_4th)).sendKeys("5");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(confirm_pin_1st)).click();
//        driver.findElement(By.xpath(confirm_pin_1st)).sendKeys("9");
//        driver.findElement(By.xpath(confirm_pin_2nd)).click();
//        driver.findElement(By.xpath(confirm_pin_2nd)).sendKeys("1");
//        driver.findElement(By.xpath(confirm_pin_3rd)).click();
//        driver.findElement(By.xpath(confirm_pin_3rd)).sendKeys("3");
//        driver.findElement(By.xpath(confirm_pin_4th)).click();
//        driver.findElement(By.xpath(confirm_pin_4th)).sendKeys("5");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(submit_button_on_setup_pin_page)).click();
//        Thread.sleep(9000);
//        driver.findElement(By.xpath(back_button_top_left)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(three_lines_home_button_at_homescreen)).click();
//        Thread.sleep(1000);
//
//        //logout of app after setting up pin
//        driver.findElement(By.xpath(logout_button_settings_panel)).click();
//        Thread.sleep(3000);
//
//        //click on cant login button
//        driver.findElement(By.xpath(cant_login_button_on_pin_login_screen)).click();
//        Thread.sleep(3000);
//
//        driver.resetApp();
//    }
//}
