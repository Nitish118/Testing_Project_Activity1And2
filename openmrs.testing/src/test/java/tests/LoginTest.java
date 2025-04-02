package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BaseTest;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("wrongPass");
        loginPage.selectLocation();
        loginPage.clickLogin();
        
        Assert.assertTrue(loginPage.getErrorMessage().contains("Invalid username/password"),
                "Error message not displayed for invalid login");
    }

    @Test(priority = 2)
    public void testBlankLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("");
        loginPage.enterPassword("");
        loginPage.selectLocation();
        loginPage.clickLogin();
        
        Assert.assertTrue(loginPage.getErrorMessage().contains("Invalid username/password"),
                "Error message not displayed for blank login");
    }

    @Test(priority = 3)
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin");
        loginPage.enterPassword("Admin123");
        loginPage.selectLocation();
        loginPage.clickLogin();

        // Validate successful login by checking the title or dashboard element
        Assert.assertTrue(driver.getTitle().contains("Home"), "Login failed!");
    }
}
