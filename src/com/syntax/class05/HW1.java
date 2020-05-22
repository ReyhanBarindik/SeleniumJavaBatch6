package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * TC 1: Amazon link count: Open chrome browser Go to “https://www.amazon.com/”
		 * Get all links Get number of links that has text Print to console only the
		 * links that has text
		 */

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("Size of all links on Amazon : " + allLinks.size());

		int count = 0;
		for (WebElement link : allLinks) {
			String text = link.getText(); // --> it means this links is not empty, they have text
			if (!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}

		System.out.println("Total number of link with text is :: " + count);

		driver.quit();

	}

}
