package StepDefinations;

import POM.Checkout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static StepDefinations.HomePage.driver;

public class CheckoutAndConfirmation {
    Checkout chk;
    @Given("The Product is ready to check out")
    public void theProductIsReadyToCheckOut() {
        chk = new Checkout(driver);
        System.out.println("The product is ready to checkout");
    }

    @And("Processed  to checkout")
    public void processedToCheckout() throws InterruptedException {
        chk.Checkout();
    }

    @And("Delivery Address and Billing address verified")
    public void deliveryAddressAndBillingAddressVerified() {
        chk.AddressCheck();
    }

    @Then("Place order")
    public void placeOrder() throws InterruptedException {
        chk.order();
        Thread.sleep(2000);
    }
}
