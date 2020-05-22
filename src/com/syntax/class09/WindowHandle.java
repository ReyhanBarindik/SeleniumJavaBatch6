package com.syntax.class09;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		Thread.sleep(2000);
		String signUpTitle = driver.getTitle();
		System.out.println("Main Page Title is :: "+signUpTitle);
		String parentWindowHandle= driver.getWindowHandle();
		System.out.println("What is the ID of Parent Window Handle? "+parentWindowHandle);
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		System.out.println("Size of allWindows :: "+allWindowHandles.size());
		
		Iterator<String>it = allWindowHandles.iterator();
        while (it.hasNext()) {
        	String handle= it.next();
        	//driver.switchTo().window(handle); // You do Not know order, it is not a good idea 
        	if (!handle.equals(parentWindowHandle)) {   // swithc the next Window only if not same as parent window 
        		driver.switchTo().window(handle);  // if not parent go to child (second one)
        		System.out.println(driver.getTitle());
        		driver.close();
        		Thread.sleep(2000);
        	}
        }
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
