package com.syntax.class07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownsAndMultipleSelect extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
        setUp();
        
        WebElement weekDD=  driver.findElement(By.id("select-demo"));
        
        Select select = new Select (weekDD);
        
        List<WebElement>options = select.getOptions();
        System.out.println("Number of Operation in the DD : "+options.size());
        
        
       // select.selectByIndex(1);       // if there are so much select we cannot use only index
        
        for (int i=1; i<options.size(); i++) {      // index 0 --> is not a day 
        	select.selectByIndex(i);
        	Thread.sleep(3000);
        }
        
        select.selectByVisibleText("Friday");//can select an option by Visible text.
        //In the parameter provide the text Visible on UI.
        
        wait(2);
        
        //select.selectByValue("Monday");
        
        //select.selectByVisibleText("Tuesday");
        tearDown();
        
	}

}
