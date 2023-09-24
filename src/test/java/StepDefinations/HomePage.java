package StepDefinations;

import Core.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class HomePage {
    static WebDriver driver;
    //WebElements web;
    @Given("visit the Website")
    public void visitTheWebsite() {
        Helper hp = new Helper();
        driver = hp.chromeLaunch();


    }

    @Then("The home page is visible successfully")
    public void theHomePageIsVisibleSuccessfully() throws InterruptedException {
        System.out.println("The HomePage is visible successfully");
        Thread.sleep(2000);
    }
}
