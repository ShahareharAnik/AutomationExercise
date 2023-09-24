package StepDefinations;

import POM.LoginElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinations.HomePage.driver;

public class CorrectlyLogIn {
    LoginElements Clog;
    @Given("Showing the login Page with incorrect values")
    public void showingTheLoginPageWithIncorrectValues() {
        Clog = new LoginElements(driver);
        System.out.println("The Login Page is Showing");
    }

    @When("Input correct mail: {string}")
    public void inputCorrectMailEmail(String m) throws InterruptedException {
        Clog.LogMail(m);
    }

    @And("Input correct pass: {string}")
    public void inputCorrectPassPassword(String p) throws InterruptedException {
        Clog.Logpass(p);
    }

    @Then("Log in")
    public void logIn() throws InterruptedException {
        Clog.loginButton();
    }
}
