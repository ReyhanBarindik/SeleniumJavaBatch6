package com.syntax.SeleniumReview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class HandlingAlerts extends BaseClass {

	public static void main(String[] args) {
		setUp();
		
		WebElement alertButton = driver.findElement(By.id("alert"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		wait(2);
		alert.accept();

		WebElement timingAlertButton=driver.findElement(By.xpath("//button[text()='Timing Alert']"));
		timingAlertButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		wait(2);
		alert.accept();
		
		
		
		
		
	}

}
