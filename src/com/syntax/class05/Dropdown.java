package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5 Adults");
		
		
		
		
		

	}

}
