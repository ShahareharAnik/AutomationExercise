package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Checkout {
    private WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    By Checkout = By.xpath("//a[contains(text(),'Proceed To Checkout')]");
    By DeliveryAddress = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[1]/ul[1]/li[8]");
    By BillingAddress = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/ul[1]/li[8]");
    By placeOrder = By.xpath("//a[contains(text(),'Place Order')]\n");

    public void Checkout() throws InterruptedException {
        driver.findElement(Checkout).click();
        Thread.sleep(2000);
    }
    public void AddressCheck(){
        String Delivery = driver.findElement(DeliveryAddress).getText();
        String Billing = driver.findElement(BillingAddress).getText();
        if(Delivery.equals(Billing)){
            System.out.println("Both address are same");
        }
        else {
            System.out.println("These address are not same");
        }
    }
    public void order(){
        driver.findElement(placeOrder).click();
    }
}
