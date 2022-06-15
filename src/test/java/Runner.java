
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        monochrome = true,
        glue = {"Step_Definitions","Hooks"},
        plugin = {"pretty", "html:target/Reports/HtmlReport/report.html",
                  "pretty", "json:target/Reports/JSONReport/report.json",
                  "pretty", "junit:target/Reports/XMLReports/report.xml" },
        tags = "@Logintest"
)

//Example of logical tags:     tags = "@smoketest or @regression"

public class Runner  {

}
