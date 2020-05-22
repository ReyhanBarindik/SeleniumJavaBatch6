package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task2 extends BaseClass {

	public static void main(String[] args) {

		/*
		 * Go to facebook.com Verify “Create a new account” is Displayed Fill out First
		 * name, lastname, email, new password Select your birthday from given dropdowns
		 * Select gender Click sign up
		 */

		setUp();
		driver.manage().window().maximize();
		boolean newAccountIsDisplay = driver.findElement(By.xpath("//h2[@class='_8est']")).isDisplayed();

		if (newAccountIsDisplay) {
			System.out.println("Create a new account is Displayed : " + newAccountIsDisplay);

		}
		System.err.println("Create a new account is Not Displayed");

		WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
		wait(2);
		username.sendKeys("Munise");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		wait(2);
		lastname.sendKeys("Keskin");

		WebElement phoneNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		wait(2);
		phoneNum.sendKeys("9043111155");
		wait(2);

		WebElement newPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		wait(2);
		newPassword.sendKeys("904311munise");
		wait(2);

		WebElement month = driver.findElement(By.id("month"));

		Select selectMonth = new Select(month);

		selectMonth.selectByValue("3");
		wait(2);
		WebElement day = driver.findElement(By.id("day"));

		Select selectDay = new Select(day);

		selectDay.selectByValue("7");
		wait(2);
		WebElement year = driver.findElement(By.id("year"));

		Select selectYear = new Select(year);
		wait(2);
		selectYear.selectByValue("1992");

		List<WebElement> allRadio = driver.findElements(By.xpath("//input[@type='radio']"));

		for (WebElement radio : allRadio) {
			String radioValue = radio.getAttribute("value");
			if (radioValue.equals("1")) {
				radio.click();
				wait(2);
			}
		}

		WebElement submitButton = driver
				.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		submitButton.click();

		// tearDown();

	}

}
