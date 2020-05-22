package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task02 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 2: Opening Page on Firefox Browser Open Firefox browser Navigate to
		 * “https://www.redfin.com/” Verify that you have navigated to
		 * (https://www.redfin.com/) End the Session (close the browser).
		 */

		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("https://www.redfin.com/");
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.redfin.com/";
		
		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			String title= driver.getTitle();
			System.out.println(title);
		} else {
			System.out.println("Wrong url entered.");
		}
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		
		
	}

}
