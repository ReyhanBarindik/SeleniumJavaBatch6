package com.syntax.class03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewHW {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath= System.getProperty("user.dir") + "\\configs\\ForHW";
		
		FileInputStream fis = new FileInputStream (filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
	    WebDriver driver= null;
		
		switch (browser) {
		
		case "Chrome" :
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
		    
		case "firefox" :
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		    driver= new FirefoxDriver();
		    break;
		
		
		}
		driver.get(prop.getProperty("url"));
		//driver.findElement(By.xpath("//*[@id=\"fakebox-input\"]")
		driver.findElement(By.name("q")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
        driver.close();
        
	}

}
