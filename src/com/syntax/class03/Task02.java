package com.syntax.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * TC 2: Syntax Page URL Verification: Open chrome browser Navigate to
		 * “https://www.zillow.com/” Navigate to “https://www.google.com/” Navigate back
		 * to Zillow Page Refresh current page Verify url contains “Zillow”
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.zillow.com/");

		driver.navigate().to("https://www.google.com/");

		driver.navigate().back();

		String url = driver.getCurrentUrl();

		if (url.contains("Zillow")) {
			driver.navigate().refresh();
		}

	}

}
