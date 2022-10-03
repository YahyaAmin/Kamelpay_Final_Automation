import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",            //@Cucumber.Options(features={"login.feature", "smoketest.feature"}) for priority
        monochrome = true,
        glue = {"Step_Definitions","Hooks"},
        plugin = {"pretty", "html:target/Reports/HtmlReport/report.html",
                  "pretty", "json:target/Reports/JSONReport/report.json",
                  "pretty", "junit:target/Reports/XMLReports/report.xml",
                  "json:target/cucumber.json" },
        tags = "@MyCountryTest4 or @MyCountryTest12 or @MyCountryTest17 or @MyCountryTest18 or @MyCountryTest19 or @MyCountryTest20 or @PayBillTest03 or @PayBillTest04 or @PayBillTest07 or @PayBillTest08 or @PayBillTest15 or @PayBillTest17 or @PayBillTest27 or @PayBillTest31 or @PayBillTest32 or @Sendmoney01 or @Sendmoney04 or @Sendmoney05 or @Sendmoney13 or @Sendmoney16 or @Signuptest19"
)

//Example of logical tags:     tags = "@smoketest or @regression"
//@Signuptest or @Logintest or @CardManagement or @MobileTopUpCase or @PayBillTest or @Sendmoney or @Settingstest or @MyCountryTest or @Discountstest

//@Signuptest  @Logintest @CardManagement @MobileTopUpCase @PayBillTest
//@Sendmoney @Settingstest @MyCountryTest

public class Runner  {

}


