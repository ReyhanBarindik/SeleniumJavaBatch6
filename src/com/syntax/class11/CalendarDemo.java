package com.syntax.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class CalendarDemo extends BaseClass {

	public static void main(String[] args) {
		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
        
		wait(2);
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leave List")).click();
		
		//Step 1: click on Calender
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
		
		//Step 2: get all Cells 
		List<WebElement>cells =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement cell : cells) {
			//retrieve text and check if it matches expected value 
			if (cell.getText().equals("16")) {
				//once found click and break 
				cell.click();
				break;
			}
		}
		
		
		
		
		
	}

}
