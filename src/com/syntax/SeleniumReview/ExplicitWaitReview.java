package com.syntax.SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class ExplicitWaitReview extends BaseClass {

	public static void main(String[] args) {
	
		setUp();
		WebElement download=driver.findElement(By.cssSelector("button[id='downloadButton']"));
        download.click();
        WebDriverWait wait = new WebDriverWait (driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text() ='Complete!']")));
        WebElement completeStatus = driver.findElement(By.xpath("//div[text() ='Complete!']"));
        
        String completeStatusText = completeStatus.getText();
        System.out.println(completeStatusText);
        WebElement closeButton = driver.findElement(By.xpath("//button[text() ='Close']"));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        closeButton.click();
		
       
		
		
	}

}
