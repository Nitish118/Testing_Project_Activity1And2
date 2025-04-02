package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By clickon=By.xpath("//*[@id=\"Inpatient Ward\"]");
	By reg = By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]");
	
	public void login(String name,String password) {
		
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(clickon).click();
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}
	
	public void Register(String gname,String mname,String fname) throws InterruptedException {
		driver.findElement(reg).click();
		driver.findElement(By.name("givenName")).sendKeys(gname);
		driver.findElement(By.name("middleName")).sendKeys(mname);
		driver.findElement(By.name("familyName")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		
		
		WebElement dropdown = driver.findElement(By.id("gender-field")); 
		Select select = new Select(dropdown);
        select.selectByValue("M");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.name("birthdateDay")).sendKeys("10");
        driver.findElement(By.name("birthdateYear")).sendKeys("2000");
        
        WebElement dropdown1 = driver.findElement(By.id("birthdateMonth-field")); 
		Select mon = new Select(dropdown1);
        mon.selectByValue("1");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Bengaluru");
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.name("phoneNumber")).sendKeys("8928837489");
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        WebElement dropdown2 = driver.findElement(By.id("relationship_type")); 
		Select type = new Select(dropdown2);
        type.selectByValue("8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
        
        driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]")).sendKeys("spiderman");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(1000);
        
        
       
		
	}
	
	public void Editpage() throws InterruptedException {
		
		Thread.sleep(1000);
        
		driver.findElement(By.xpath("//*[@id=\"edit-patient-demographics\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"save-form\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"registration-submit\"]")).click();
	}
	
}