package Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidElement;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import java.io.File;

import static Tests.Useful_functions.getRandomNumberLowerAndUpperBound;

public class Base_Class {

    //AppiumDriver driver;
    public static AppiumDriver<AndroidElement> driver;



    @Before
    public void setup() {

        try {

        DesiredCapabilities caps = new DesiredCapabilities();

        String projectpath = System.getProperty("user.dir");
        File f = new File("apps");
        File fs = new File(f,"KamelPay.apk");
        String finalpath = projectpath+'\\'+fs;


        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
        caps.setCapability(MobileCapabilityType.UDID, "7664beac0820");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");
        caps.setCapability(MobileCapabilityType.APP,finalpath);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<AndroidElement>(url, caps);



        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
        catch(Exception exp){
                System.out.println("Cause is: " + exp.getCause());
                System.out.println("Message is: " + exp.getMessage());
                exp.printStackTrace();
        }


    }


//    @Test
//    public void SampleTest(){
//
//    }


    @After
    public void teardown(){

        driver.quit();
    }

}
