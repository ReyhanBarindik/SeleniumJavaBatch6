package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class HW extends BaseClass {

	public static void main(String[] args) {
		
	setUp();
	
	driver.findElement(By.linkText("Others")).click();
	
	driver.findElement(By.linkText("Drag and Drop")).click();
	
	
	
	Actions act= new Actions(driver);

	WebElement elementToDrop = driver.findElement(By.id("mydropzone"));
	
	for (int i=1; i<5; i++) {
	WebElement whichElementToDrop = driver.findElement(By.xpath("//div[@id='todrag']/span["+i+"]"));
	
	act.dragAndDrop(whichElementToDrop, elementToDrop);
	
	}
	
	
	
	
	
	
	
	
	
	
	}

}
