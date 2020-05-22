package com.syntax.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class WaitDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // --> it waits until time to loaded 
		
		boolean isHomeDis= driver.findElement(By.xpath("//a[@href='/index.html/']")).isDisplayed();
		System.out.println("Is Home Link is Displayed ? :: "+isHomeDis);
		//Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		

	}

}
