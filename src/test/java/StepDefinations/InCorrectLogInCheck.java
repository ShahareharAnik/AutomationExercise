package StepDefinations;

import POM.LoginElements;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinations.HomePage.driver;

public class InCorrectLogInCheck {
    LoginElements log;
    @Given("Showing the login Page")
    public void showingTheLoginPage() {
        log = new LoginElements(driver);
        System.out.println("The Login Page is Showing");
    }

    @When("Input Incorrect mail: {string}")
    public void inputIncorrectMailEmail(String m) throws InterruptedException {
        log.LogMail(m);
    }
    @And("Input Incorrect pass: {string}")
    public void inputIncorrectPassPassword(String p) throws InterruptedException {
        log.Logpass(p);
        log.loginButton();
    }
    @Then("check the error massage")
    public void checkTheErrorMassage() throws InterruptedException {
        log.massage();

    }




}
