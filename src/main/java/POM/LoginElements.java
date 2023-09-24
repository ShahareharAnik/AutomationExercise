package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginElements {
    private WebDriver driver;

    public LoginElements(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    By LoginMail = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]");
    By LoginPass = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]");
    By LoginButton = By.xpath("//button[contains(text(),'Login')]");
    By ErrorMassage = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");


    public void LogMail(String s) throws InterruptedException {
        driver.findElement(LoginMail).click();
        driver.findElement(LoginMail).clear();
        Thread.sleep(1000);
        driver.findElement(LoginMail).sendKeys(s);
    }
    public void Logpass(String p) throws InterruptedException {
        driver.findElement(LoginPass).click();
        driver.findElement(LoginPass).clear();
        Thread.sleep(1000);
        driver.findElement(LoginPass).sendKeys(p);

    }
    public void loginButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(LoginButton).click();

    }
    public void massage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(ErrorMassage).click();
        String actualErrorMessage = ErrorMassage.toString();
        // Compare the actual error message with the expected error message
        String expectedErrorMessage = "Your email or password is incorrect!";

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification successful: " + actualErrorMessage);
        } else {
            System.out.println("Error message verification failed. Expected: " + expectedErrorMessage +
                    ", Actual: " + actualErrorMessage);
        }

    }

}
