import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenarioNo_004 {
    private WebDriver driver;
    @Given("User is on Main page calc")
    public void userIsOnMainPageCalc() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://qainterview.pythonanywhere.com/");
    }

    @When("Click into Privacy link and Open Page")
    public void clickIntoPrivacyLinkAndOpenPage() {
        WebElement element = driver.findElement(By.cssSelector("p.margin-base-vertical:nth-child(1) > a:nth-child(2)"));
        element.click();
    }

    @Then("Check Privacy URL is correct")
    public void checkPrivacyURLIsCorrect() {
        String baseURL = "http://qainterview.pythonanywhere.com/privacy";
        System.out.println("expected URL is : "+ baseURL);
        System.out.println("actual URL is   : "+ driver.getCurrentUrl());
        Assertions.assertEquals(baseURL, driver.getCurrentUrl());
        driver.close();
    }
}

//
//
//    @When("Gdy użytkownik będąc na głównej stronie")
//    public void gdyUżytkownikBędącNaGłównejStronie() {
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("http://qainterview.pythonanywhere.com/");
//    }
//
//    @And("Uzupełnię okno liczbą całkowitą używając <liczba>")
//    public void uzupełnięOknoLiczbąCałkowitąUżywającLiczba() {
//        driver.findElement(By.name("number"));
//
//    }
//
//    @And("Wcisnę przycisk kalkulator")
//    public void wcisnęPrzyciskKalkulator() {
//        WebElement element = driver.findElement(By.id("getFactorial"));
//        element.click();
//    }
