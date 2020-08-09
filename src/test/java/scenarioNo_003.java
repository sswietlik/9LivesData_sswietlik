import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenarioNo_003 {
    private WebDriver driver;
    @Given("User is on MainPage")
    public void userIsOnMainPage() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(960,720));
        driver.get("http://qainterview.pythonanywhere.com/");

    }

    @When("Click into Terms and Condition link and Open Page")
    public void clickIntoTermsAndConditionLinkAndOpenPage() {
        WebElement element = driver.findElement(By.cssSelector("p.margin-base-vertical:nth-child(1) > a:nth-child(1)"));
        element.click();
    }

    @Then("Check correct link is opened")
    public void checkCorrectLinkIsOpened() {
        String baseURL = "http://qainterview.pythonanywhere.com/terms";
        System.out.println("expected URL is : "+ baseURL);
        System.out.println("actual URL is   : "+ driver.getCurrentUrl());
        Assertions.assertEquals(baseURL, driver.getCurrentUrl());
        driver.close();

    }
}
