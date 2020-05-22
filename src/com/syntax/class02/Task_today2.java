package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_today2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Reyhan");
		driver.findElement(By.name("lastName")).sendKeys("Barindik");
		driver.findElement(By.name("phone")).sendKeys("9043121144");
        driver.findElement(By.name("userName")).sendKeys("reyhaneidiz92@gamil.com");
        driver.findElement(By.name("address1")).sendKeys("8601 Beach Blvd. Apt 506");
        driver.findElement(By.name("city")).sendKeys("Jacksonville");
        driver.findElement(By.name("state")).sendKeys("Florida");
        driver.findElement(By.name("postalCode")).sendKeys("32216");
        driver.findElement(By.name("email")).sendKeys("reyB");
        driver.findElement(By.name("password")).sendKeys("reyB123");
        driver.findElement(By.name("confirmPassword")).sendKeys("reyB123");
        driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(18) td:nth-child(1) > input:nth-child(1)")).click();
        
	}

}
