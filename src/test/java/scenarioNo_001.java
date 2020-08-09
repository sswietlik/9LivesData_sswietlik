import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenarioNo_001 {
    private WebDriver driver;

    @Given("Opened main page")
    public void openedMainPage() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(1280,960));
        driver.get("http://qainterview.pythonanywhere.com/");
    }

    @And("Localize input field and insert incorrect {string}")
    public void localizeInputFieldAndInsertIncorrectDigits(String arg0) {
        WebElement element = driver.findElement(By.id("number"));
        element.sendKeys(arg0);
    }

    @And("Push calculate button to verify result")
    public void pushCalculateButtonToVerifyResult() {
        WebElement calcButton = driver.findElement(By.id("getFactorial"));
        calcButton.click();
    }

    @Then("Check error message")
    public void checkErrorMessage() {
        WebElement message = driver.findElement(By.cssSelector("#resultDiv"));
//        String msg = message.getText();
        driver.findElement(By.id("resultDiv")).getText().contains("Please enter an integer");
////
        if (message.getText().contains("Please enter an integer")){
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

}
