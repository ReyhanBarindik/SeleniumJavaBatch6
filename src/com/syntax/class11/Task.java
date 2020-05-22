package com.syntax.class11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import com.syntax.utils.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) {
		/*TC 1: Table headers and rows verification
		Open chrome browser
		Go to “https://www.aa.com/homePage.do”
		Enter From and To
		Select departure as May 14 of 2020
		Select arrival as November 8 of 2020
		Click on search
		Close browser
        */
		setUp();
		
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		wait(2);
		String departMonth= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
		
		while (!departMonth.equals("May 2020")) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			wait(2);
			departMonth= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
		}
	    
		List<WebElement> departCells = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
		for (WebElement departCell : departCells) {
			String departCellText=departCell.getText();
			if (departCellText.equals("16")) {
				departCell.click();
				wait(2);
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[@class='span8 home-page-booking-widget no-margin']//div[2]//div[1]//button[1]")).click();
		
		String returnMonth= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		
		while (!returnMonth.equals("November 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			wait(2);
			returnMonth= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		}
		
		List<WebElement> returnCells = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
		for (WebElement returnCell : returnCells) {
			String returnCellText=returnCell.getText();
			if (returnCellText.equals("8")) {
				returnCell.click();
				wait(2);
				break;
			}
		}
		
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
		
		
		
		
		
		
		
		
	}

}
