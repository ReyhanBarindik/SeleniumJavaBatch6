package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdPractice {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");     
           
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Reyhn");
		    
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rbbbb");
		
			driver.findElement(By.xpath("//input[@value='Log In']")).click();

			//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rrrrrrr");     ----> Syntax of css Selector 
			//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("bbbbb");
			
			//driver.findElement(By.cssSelector("input#email")).sendKeys("RRRRRR");    ----> another way Syntax of css Selector 
			//driver.findElement(By.cssSelector("input.loginError")).sendKeys("ReyhanB");  ---->  another way CSS
	}

}
