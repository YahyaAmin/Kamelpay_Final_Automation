
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
        tags = "@Settingstest29 or @Settingstest28 or @Settingstest27 or @Settingstest26 or @Settingstest14 or @Settingstest04 or @Sendmoney07 or @Sendmoney04 or @PayBillTest32 or @PayBillTest31 or @PayBillTest17 or @PayBillTest04 or @Logintest04 or @CardManagement20 or @CardManagement18 or @CardManagement17 or @CardManagement16 or @CardManagement15 or @CardManagement14 or @CardManagement12 or @CardManagement11 or @CardManagement10 or @CardManagement09 or @CardManagement08 or @CardManagement07 or @CardManagement05"
)

//Example of logical tags:     tags = "@smoketest or @regression"
//@Signuptest or @Logintest or @CardManagement or @MobileTopUpCase or @PayBillTest or @Sendmoney or @Settingstest or @MyCountryTest

//@Logintest @Signuptest @CardManagement @MobileTopUpCase
//@PayBillTest @Sendmoney @Settingstest @MyCountryTest

public class Runner  {

}
