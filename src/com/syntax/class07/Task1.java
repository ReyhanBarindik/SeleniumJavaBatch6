package com.syntax.class07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Facebook dropdown verification Open chrome browser Go to
		 * “https://www.facebook.com” Verify: month dd has 12 month options day dd has
		 * 31 day options year dd has 115 year options Select your date of birth Quit
		 * browser
		 */
        setUp();
        // Month DD
		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		List<WebElement> optionsMonth = select.getOptions();

		int sizeOfMonth = optionsMonth.size();
		if ((sizeOfMonth - 1) == 12) {
			System.out.println("month dd has 12-month options");

		} else {
			System.err.println("month dd has Not 12-months options");
		}
		select.selectByValue("3");
		wait(3);

		// Day DD
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		List<WebElement> optionsDay = selectDay.getOptions();
		int sizeOfDay = optionsDay.size();
		if ((sizeOfDay - 1) == 31) {
			System.out.println("day dd has 31-day options");

		} else {
			System.err.println("day dd has Not 31-day options");
        }
		selectDay.selectByValue("7");
		wait(3);

		// Year DD
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		List<WebElement> optionsYear = selectYear.getOptions();
		int sizeOfYear = optionsYear.size();
		System.out.println("Year DD has "+sizeOfYear+"-year options");
		if ((sizeOfYear - 1) == 115) {
			System.out.println("year dd has 115-year options");

		} else {
			System.err.println("year dd has Not 115-year options");
        }
		selectYear.selectByValue("1992");
        
	}

}
