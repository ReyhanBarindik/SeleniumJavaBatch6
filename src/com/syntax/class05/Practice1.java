package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 * open www. bestbuy. ca type ipad in the search box when the suggestions are
		 * displayed, click one of them on results page, filter all results by the
		 * Online Only filter select one of the results on details page, add the product
		 * to cart checkout as a guest fill in the address details select mastercard as
		 * payment type fill in the details of an expired master card submit the
		 * transaction collect the error message in a log
		 */

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bestbuy.ca/");

		driver.findElement(By.xpath("//input[@placeholder='Search Best Buy']")).sendKeys("ipad");

		driver.findElement(By.xpath("//span[contains(text(),'Current Offers')]")).click();

		driver.findElement(By.cssSelector("a[xpath*='1']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Online Only')]")).click();

		driver.findElement(By.className("sliderTarget_2Q87g")).click();

	}

}
