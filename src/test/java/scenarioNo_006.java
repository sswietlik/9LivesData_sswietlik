import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenarioNo_006 {
    private WebDriver driver;
    @When("Open main page")
    public void openMainPage() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://qainterview.pythonanywhere.com/");
    }

    @And("get actual tab title")
    public void getActualTabTitle() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

    }

    @Then("Comparison expected tab vs. actual tab.")
    public void comparisonExpectedTabVsActualTab() {
        String expectedTitle = "Factorial";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle,actualTitle);
    }
}
