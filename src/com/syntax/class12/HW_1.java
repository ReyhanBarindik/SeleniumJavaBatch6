package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class HW_1 extends BaseClass {

	public static void main(String[] args) {
		
		/*TC 1: Drag and Drop verification
Open chrome browser
Go to “http://www.uitestpractice.com/”
Click on “Droppable” link
Using mouse drag “Drag me to my target” to the “Drop Here”
Close the browser
*/
		
     setUp();
     
     WebElement droppable= driver.findElement(By.id("draggable"));
		
	 WebElement dropHere= driver.findElement(By.id("droppable"));
	 
	Actions act= new Actions(driver);
	
	act.dragAndDrop(droppable, dropHere).perform();
	
	wait (2);
	//driver.close();	
		
		
		
		
		
		
	}

}
