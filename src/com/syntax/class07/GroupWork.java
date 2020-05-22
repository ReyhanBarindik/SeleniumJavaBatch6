package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class GroupWork extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
	WebElement linkT=driver.findElement(By.xpath("//a[title='Automation Practice Table']"));
		
	driver.manage().window().maximize();
	
	wait(1);
	
	WebElement nameBox =driver.findElement(By.xpath("//input[@name='firstname']"));
	
	nameBox.sendKeys(ConfigsReader.getProperty("username"));
	
	WebElement lastNameBox =driver.findElement(By.xpath("//input[@name='lastname']"));
	
	lastNameBox.sendKeys(ConfigsReader.getProperty("lastname"));	

	
	
	
	
	
	
	}

}
