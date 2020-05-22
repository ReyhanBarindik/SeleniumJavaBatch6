package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Using Css ONLY TC 2: Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info (skip dropdowns) Click Submit User successfully registered
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.cssSelector("a[href *='register']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("ReyhnB");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("BBB");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("999999");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("reyhanebarindik@icloud.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("8695 Blvd Apt 500");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Jacksonville");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Florida");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("99999");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("RB");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("55555");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("55555");
		driver.findElement(By.cssSelector("input[name='register']")).click();

	}

}
