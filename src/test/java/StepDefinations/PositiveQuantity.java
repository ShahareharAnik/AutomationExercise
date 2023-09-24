package StepDefinations;

import POM.ProductBuying;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static StepDefinations.HomePage.driver;

public class PositiveQuantity {
    ProductBuying pos;
    @Given("Go to the Product again")
    public void goToTheProductAgain() {
        pos = new ProductBuying(driver);
        System.out.println("Now Get some positive Quantity");
    }

    @When("Adds {string}")
    public void addsPositiveQuantity(String s) throws InterruptedException {
        pos.ResetQuantityAmount();
        pos.QuantityAmount(s);
    }

    @And("And Add to Cart and Continue shopping.")
    public void andAddToCartAndContinueShopping() throws InterruptedException {
        pos.AddToCart();
        pos.Continue();
        pos.Cart();
    }
    @And("Verified product {string}")
    public void verifiedProductPPrice(String p) {
        pos.Price(p);
    }

    @And("Verified also{string}")
    public void verifiedAlsoPQuantities(String q) {
        pos.QuantityShow(q);
    }

    @And("again Verified{string}")
    public void againVerifiedPositive_total(String t) {
        pos.TotalAmmount(t);
    }
}
