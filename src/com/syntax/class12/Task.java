package com.syntax.class12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) {
		setUp();
		
		String userName = "Admin";
		String password= "Hum@nhrm123";
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		
		WebElement element=driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr"));
		
		boolean display=element.isDisplayed();
		
		if (display) {
			System.out.println("Test Case passed.");
		} else {
			System.err.println("Test Case failed.");
		}
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File screen = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/DisplayTask.png") );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
