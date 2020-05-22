package com.syntax.class12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import com.syntax.utils.CommonMethods;

public class HW_2 extends CommonMethods{

	public static void main(String[] args) {
		/*TC 2: Upload file and Take Screenshot
		Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
		Upload file
		Verify file got successfully uploaded and take screenshot
*/
		
		setUp();
		
		WebElement chooseFile= driver.findElement(By.id("gwt-debug-cwFileUpload"));
		
		sendText(chooseFile, "C:\\Users\\reyha\\eclipse-workspace\\SeleniumJavaBatch6\\configs\\MyHW2.xlsx");
		
		WebElement uploadBtn = driver.findElement(By.xpath("//button[@class='gwt-Button']"));
		
		waitAndClick(uploadBtn);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		
		
		if (text.equals("File uploaded!")) {
			System.out.println("File got successfully uploaded!");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screen, new File("screenshots/HRMS/FileUploaded.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.err.println("Test Case fail.");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screen, new File("screenshots/HRMS/FileUploaded.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
