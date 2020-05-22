package com.syntax.SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class YunusSelenium extends BaseClass {

	public static void main(String[] args) {
		
		
		setUp();
		driver.manage().window().maximize();
		wait(5);
		WebElement pop_UpCloseButton = driver.findElement(By.xpath("//button[@class='c-close-icon ']"));
		pop_UpCloseButton.click();
		wait(3);
		WebElement seacrhBox =  driver.findElement(By.xpath("//input[@id='gh-search-input']"));
		seacrhBox.sendKeys("Cam");
		for(int x=0;x<6;x++) {
		    seacrhBox.sendKeys(Keys.ARROW_DOWN);
		    wait(1);
		}
		seacrhBox.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
