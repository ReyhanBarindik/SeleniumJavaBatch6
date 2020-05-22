package com.syntax.class09;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class ATask extends BaseClass {

	public static void main(String[] args) {

		setUp();
		wait(2);
		
		WebElement newBrowser = driver.findElement(By.xpath("//button[@id='button1']"));
		newBrowser.click();
		// now another windows opened and browser should handle 2 windows now
		// get Set of windows handles
		switchToChildWindow();
        
		// clicking on the new Browser Tab button
		WebElement secondChild=driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		secondChild.click();
		// and now all steps again :)) -- > we created new method for them
		switchToChildWindow();
		
		//WebElement thirdChild= driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]"));
		//thirdChild.click();
		//switchToChildWindow();
		
        wait(2);
		tearDown();

	}

	public static void switchToChildWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		String mWindow = it.next();
		System.out.println("Main Window ID is ----> " + mWindow);
		String childWindow = it.next();
		System.out.println("Child Window ID is ----> " + childWindow);
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		wait(2);
		String childWindowTitle = driver.getTitle();
		System.out.println("Child Window Title is " + childWindowTitle);
		// closing child window
		driver.close();
		// after you closed child window go main window //--> Important !!!
		driver.switchTo().window(mWindow);
		wait(2);
	}

}
