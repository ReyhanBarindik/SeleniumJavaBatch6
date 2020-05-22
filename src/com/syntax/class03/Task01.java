package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * TC 1: Facebook sign up: Open chrome browser Go to “https://www.facebook.com/”
		 * Enter first name Enter last name Enter mobile number Click on sign up button
		 * 
		 */

		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Reyhane");
		driver.findElement(By.name("lastname")).sendKeys("Idiz");
		driver.findElement(By.id("u_0_r")).sendKeys("9999999999");
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
