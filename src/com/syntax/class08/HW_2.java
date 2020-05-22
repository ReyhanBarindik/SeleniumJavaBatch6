package com.syntax.class08;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class HW_2 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * TC 2: Syntax Frame verification Open chrome browser Go to
		 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on
		 * “Others” link Click on “Iframe” link Click on the “Home” link inside the
		 * first frame Verify “Syntax logo” is displayed in second frame Quit browser
		 */

		setUp();

		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Others')]")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Iframe')]")).click();

		driver.switchTo().frame("FrameOne");

		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.switchTo().defaultContent();
		wait(3);
		
		driver.switchTo().frame("FrameTwo");
        
		boolean logoIsDisplay = driver.findElement(By.xpath("//img[@class='custom-logo']")).isDisplayed();

		if (logoIsDisplay) {
			System.out.println("Syntax logo is displayed in second frame : " + logoIsDisplay);
		} else {
			System.out.println("Syntax logo is Not displayed in second frame : " + logoIsDisplay);
		}

		driver.switchTo().defaultContent();

		// tearDown();

	}

}
