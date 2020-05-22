package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HW_2 extends CommonMethods {

	public static void main(String[] args) {
		/*TC 2: Verify element is enabled
		Open chrome browser
		Go to “https://the-internet.herokuapp.com/”
		Click on “Click on the “Dynamic Controls” link
		Click on enable button
		Enter “Hello” and verify text is entered successfully
		Close the browser 
        */
		
		setUp();
		WebElement dynamicControls =driver.findElement(By.xpath("//a[contains(text(),'Dynamic Controls')]"));
		waitAndClick(dynamicControls);
		
		WebElement enableButton =driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
		waitAndClick(enableButton);
		
		WebElement textBox =driver.findElement(By.xpath("//input[@type='text']"));
		waitAndClick(textBox);
		sendText(textBox,ConfigsReader.getProperty("text"));
		
		WebElement disableButton =driver.findElement(By.xpath("//button[contains(text(),'Disable')]"));
		waitAndClick(disableButton);
		
		WebElement helloText =driver.findElement(By.xpath("//input[@type='text']"));
		isDisplay(helloText);
		
		
		//tearDown();
		
		
		
		
		
		
	}

}
