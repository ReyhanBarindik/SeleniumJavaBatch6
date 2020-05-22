package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");     
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Reyhan");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Bar");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		

	}

}
