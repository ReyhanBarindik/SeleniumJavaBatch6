package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class JavaScriptDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		//Perform Scroll on application using  Selenium 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)");
		//Vertical scroll - down by 150 pixels

		WebElement element= driver.findElement(By.xpath(""));
		
		//To scroll an app to specified elements
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		//Click Button using JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click();", element);
		
		//Highlight Element using JavaScriptExecutor
		JavascriptExecutor jss = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].style.backgroundColor='AnyColor'", element);
		
		
		
		
		
		
		
		
		
	}

}
