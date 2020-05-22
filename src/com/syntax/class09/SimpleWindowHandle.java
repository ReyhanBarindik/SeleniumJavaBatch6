package com.syntax.class09;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup");
		
		String signUpTitle=driver.getTitle();
		
		System.out.println("Main page Title is :: "+signUpTitle);

		driver.findElement(By.linkText("Help")).click();
		
		//How to get window handle ? 
		//In Selenium We have 2 methods for it. 
		//getWindowHandle();
		//getWindowHandles();
		
		
		Set<String>allWindows=driver.getWindowHandles();
		//Returns Set of String IDs of all windows currently opened by the current intance. 
		System.out.println("Number of Windows opened are :: "+allWindows.size());
		
		Iterator<String>it=allWindows.iterator();
		
		String mainWindowHandle= it.next();
		System.out.println("ID of Main Window :: "+mainWindowHandle);
		String childWindowHandle= it.next();
		System.out.println("ID of Child Window :: "+childWindowHandle);
		
		driver.switchTo().window(childWindowHandle);
		String childWindowTitle=driver.getTitle();
		System.out.println("Child page Title is :: "+childWindowTitle);
		
		//driver.close();
		
		
		
		
		
		
		
		
	}

}
