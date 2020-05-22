package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class HW_1 extends CommonMethods {

	public static void main(String[] args) {
		/*TC 1: Verify element is clickable
                Open chrome browser
                Go to “https://the-internet.herokuapp.com/”
                Click on “Click on the “Dynamic Controls” link
                Select checkbox and click Remove
                Click on Add button and verify “It's back!” text is displayed   
                Close the browser  
		 */

		setUp();
		
		WebElement dynamicControls = driver.findElement(By.xpath("//a[text()='Dynamic Controls']"));
		waitAndClick(dynamicControls);
		WebElement aCheckbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
		waitAndClick(aCheckbox);
		WebElement removeButton=driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
		waitAndClick(removeButton);
		WebElement addButton =driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
		waitAndClick(addButton);
		WebElement textBack =driver.findElement(By.xpath("//p[@id='message']"));
		isDisplay(textBack);
		
		
		//tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
