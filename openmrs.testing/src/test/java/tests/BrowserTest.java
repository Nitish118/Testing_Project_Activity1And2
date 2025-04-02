package tests;

import org.testng.annotations.Test;
import utilities.BaseTest;

public class BrowserTest extends BaseTest {

    @Test
    public void testOpenMRSLoginPage() {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
    }
}
