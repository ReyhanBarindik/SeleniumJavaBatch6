package com.syntax.class11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SimpleCalendarDemo extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();

		CommonMethods.waitForClickability(driver.findElement(By.linkText("Leave")));
		driver.findElement(By.linkText("Leave")).click();
		
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		//click on the input to bring calender view 
	    driver.findElement(By.id("calToDate")).click();
		wait(2);
		
		//Selecting the month 
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Mar");
		
		//Selecting the year 
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear= new Select(year);
		selectYear.selectByVisibleText("1992");
		
		//storing all cells from table
		List <WebElement> cells= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement cell : cells ) {
			String cellText= cell.getText();
			if (cellText.equals("7")) {
				cell.click();
				break;
			}
		}
		wait(2);
		
		
		
		
		
		
	}

}
