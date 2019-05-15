package co.uk.test.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//C:\Workspace\TestAutomation\src\test\resources\features\bank\BankLogin.feature
@CucumberOptions(
        features = "C:\\Workspace\\TestAutomation\\src\\test\\resources\\features\\",
        glue = {"co.uk.test"},
        tags = {"@Bank"}
)
public class BankTestRunner {
}
