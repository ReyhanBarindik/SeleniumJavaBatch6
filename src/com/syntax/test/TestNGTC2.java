package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

public class TestNGTC2 extends CommonMethods {

	@BeforeMethod
	public void beforeMethod() {
		setUp();
	}

	@Test
	public void verifyErrorMessage() {
		String userName = "Admin";
		String password = "";
		String expectedErrorMes = "Password cannot be empty";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		WebElement errorMess = driver.findElement(By.id("spanMessage"));
		String actualErrorMess= errorMess.getText();
		Assert.assertEquals(actualErrorMess, expectedErrorMes);
        
	}

	@AfterMethod
	public void afterMethod() {
		// driver.close();
	}

}
