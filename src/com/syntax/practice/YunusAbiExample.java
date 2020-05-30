package com.syntax.practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class YunusAbiExample extends CommonMethods {
	 
	    public static void main (String [] args) throws InterruptedException {
	
	List<WebElement> listofRadioButton =driver.findElements(By.xpath("//input[@class='radioButton']"));
	  int listsize = listofRadioButton.size();
	  System.out.println(listsize);
	  for (WebElement radiobutton : listofRadioButton) {
		String value = radiobutton.getAttribute("value");
		System.out.println(value);
		
		
		System.out.println(value+" is clickable");
		radiobutton.click();
		if(radiobutton.isEnabled()) {
			TakesScreenshot ahmet = (TakesScreenshot)driver;
			 
			  File picture = ahmet.getScreenshotAs(OutputType.FILE);
			 
			  try {
				FileUtils.copyFile(picture, new File("screenshots/"+value+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Thread.sleep(1000);
//		if(value.equals("radio2")) {
//			radiobutton.click();
//		}
		}
	}
}
}
