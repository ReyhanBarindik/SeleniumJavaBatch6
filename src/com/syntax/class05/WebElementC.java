package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {
    
	
	public static String url = " http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx" ;
	
	public static String userName= "Tester";
	public static String password ="test";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		WebElement username=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		
	   username.sendKeys(userName);
	   Thread.sleep(1000);
	   username.clear();
	   username.sendKeys(userName);
	   WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
	   pass.clear();
	   Thread.sleep(1000);
	   pass.sendKeys(password);
	   WebElement loginBtn= driver.findElement(By.cssSelector("input[value='Login']"));
	   loginBtn.click();
	   boolean logoIsDisplay = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
	   if (logoIsDisplay) {
		   System.out.println("Logo is Display, Test Case Passed");
	   } else {
		   System.out.println("Logo is Not Display, Test Case Failed"); 
	   }
	   
	   WebElement loginInfo = driver.findElement(By.xpath("//div[@class='login_info']"));
	   String text = loginInfo.getText();
	   if (text.contains(userName)) {
		   System.out.println("User Successfully Logged in, Test Case Passed");
	   }else {
		   System.out.println("User is Not Logged in, Test Case Failed ");
	   }
	   
	   
	   
       
	   driver.quit();
	   
	   
	   
	   
	   
	   
	}

}
