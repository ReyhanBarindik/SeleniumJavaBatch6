package com.syntax.class06;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class Task01 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * TC 1: HRMS Application Login: Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
		 * valid username and password Click on login button Then verify Syntax Logo is
		 * displayed.
		 * 
		 */

		setUp();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigsReader.getProperty("username"));

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ConfigsReader.getProperty("password"));

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		boolean logoIsDisplay = driver.findElement(By.xpath("//div[@id='branding']//a//img")).isDisplayed();

		if (logoIsDisplay) {
			System.out.println("Logo is Display, Test Case Passed");
		} else {
			System.out.println("Logo is Not Display, Test Case Failed");
		}

	}

}
