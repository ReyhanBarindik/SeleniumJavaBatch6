package com.mytestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

public class TestNGAnnotations extends CommonMethods {

	@BeforeMethod
	public void openBrowser() {
		setUp();
	}

	@Test
	public void validLogin() {
		String userName = "Admin";
		String password = "Hum@nhrm123";

		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		boolean logoDisplay = driver.findElement(By.xpath("//div[@id='branding']/a/img")).isDisplayed();

		if (logoDisplay) {
			System.out.println("Test Case passed.");
		} else {
			System.out.println("Test Case failed.");
		}

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
