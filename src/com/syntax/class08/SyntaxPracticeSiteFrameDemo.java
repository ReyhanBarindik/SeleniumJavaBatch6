package com.syntax.class08;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo extends BaseClass{

	public static void main(String[] args) {
		
		
		setUp();
		
		driver.switchTo().frame("FrameOne");
		
		boolean logoIsDisplay=driver.findElement(By.id("hide")).isDisplayed();
		
		System.out.println("Syntax Logo is inside FrameOne is displayed :: "+logoIsDisplay);

		driver.switchTo().defaultContent();
		
		wait(2);
		
		driver.switchTo().frame("FrameTwo");
		
		boolean enrolBtnIsEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		
		System.out.println("Enrol Button inside frame Two is Enabled:: "+enrolBtnIsEnabled);

        tearDown();
        
		
		
		
		
		
		
		
		
		
	}

}
