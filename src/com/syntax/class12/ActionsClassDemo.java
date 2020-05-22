package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionsClassDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        
        // to perform mouse ot kewyboard operation we need to have an Object on the Action 
        Actions act = new Actions (driver);
        
        
        //identify an element on which to perform mouse click 
        WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
        
        wait(2);
        // clicking on the mouse 
        act.moveToElement(loginBtn).contextClick().perform();   //to perform right click
        
        act.moveToElement(loginBtn).click().perform();  // to complete action, it always ends with perform(); method !!!
        
        // act.moveToElement(loginBtn).doubleClick().perform();       // to perform double click
        
        wait(2);
        
        // hover over the element 
        WebElement pimLink=driver.findElement(By.linkText("PIM"));
        
        act.moveToElement(pimLink).perform();
        
        WebElement addEmp= driver.findElement(By.id("menu_pim_addEmployee"));
        act.moveToElement(addEmp).click().perform();
        // act.click(addEmp).perform(); //2.Way 
        
        // act.keyUp(Keys.SHIFT).sendKeys("hello");    //--> HELLO  //to perform Upper Keys 
        
        
        
        wait(3);
        driver.quit();
	}

}
