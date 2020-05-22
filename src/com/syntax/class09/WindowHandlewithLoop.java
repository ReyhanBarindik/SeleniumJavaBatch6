package com.syntax.class09;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlewithLoop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		for (int i=0; i<=3; i++) {
			driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
		}
		
		Set<String> allWindowsHandles= driver.getWindowHandles();
		
		for (String handle : allWindowsHandles) {
			System.out.println("Id Of the Window is :: "+handle);
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			
			
		}
		
		
		
		
		
		
		
	}

}
