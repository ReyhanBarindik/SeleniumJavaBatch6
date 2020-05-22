package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class Task03 extends BaseClass {

	public static void main(String[] args) {

		/*
		 * TC 3: Syntax Demo input boxes count: Open chrome browser Go to
		 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
		 * Forms” links Click on “Simple Form Demo” links Get all input boxes from the
		 * page Enter “Hello” to each text box Close browser
		 * 
		 */

		setUp();
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Simple Form Demo')]")).click();
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//input[@type='text']"));
		
		for (WebElement link : allLinks) {
			link.sendKeys(ConfigsReader.getProperty("text"));
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		driver.close();
		
	}

}
