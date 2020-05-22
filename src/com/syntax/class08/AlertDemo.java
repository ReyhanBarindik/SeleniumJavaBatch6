package com.syntax.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		//Handling simple alert/PopUps 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
        Alert simpleAlert= driver.switchTo().alert();
	    wait(2);
		String simpleAText=simpleAlert.getText();
		
		System.out.println("This is a simple alert text :: "+simpleAText);
		wait(2);
		simpleAlert.accept();   //---> only there is one button 
		
		//Handling confirmation Alert 
		driver.findElement(By.id("confirm")).click();
		
		Alert confirmAlert = driver.switchTo().alert();
		wait(2);
		String confirmAText=confirmAlert.getText();
		System.out.println("This is Confirm alert text :: "+confirmAText);
		wait(2);
		confirmAlert.dismiss();
		
		wait(2);
		//Handling Prompt alerts/ confirmation alerts by providing some confirmation message.
		String name="Reyhan";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		
		System.out.println("This is Prompt alert text :: "+promptAlert.getText());
		
		promptAlert.sendKeys(name);
		promptAlert.accept();
		
		String text = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		
		System.out.println("Text added to alert box :: "+text);
		
		if (text.contains(name)) {
			System.out.println("Text "+ name+" was successfully added");
		} else {
			System.out.println("Text "+name+" was Not added");
		}
		
		
		
		
		
		
		
		//tearDown();
	}

}
