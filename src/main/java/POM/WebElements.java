package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    private WebDriver driver;

    public WebElements(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    By SignupORLoginButton = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By Name = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]");
    By email = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]");
    By Signup = By.xpath("//button[contains(text(),'Signup')]");
    By Title = By.xpath("//input[@id='id_gender1']");
    By password = By.xpath("//input[@id='password']");
    By Day = By.xpath("//select[@id='days']");
    By DayNum = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/select[1]/option[3]");
    By Month = By.xpath("//select[@id='months']");
    By MonthNum = By.xpath("//option[contains(text(),'December')]");
    By Year = By.xpath("//select[@id='years']");
    By YearNum = By.xpath("//option[contains(text(),'1999')]");
    By Newsletter = By.xpath("//input[@id='newsletter']");
    By Offers = By.xpath("//input[@id='optin']");
    By Firstname = By.xpath("//input[@id='first_name']");
    By LastName = By.xpath("//input[@id='last_name']");
    By Company = By.xpath("//input[@id='company']");
    By Address = By.xpath("//input[@id='address1']");
    By Address2 = By.xpath("//input[@id='address2']");
    By Country = By.xpath("//select[@id='country']");
    By CountrySelect = By.xpath("//option[contains(text(),'India')]");
    By State = By.xpath("//input[@id='state']");
    By City = By.xpath("//input[@id='city']");
    By ZipCode = By.xpath("//input[@id='zipcode']");
    By MobileNumber = By.xpath("//input[@id='mobile_number']");
    By CreateAccount = By.xpath("//button[contains(text(),'Create Account')]");
    By logout = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    public void SignORLog () throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(SignupORLoginButton).click();
    }
    public void username(String n) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(Name).click();
        Thread.sleep(1000);
        driver.findElement(Name).sendKeys(n);
    }
//    public void Names(String n) throws InterruptedException {
//        Thread.sleep(1000);
//        driver.findElement(Name).click();
//    }
//    public void mail(String e){
//        driver.findElement(email).click();
//    }

    public void Email(String e) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(email).click();
        Thread.sleep(1000);
        driver.findElement(email).sendKeys(e);
    }
    public void SignUP() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(Signup).click();
    }
    public void Title() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Title).click();
    }
    public void password(String p) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(password).click();
        Thread.sleep(500);
        driver.findElement(password).sendKeys(p);
    }
    public void Day() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Day).click();
        Thread.sleep(500);
        driver.findElement(DayNum).click();
    }
    public void Month() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Month).click();
        Thread.sleep(500);
        driver.findElement(MonthNum).click();
    }
    public void Year() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Year).click();
        Thread.sleep(500);
        driver.findElement(YearNum).click();
    }
    public void ClickMenu() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Newsletter).click();
        Thread.sleep(500);
        driver.findElement(Offers).click();
    }
    public void FirstName (String F) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Firstname).click();
        Thread.sleep(500);
        driver.findElement(Firstname).sendKeys(F);
    }
    public void LastName (String L) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(LastName).click();
        Thread.sleep(500);
        driver.findElement(LastName).sendKeys(L);
    }
    public void Company (String C) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Company).click();
        Thread.sleep(500);
        driver.findElement(Company).sendKeys(C);

    }
    public void Addrs(String A1) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Address).click();
        Thread.sleep(500);
        driver.findElement(Address).sendKeys(A1);
    }
    public void Addrs2(String A2) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Address2).click();
        Thread.sleep(500);
        driver.findElement(Address2).sendKeys(A2);
    }

    public void State (String s) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(State).click();
        Thread.sleep(500);
        driver.findElement(State).sendKeys(s);
    }
    public void country () throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(Country).click();
        Thread.sleep(500);
        driver.findElement(CountrySelect).click();
    }
    public void City(String C) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(City).click();
        Thread.sleep(500);
        driver.findElement(City).sendKeys(C);
    }
    public void Zip(String Z) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(ZipCode).click();
        Thread.sleep(500);
        driver.findElement(ZipCode).sendKeys(Z);
    }
    public void MobileNum(String M) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(MobileNumber).click();
        Thread.sleep(500);
        driver.findElement(MobileNumber).sendKeys(M);
    }
    public void CreateAccount() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(CreateAccount).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
    }
    public void Logout() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(logout).click();
    }
}
