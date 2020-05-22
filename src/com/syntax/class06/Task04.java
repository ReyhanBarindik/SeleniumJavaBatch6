package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;



public class Task04 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * TC 4: Radio Buttons Practice Open chrome browser Go to
		 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
		 * Forms” links Click on “Radio Buttons Demo” links Click on any radio button in
		 * “Radio Button Demo” section. Verify correct radio is clicked Click on any
		 * radio button in “Group Radio Buttons Demo” section. Verify correct checkbox
		 * is clicked Quit browser
		 */

		setUp();

		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]")).click();

		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (WebElement radioButton : allRadioButtons) {

			if (radioButton.isEnabled()) {
				String value= radioButton.getAttribute("value");
				if (value.equals("Female")) {
					Thread.sleep(3000);
					radioButton.click();
					System.out.println("correct radio is clicked");
				}
				if (value.equalsIgnoreCase("15 - 50")) {
					radioButton.click();
					System.out.println("correct radio is clicked");
					break;
				}
			}

		}
		// driver.quit();
	}

}
