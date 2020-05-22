package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");     

		driver.findElement(By.cssSelector("#username")).sendKeys("Reyh");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("Barin");
		
		driver.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		
		
		
	}

}
