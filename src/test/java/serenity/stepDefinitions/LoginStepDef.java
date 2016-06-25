package serenity.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import serenity.stepDefinitions.serenity.LoginSteps;

/**
 * Created by arushsin on 4/26/2016.
 */
public class LoginStepDef {
    @Steps
    LoginSteps login;

    @Given("I am on the homepage$")
    public void i_am_on_the_homepage() {
        login.opens_home_page();
    }

    @Then("I should enter the username (.*)")
    public void i_should_enter_the_username(String keyword) {
        //WebElement username = driver.findElement(By.name("username"));
        login.should_enter_the_username(keyword);
    }

    @Then("I should enter the password (.*)")
    public void i_should_enter_the_password(String keyword) {
        login.should_enter_the_password(keyword);
    }

    @And("I click the login button")
    public void i_click_the_button() {
        login.click_the_button();
    }

    @And("I should enter the firstname (.*)")
    public void i_should_enter_the_firstname(String keyword) {
        login.should_enter_the_firstname(keyword);
    }

    @And("I should enter the lastname (.*)")
    public void iShouldEnterTheLastnameSingh(String keyword) {
        // Write code here that turns the phrase above into concrete actions
        login.should_enter_the_lastname(keyword);
    }

    @And("I should enter the email (.*)")
    public void iShouldEnterTheEmail(String keyword) {
        login.should_enter_the_email(keyword);
    }

}
