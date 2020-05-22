package com.syntax.class04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW01 {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\configs\\HW1Prop";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		String browser = prop.getProperty("browser");

		WebDriver driver = null;

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("url")); // Instead of driver.get("url")
		driver.findElement(By.name("customerName")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("email"));

		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("passwordCheck")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("a-button-input")).click();

	}

}
