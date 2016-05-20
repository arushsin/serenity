package serenity.runTests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenity.stepDefinitions.serenity.LoginSteps;

/**
 * Created by arushsin on 4/26/2016.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/resources/features/LoginFeature.feature"}, glue = {"serenity.runTests.scenarios", "cucumber.api.spring"})
public class LoginRunner {
    @Steps
    LoginSteps login;

    @Managed
    WebDriver dr;


    @Test
    public void should_be_able_to_login() {

.
}

    /**login.opens_home_page();
    login.should_enter_the_username("arushi");
    login.should_enter_the_password("Pass-123");
    login.click_the_button();
    login.should_enter_the_firstname("Arushi");
    login.should_enter_the_lastname("Singh");
    login.should_enter_the_email("arushi.a.singh@capgemini.com");
    }**/
}
