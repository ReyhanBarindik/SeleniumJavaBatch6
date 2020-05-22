package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gulsum {
public static String url= "https://www.facebook.com/";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
        driver.get(url);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gulsumince@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("zuhaira");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(@target,'Forgot Password?')]")).click();
}
}