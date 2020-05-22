package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Today {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");

		driver.findElement(By.id("pass")).sendKeys("syntax123");

		driver.findElement(By.id("u_0_b")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Forgot Password?")).click();

		
		
		
		
		
	}

}
