import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenarioNo_005 {
    private WebDriver driver;
    @Given("User is on Main page factorialCalc")
    public void userIsOnMainPageFactorialCalc() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://qainterview.pythonanywhere.com/");
    }

    @When("Localized Copyright link and open Qxf2 Services Page")
    public void localizedCopyrightLinkAndOpenQxf2ServicesPage() {
//        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/p[2]/a"));
        WebElement element = driver.findElement(By.partialLinkText("Qxf2"));
        element.click();
    }

    @Then("Check Qxf2 Services URL is correct")
    public void checkQxf2ServicesURLIsCorrect() {
        String expectedURL = "https://qxf2.com/?utm_source=qa-interview&utm_medium=click&utm_campaign=From%20QA%20Interview";
        System.out.println("expected URL is : "+ expectedURL);
        System.out.println("actual URL is   : "+ driver.getCurrentUrl());
        Assertions.assertEquals(expectedURL, driver.getCurrentUrl());
        driver.close();

    }
}


