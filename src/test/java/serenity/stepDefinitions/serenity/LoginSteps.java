package serenity.stepDefinitions.serenity;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by arushsin on 4/26/2016.
 */
public class LoginSteps {
    WebDriver driver;

    @Step
    public void opens_home_page() {
        System.setProperty("webdriver.chrome.driver", "D:/Users/arushsin/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://in-air-aciscoe1/webcoe2");
    }

    @Step
    public void should_enter_the_username(String keyword) {
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(keyword, Keys.ENTER);

    }

    @Step
    public void should_enter_the_password(String keyword) {
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(keyword, Keys.ENTER);

    }

    @Step
    public void click_the_button() {
        //if (driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
        try
        {
            if (driver.findElement(By.xpath(".//*[@id='btnLogin']")) != null)
            {
                driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
            }
        }
        catch (Exception e)
        {
            System.out.print(e);
            System.out.println("Element not Found");
        }


    }

    @Step
    public void should_enter_the_firstname(String keyword) {
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys(keyword, Keys.ENTER);
    }

    @Step
    public void should_enter_the_lastname(String keyword) {
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys(keyword, Keys.ENTER);

    }

    @Step
    public void should_enter_the_email(String keyword) {
        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys(keyword, Keys.ENTER);
    }

}
