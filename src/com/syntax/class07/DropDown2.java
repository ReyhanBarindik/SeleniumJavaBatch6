package com.syntax.class07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDown2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement continents = driver.findElement(By.id("continents"));

		Select select = new Select(continents);

		List<WebElement> options = select.getOptions();// It will return list of all options in the DD
		
		for (WebElement option : options) {
			String text = option.getText();   //--> getting text of each option 
			System.out.println(text);

			
			if (text.equals("Africa")) {
				option.click();
				String ddText= option.getText();
				
				if (ddText.equals("Africa")) {
					System.out.println("Africa is selected :: "+option.isSelected()); //--> true
				} else {
					System.err.println("Africa is Not selected");
				}
				
			}

		}
        
		boolean isMultiple = select.isMultiple(); //isMultiple(); shows if the DD is multi select or not.
		
		System.out.println("\"This DropDown is Multi Select? : "+ isMultiple);
		
		wait(2);
		tearDown();
		
	}

}
