JDK version used = 18.0.0.1

All config is in Base Class

Appium Version = 1.22.3

================================================LOCATORS=============================================
(//option[text()='1.3'])[1]

//div[@class='sc-db8c1937-0 eGmDjE sc-80d4314-3 iBtAhY']//span[@class='sc-7ab21ed2-1 jGRxWM']

//tagname[@class='value']

//tagname[contains(text(),'value')]

By.xpath("//android.widget.TextView[@text='"+songname+"']");

By.xpath("//android.widget.TextView[@text='Update']");



By.xpath("//android.widget.TextView[@text='Tap to See Transactions']");


BY INDEX
By.XPath("//android.view.ViewGroup[2]/android.widget.EditText[@index='0']");


By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")



RUNNING CUCUMBER JSON REPORT 
mvn clean verify
mvn verify -DskipTests
=====================================================================================================


Appium Inspector Properties

{
  "platformName": "Android",
  "platformVersion": "11",
  "deviceName": "Samsung Galaxy S5",
  "automationName": "Appium",
  "app": "C:\\Users\\abc\\Desktop\\apk\\KamelPay.apk"
}

===========================================================================

git checkout master
Now pull the latest changes in master,

git pull origin master
Merge with the testBranch

git merge testBranch
Push the changes to master

git push origin master
============================
