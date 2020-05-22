package com.syntax.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		
		
		WebElement username = driver.findElement(By.name("firstname"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement lastname = driver.findElement(By.name("lastname"));
		sendText(lastname, ConfigsReader.getProperty("lastname"));

		WebElement email = driver.findElement(By.name("reg_email__"));
		sendText(email, ConfigsReader.getProperty("email"));
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		List<WebElement>chBoxes= driver.findElements(By.xpath("//input[@class='_8esa']"));
		clickRadioOrCheckBox(chBoxes, "1");
		
		WebElement monthDD= driver.findElement(By.id("month"));
		selectDdValue(monthDD, "Mar");
		wait(2);
		
		WebElement dayDD= driver.findElement(By.name("birthday_day"));
		selectDdValue(dayDD, 7);
		wait(2);
		
		WebElement yearDD = driver.findElement(By.name("birthday_year"));
		selectDdValue(yearDD, "1992");
		wait(2);
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		waitAndClick(submit);
		
	}

}
