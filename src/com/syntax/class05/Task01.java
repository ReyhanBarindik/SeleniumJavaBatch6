package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Using xPath ONLY TC 2: Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info (skip dropdowns) Click Submit User successfully registered
		 */

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ReyhanB");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("BBBBBBB");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("999999999");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("reyhaneidiz92@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("8695 Blvd Apt 500");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Jacksonville");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Florida");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("99999");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("RB");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("55555");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("55555");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
	}

}
