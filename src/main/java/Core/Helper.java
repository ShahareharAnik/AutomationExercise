package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Helper {
    public WebDriver driver;

    public WebDriver chromeLaunch() {
        // Set up ChromeOptions
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        Map<String, Map<String, Integer>> profile = new HashMap<>();
        Map<String, Integer> contentSettings = new HashMap<>();
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
        options.addExtensions(new File("src\\main\\java\\Extensions\\AdBlock.crx"));

        // Initialize WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        // Get the window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Iterate through the handles and close the additional tab
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                // Switch to the new tab and close it
                driver.switchTo().window(windowHandle);
                driver.close();
            }
        }

        // Switch back to the original tab
        driver.switchTo().window(currentWindowHandle);

        // Navigate to a webpage and maximize the window
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();

        return driver;
    }

}



