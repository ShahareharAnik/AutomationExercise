package StepDefinations;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static StepDefinations.HomePage.driver;

public class SignUP {

    WebElements web;
    @Given("SignUp page entry")
    public void signupPageEntry() throws InterruptedException {
        web = new WebElements(driver);
        Thread.sleep(2000);
        web.SignORLog();
    }

    @When("New User SignUp by {string} and {string}")
    public void newUserSignUpByNameAndEmail(String n, String e) throws InterruptedException {

        web.username(n);
        web.Email(e);
        web.SignUP();

    }

    @And("Set Title , {string} and Date of birth")
    public void setTitlePasswordAndDateOfBirth(String p) throws InterruptedException {
        web.Title();
        web.password(p);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        web.Day();
        web.Month();
        web.Year();
    }

    @And("Address Information By {string} , {string} , {string} , {string} And {string}")
    public void addressInformationByFirstNameLastNameCompanyAddressAndAddress( String F, String L, String C, String A, String A1) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        web.ClickMenu();
        Thread.sleep(2000);

        web.FirstName(F);
        web.LastName(L);
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        web.Company(C);
        web.Addrs(A);
        web.Addrs2(A1);


    }

    @And("Set Country {string} , {string}, {string} and {string}")
    public void setCountryStateCityZipCodeAndMobileNumber(String S, String C, String Z, String M) throws InterruptedException {
        web.country();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        web.State(S);
        web.City(C);
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        web.Zip(Z);
        web.MobileNum(M);
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

    @Then("Create Account")
    public void createAccount() throws InterruptedException {
        web.CreateAccount();
    }

    @And("logout")
    public void logout() throws InterruptedException {
        web.Logout();
    }
}
