package com.syntax.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DeltaCalenarDemo extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		// click on the depart on calender 
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']")).click();
		
		String departMonth= driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while (!departMonth.equals("August")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			wait(2);
			departMonth =driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText(); //relocated it 
		}
		
		//loop through td and grap the text
		List<WebElement>fromCells = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
		for (WebElement fromCell : fromCells) {
			String fromText=fromCell.getText();
			if (fromText.equals("7")) {
				fromCell.click();
				break;
			}
		}
		//grap the text of return month and check if it equals to October 
		String returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		
		while (!returnMonth.equals("October")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			wait(2);
			returnMonth= driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		}
		
		List<WebElement> toCells = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
		for (WebElement toCell : toCells ) {
			String toCellText= toCell.getText();
			if (toCellText.equals("9")) {
				toCell.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@value='done']")).click();
		wait(2);
		
		
		
		
		

	}

}
