package com.syntax.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
		
		driver.findElement(By.linkText("Table"));
		driver.findElement(By.linkText("Table Data Searc"));
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table'/tbody/tr"));
		

	}

}
