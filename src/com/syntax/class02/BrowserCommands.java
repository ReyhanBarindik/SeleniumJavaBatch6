package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().to("https:/www.google.com");
		
        driver.navigate().back(); // once facebook than google and than go back to facebook again
		
        
       
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(3000);
		 
		driver.navigate().forward();
		driver.close();
	}

}
