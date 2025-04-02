package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import pages.HomePage;

public class RegisterPatientTest {
@Test
	public void login1() throws InterruptedException{
		
	
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://o2.openmrs.org/openmrs/referenceapplication/login.page");
	
	
	
	HomePage home = new HomePage(driver);
	home.login("test","test123");
	home.login(" ","");
	home.login("admin","Admin123");
	
	home.Register("Bruce","","Wayne");
	home.Editpage();

	}
}