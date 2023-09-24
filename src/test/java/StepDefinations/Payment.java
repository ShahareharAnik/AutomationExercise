package StepDefinations;

import POM.Payments;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import static StepDefinations.HomePage.driver;

public class Payment {
    Payments pay;
    @Given("Payment information page displayed")
    public void paymentInformationPageDisplayed() {
        pay = new Payments(driver);
        System.out.println("the payment page is displayed");

        
    }

    @And("Give the Card Holder {string}")
    public void giveTheCardHolderName(String s) throws InterruptedException {
        pay.CName(s);
        
    }

    @And("Give the card {string}")
    public void giveTheCardNumber(String s) throws InterruptedException {
        pay.CNum(s);
    }

    @And("The {string} number")
    public void theCVCNumber(String s) throws InterruptedException {
        pay.Cvc(s);
    }

    @And("The {string}")
    public void theExpansion(String s) throws InterruptedException {
        pay.Expension(s);
    }

    @And("Expired {string}")
    public void expiredYear(String y) throws InterruptedException {
        pay.Year(y);
    }

    @And("payment Submit")
    public void paymentSubmit() throws InterruptedException {
        pay.Submit();
    }

    @And("Download invoice Text file")
    public void downloadInvoiceTextFile() throws InterruptedException {
        pay.Invoice();

    }

    @Then("logout form there")
    public void logoutFormThere() throws InterruptedException {
        pay.logout();
    }
}
