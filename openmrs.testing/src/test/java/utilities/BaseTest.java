package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    
    public WebDriver driver;

    @BeforeTest
    public void setupBrowser() {
        driver = new ChromeDriver(); // No manual path needed
        driver.manage().window().maximize();
        driver.get("https://o2.openmrs.org/openmrs/login.htm");
    }

    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
