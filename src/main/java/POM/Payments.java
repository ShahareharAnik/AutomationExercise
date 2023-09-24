package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Payments {
    private WebDriver driver;

    public Payments(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    By CardName = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
    By CardNumber = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]");
    By CVCNum = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]");
    By Expansion = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]");
    By Year = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]");
    By PaymentSubmit = By.xpath("//button[@id='submit']");
    By DownloadInvoice = By.xpath("//a[contains(text(),'Download Invoice')]");
    By logouts = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");

    public void CName(String n) throws InterruptedException {
        driver.findElement(CardName).click();
        Thread.sleep(500);
        driver.findElement(CardName).sendKeys(n);
    }
    public void CNum(String s) throws InterruptedException {
        driver.findElement(CardNumber).click();
        Thread.sleep(500);
        driver.findElement(CardNumber).sendKeys(s);
    }
    public void Cvc(String c) throws InterruptedException {
        driver.findElement(CVCNum).click();
        Thread.sleep(500);
        driver.findElement(CVCNum).sendKeys(c);
    }
    public void Expension(String e) throws InterruptedException {
        driver.findElement(Expansion).click();
        Thread.sleep(500);
        driver.findElement(Expansion).sendKeys(e);
    }
    public void Year(String y) throws InterruptedException {
        driver.findElement(Year).click();
        Thread.sleep(500);
        driver.findElement(Year).sendKeys(y);
    }
    public void Submit() throws InterruptedException {
        driver.findElement(PaymentSubmit).click();
        Thread.sleep(500);

    }
    public void Invoice() throws InterruptedException {
        driver.findElement(DownloadInvoice).click();
        Thread.sleep(200);
    }

    public void logout() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(logouts).click();
    }

}
