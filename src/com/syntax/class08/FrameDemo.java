package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//h3[contains(text(),'click on the below link')]")).getText(); 
        System.out.println(text);
		/*
		 * We can switch to a frame using three different methods
		 * 1. By Index.
		 * 2. By NameOrID
		 * 3. By WebElement
		 */
        
		//By Index 
		
		driver.switchTo().frame(0);
		
		WebElement name= driver.findElement(By.id("name"));
		
		name.sendKeys("Reyhan");
		
		driver.switchTo().defaultContent();
		
		wait(2);
		
		//By NameorID 
		
		driver.switchTo().frame("iframe_a");
		
		name.clear();
		name.sendKeys("Selma");
		driver.switchTo().defaultContent();
		wait(2);
		
		//By WebElement 
		
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		
		driver.switchTo().frame(firstFrame);
		
		name.clear();
		
		name.sendKeys("Yunus");
		
		driver.switchTo().defaultContent();//switch back to main window/page/default content
		
		wait(3);
		
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
