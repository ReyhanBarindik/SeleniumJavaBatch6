package com.syntax.class07;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDown3 extends BaseClass{

	public static void main(String[] args) {
		
        setUp();
        
		WebElement continents = driver.findElement(By.id("continents"));
		
		Select select = new Select(continents);

		select.selectByValue("AUS");
		
		List<WebElement>optionList =select.getOptions();
		
		Iterator <WebElement>it = optionList.iterator();
		
		while (it.hasNext()) {  ////If there is next value, get the text of it
			String text = it.next().getText();
			System.out.println(text);
		}
		
		//if (exceptedList.containsAll(optionList)){}   --> anoyher Way
	}

}
