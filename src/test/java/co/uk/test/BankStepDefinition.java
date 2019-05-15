package co.uk.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankStepDefinition {
    private WebDriver driver;

    @cucumber.api.java.en.Given("^I am a valid customer$")
    public void iAmAValidCustomer()
    {
        getDriverManager();
    }

    @cucumber.api.java.en.And("^I go to bank login page$")
    public void iGoToBankLoginPage() {
        System.out.println("Test commit");
        driver.get("https://internet-banking.retail.dbsbank.in/login");

    }

    @cucumber.api.java.en.And("^I enter (.*) as (.*)$")
    public void iEnterGopiAsUserName(String value, String field) {
        driver.findElement(By.xpath("//input[@name='" + field + "']")).sendKeys(value);
    }

    @cucumber.api.java.en.When("^I press login button$")
    public void iPressLoginButton() {
        iWaitMinutes(5000);
        driver.findElement(By.xpath("//*[@id=\"bodyWrap\"]/div/div[2]/div[1]/div[2]/form/button")).click();

    }

    @cucumber.api.java.en.Then("^I am on home page$")
    public void iAmOnHomePage() {

        waituntil();

    }

    public void getDriverManager() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi Jayabalan\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();

    }

    @And("^I wait (\\d+) minutes$")
    public void iWaitMinutes(int minutes) {
        try {
            Thread.sleep(minutes);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^I click menu button$")
    public void iClickMenuButton() {
        waituntil();
driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div[1]/div/div[2]"));

    }

    public void waituntil() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menuIcon']")));
    }


}
