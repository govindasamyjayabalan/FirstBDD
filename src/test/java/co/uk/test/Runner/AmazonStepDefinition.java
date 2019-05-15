package co.uk.test.Runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStepDefinition

{
    @Given("^To move the mouse pointer over sign in button$")
    public void toMoveTheMousePointerOverSignInButton() {
    }
    @And("^I go to amazon home page$")
    public void iGoToAmazonHomePage() {
    }

    @When("^I move the mouse over sign in button$")
    public void iMoveTheMouseOverSignInButton() {
    }

    @Then("^The drop down appears$")
    public void theDropDownAppears() {
    }
    public void getDriverManager() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi Jayabalan\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();

    }

}
