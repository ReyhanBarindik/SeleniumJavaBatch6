package com.syntax.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) {
		/*Open chrome browser
		Go to “http://166.62.36.207/syntaxpractice/”
		Click on “Table” link
		Click on “ITable Data Search” link
		Verify second table consist of 5 rows and 4 columns
		Print name of all column headers 
		Print data of all rows
		Quit Browser
        */
		
		setUp();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Table')]")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Table Data Search')]")).click();
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		if (rows.size()==5) {
			System.out.println("Second table consist of 5 rows. Test Case is passed.");
		} else {
			System.err.println("Second table does Not consist of 5 rows. Test Case is Not passed.");
		}
		
		List<WebElement> cols= driver.findElements(By.xpath("//table[@class='table']/thead[@class='thead-inverse']/tr/th"));
		
		if (cols.size()==4) {
			System.out.println("Second table consist of 4 columns. Test Case is passed.");
		}else {
			System.err.println("Second table does Not consist of 4 columns. Test Case is Not passed.");
		}
		
		System.out.println("-------Name of all column headers-------");
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
		for (WebElement header : headers) {
			String headerNames = header.getText();
			System.out.println(headerNames);
		}
		System.out.println("--------Data of all rows--------");
		for (WebElement row : rows ) {
			String rowData= row.getText();
			System.out.println(rowData);
		}
		
		
		
		
		
		
	}

}
