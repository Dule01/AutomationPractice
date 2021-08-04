package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/automationpractice.feature",
        glue = "steps",
        plugin = {"pretty","html:test-output",
            "json:target/cucumber-report/cucumber.json",
            "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)

public class AutomationTestRunner extends AbstractTestNGCucumberTests {

}
