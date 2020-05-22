package com.syntax.class07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HW_1 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * TC 1: Amazon Department List Verification Open chrome browser Go to
		 * “http://amazon.com/” Verify how many department options available. Print each
		 * department Select Computers Quit browser
		 * 
		 */

		setUp();
		
		WebElement Ddown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select (Ddown);
		
		List<WebElement>allOptions=select.getOptions();
		
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
		}
		wait(2);
		
		select.selectByValue("search-alias=computers");
		
		
		//tearDown();
		
		
		
		
	}

}
