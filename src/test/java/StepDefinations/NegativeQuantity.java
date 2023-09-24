package StepDefinations;

import POM.ProductBuying;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinations.HomePage.driver;

public class NegativeQuantity {
    ProductBuying neg;
    @Given("The Product is Selected")
    public void theProductIsSelected() {
        neg = new ProductBuying(driver);
        System.out.println("The product is selected");

    }

    @When("Add {string}")
    public void addNegativeQuantity(String s) throws InterruptedException {
        neg.QuantityAmount(s);

    }

    @And("Add to Cart and Continue shopping")
    public void addToCartAndContinueShopping() throws InterruptedException {
        neg.AddToCart();
        Thread.sleep(1000);
        neg.Continue();
        Thread.sleep(1000);
        neg.Cart();
    }


    @And("Verified {string}")
    public void verifiedPrice(String  p) {
        neg.Price(p);

    }

    @And("again Verified {string}")
    public void againVerifiedQuantities(String q) {
        neg.QuantityShow(q);

    }

    @And("also Verified {string}")
    public void alsoVerifiedNegative_total(String t) {
        neg.TotalAmmount(t);
    }

    @Then("Go back to Product view page")
    public void goBackToProductViewPage() {
        driver.navigate().back();
    }
}
