package StepDefinations;

import POM.ProductBuying;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import static StepDefinations.HomePage.driver;

public class ProductSelection {
    ProductBuying pod;
    @Given("Go to the Product menu")
    public void goToTheProductMenu() throws InterruptedException {
        pod = new ProductBuying(driver);
        pod.Product();
    }

    @When("Search {string}")
    public void searchDesiredProduct(String s) throws InterruptedException {
        pod.Search(s);
    }

    @Then("View Product")
    public void viewProduct() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        pod.View();
    }
}
