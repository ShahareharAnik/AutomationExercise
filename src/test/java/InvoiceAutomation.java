import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InvoiceAutomation {

    public static void main(String[] args) throws InterruptedException, IOException {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the page where the invoice can be downloaded
        driver.get("https://automationexercise.com/payment_done");

        // Locate and click the link to download the invoice
        WebElement downloadLink = driver.findElement(By.linkText("Download Invoice"));
        downloadLink.click();

        // Add a wait to allow the file to download
        Thread.sleep(5000); // Adjust this delay as needed

        // Verify if the invoice file exists
        String filePath = "src/test/resources/downloadfile/invoice.txt";
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            System.out.println("Invoice file exists.");

            // Verify the content of the invoice file
            String expectedContent = "Expected content in the invoice"; // Replace with your expected content
            String actualContent = new String(Files.readAllBytes(Paths.get(filePath)));
            if (actualContent.contains(expectedContent)) {
                System.out.println("Invoice content verification successful.");
            } else {
                System.out.println("Invoice content verification failed.");
            }

            // Delete the invoice file
            if (file.delete()) {
                System.out.println("Invoice file deleted successfully.");
            } else {
                System.err.println("Failed to delete the invoice file.");
            }
        } else {
            System.err.println("Invoice file does not exist.");
        }

    }
}
