package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HW_2 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();

		WebElement username=driver.findElement(By.id("txtUsername"));		
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password= driver.findElement(By.id("txtPassword"));		
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement login= driver.findElement(By.id("btnLogin"));		
		waitAndClick(login);
		
		WebElement pim= driver.findElement(By.xpath("//b[contains(text(),'PIM')]"));
		waitAndClick(pim);
		
		WebElement addEmployee= driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
		waitAndClick(addEmployee);
				
		WebElement employeeFirstname= driver.findElement(By.id("firstName"));
		sendText(employeeFirstname, ConfigsReader.getProperty("employeeFirstname"));
		
		WebElement employeeLastname= driver.findElement(By.id("lastName"));
		sendText(employeeLastname, ConfigsReader.getProperty("employeeLastname"));
		
		WebElement employeeID= driver.findElement(By.id("employeeId"));
		sendText(employeeID, ConfigsReader.getProperty("employeeID"));
		
		WebElement saveEmp= driver.findElement(By.id("btnSave"));
		waitAndClick(saveEmp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
