package com.syntax.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class HW_1 extends BaseClass {

	public static void main(String[] args) {

		/*
		 * TC 1: JavaScript alert text verification Open chrome browser Go to
		 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Alerts
		 * & Modals” links Click on “Javascript Alerts” links Click on button in “Java
		 * Script Alert Box” section Verify alert box with text “I am an alert box!” is
		 * present Click on button in “Java Script Confirm Box” section Verify alert box
		 * with text “Press a button!” is present Click on button in “Java Script Alert
		 * Box” section Enter text in the alert box Quit browser
		 */

		setUp();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]")).click();

		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]")).click();

		// 1.
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert1 = driver.switchTo().alert();
		wait(2);
		String confirmAlert1 = alert1.getText();
		System.out.println("Alert box with text “I am an alert box!” is present : " + confirmAlert1);
		alert1.accept();
		wait(2);
		// 2.
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Alert alert2 = driver.switchTo().alert();
		wait(2);
		String confirmAlert2 = alert2.getText();
		System.out.println("Alert box with text “Press a button!” is present : " + confirmAlert2);
		alert2.accept();
		wait(2);
		// 3.
		String name = "Reyhan";
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		Alert alert3 = driver.switchTo().alert();
		wait(2);
		String confirmAlert3 = alert3.getText();
		System.out.println("Prompt alert text is present : " + confirmAlert3);

		alert3.sendKeys(name);
		alert3.accept();

		String text = driver.findElement(By.id("prompt-demo")).getText();
		System.out.println("Text added to alert box :: " + text);

		if (text.contains(name)) {
			System.out.println("Text " + name + " was successfully added");
		} else {
			System.out.println("Text " + name + " was Not added");
		}

		
		
	}

}
