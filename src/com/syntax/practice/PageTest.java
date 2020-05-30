package com.syntax.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class PageTest {
   
	WebDriver driver;
	
	@BeforeMethod 
	public void openBrowser () {
		
		DriverInit instanceDriver=DriverInit.getInstance();
		driver=instanceDriver.openBrowser();
	}
	
	@Test
	public void testMethod1 () {
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void closeBrowser () {
		driver.quit(); 
	}
	
	
	
}
