import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenarioNo_002 {
    private WebDriver driver;

    @When("I open main page.")
    public void iOpenMainPage() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://qainterview.pythonanywhere.com/");
    }

    @And("I fill in with {string}")
    public void iFillInWith(String arg0) {
        WebElement element = driver.findElement(By.id("number"));
        element.sendKeys(arg0);
    }

    @And("Push calculate button")
    public void pushCalculateButton() {
        WebElement calcButton = driver.findElement(By.id("getFactorial"));
        calcButton.click();
    }

    @Then("Check feedback information from page")
    public void checkFeedbackInformationFromPage() {

        driver.close();


    }
}
