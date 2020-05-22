package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * TC 1: Amazon Page Title Verification: Open chrome browser Go to
		 * “https://www.amazon.com/” Verify Title “Amazon.com: Online Shopping for
		 * Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		 * 
		 */

		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.amazon.com/");
		
		String verifyTitle= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		String actual = driver.getTitle();
		
		if (actual.equalsIgnoreCase(verifyTitle)) {
			String title= driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong Url is returned");
		}
		
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
