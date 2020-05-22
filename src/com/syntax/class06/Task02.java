package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class Task02 extends BaseClass {

	public static void main(String[] args) {

		/*
		 * TC 2: HRMS Application Negative Login: Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
		 * valid username Leave password field empty Verify error message with text
		 * “Password cannot be empty” is displayed.
		 */

		
		setUp ();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigsReader.getProperty("username"));

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ConfigsReader.getProperty("password"));

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement spanMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		
		String text=spanMessage.getText();
		
		boolean isDisplay= spanMessage.isDisplayed();
		
		if (isDisplay) {
			System.out.println(text +" is displayed");
		} else {
			System.out.println(text +"is not displayed");
		}
		
		
		
	}

}
