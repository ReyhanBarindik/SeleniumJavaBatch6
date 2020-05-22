package com.syntax.class03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaHW {

	public static void display (String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver ();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
	String filePath = System.getProperty("user.dir")+"\\configs\\configuration.properties";
		
	FileInputStream finput = new FileInputStream(filePath);	
		
	Properties prop = new Properties();
	prop.load(finput);
	prop.getProperty("browser", "Chrome");
	display("Chrome");
	WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.findElement(By.name("firstName")).sendKeys("username");
	driver.findElement(By.name("Passwd")).sendKeys("password");

	}

}
