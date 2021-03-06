import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class scenarioNo_002 {
    private WebDriver driver;

    @When("I open main page.")
    public void iOpenMainPage() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(640,480));
        driver.get("http://qainterview.pythonanywhere.com/");
        driver.manage().deleteAllCookies();
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
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

    @And("Check feedback information from page")
    public void checkFeedbackInformationFromPage() {



        WebElement message = driver.findElement(By.cssSelector("#resultDiv"));
//        String msg = message.getText();
        driver.findElement(By.cssSelector("#resultDiv")).getText().contains("The factorial");
////
        if (message.getText().contains("The factorial of ")){
            Assertions.assertEquals(1,1);
        }
         else {
            Assertions.assertEquals(1,0);
        }
//         driver.quit();
//        System.out.println(msg.contains("The factorial of"));
//        driver.manage().deleteAllCookies();




        driver.close();


    }

//    @Then("close page")
//    public void closePage() {
//    }
}
