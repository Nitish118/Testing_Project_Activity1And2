package stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
   
	WebDriver driver;
	@Given("open the openMRS website")
	public void navigate() {
		driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/referenceapplication/login.page");
	}
	
	@When("login to the account")		
public void login() {

	By clickon=By.xpath("//*[@id=\"Inpatient Ward\"]");
	
	
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		driver.findElement(clickon).click();
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}
	@Then("Register and edit the account")
	public void Register() throws InterruptedException {
		By reg = By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]");
		
		driver.findElement(reg).click();
		driver.findElement(By.name("givenName")).sendKeys("Bruce");
		driver.findElement(By.name("middleName")).sendKeys("new");
		driver.findElement(By.name("familyName")).sendKeys("Wayne");
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		
		
		WebElement dropdown = driver.findElement(By.id("gender-field")); // Replace with actual ID
		Select select = new Select(dropdown);
        select.selectByValue("M");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.name("birthdateDay")).sendKeys("10");
        driver.findElement(By.name("birthdateYear")).sendKeys("2000");
        
        WebElement dropdown1 = driver.findElement(By.id("birthdateMonth-field")); // Replace with actual ID
		Select mon = new Select(dropdown1);
        mon.selectByValue("2");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Bengaluru");
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.name("phoneNumber")).sendKeys("8927832986");
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        WebElement dropdown2 = driver.findElement(By.id("relationship_type")); // Replace with actual ID
		Select type = new Select(dropdown2);
        type.selectByValue("8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
        
        driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]")).sendKeys("Spiderman");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(1000);
        
        Thread.sleep(1000);
        
		driver.findElement(By.xpath("//*[@id=\"edit-patient-demographics\"]/a")).click();
		driver.findElement(By.name("middleName")).sendKeys("batman");
		driver.findElement(By.xpath("//*[@id=\"save-form\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"registration-submit\"]")).click();
        
       
			    		
    	
        
        
       
		
	}
}