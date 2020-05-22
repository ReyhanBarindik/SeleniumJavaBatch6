package com.syntax.class09;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class Pre_Class extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String mainWindowTitle = driver.getTitle();
		String mainWindowID= driver.getWindowHandle(); //--> it gives ID 
		
		System.out.println("Title of main window is "+mainWindowTitle+" and ID is "+mainWindowID);
		//click on new browser window button 
		
		driver.findElement(By.cssSelector("button[id='button1']")).click();
		// now another windows opened and browser should handle 2 windows now 
		// get Set of windows handles
		Set<String>allWindows=driver.getWindowHandles();
		// how many windows are currently open 
		System.out.println(allWindows.size());
		// Iterator 
		Iterator<String>it=allWindows.iterator();
		String mWindow=it.next();
		String childWindow=it.next();
		//switch to the new open window 
		driver.switchTo().window(childWindow);  //--> I will work with second window 
		driver.manage().window().maximize();   //--> Second window will be maximize 
		wait(2);
		String childWindowTitle= driver.getTitle();  //--> you are in second window so you will get second window title with use driver kw
		System.out.println("The Title of Second Window is "+childWindowTitle);
		
		
		
		
		
		
		
		
		
		
	}

}
