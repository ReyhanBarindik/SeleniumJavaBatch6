package com.syntax.class12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.syntax.utils.CommonMethods;


/*US 34526 : Verify user is able to login with Valid credentials
 * 
 */
public class DemoTakesScreenShot extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		//login into HRMS
		String userName = "Admin";
		String password= "Hum@nhrm123";
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		//validation that Admin is Logged in 
		String welcomeText=driver.findElement(By.id("welcome")).getText();
		
		
		if (welcomeText.contains("John")) {
			System.out.println("Test Case Pass.");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.err.println("Test Case Fail.");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screen, new File("screenshots/HRMS/WrongLogin.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		driver.quit();
		
	}

}
