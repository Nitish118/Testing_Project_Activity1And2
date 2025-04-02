package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By locationDropdown = By.id("sessionLocation");
    private By loginButton = By.id("loginButton");
    private By errorMessage = By.id("error-message"); 

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void selectLocation() {
        driver.findElement(locationDropdown).click();
        driver.findElement(By.xpath("//li[contains(text(),'Inpatient Ward')]")).click();
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
