package com.syntax.class07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HW_2 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * TC 2: Select and Deselect values Open chrome browser Go to
		 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
		 * Forms” links Click on “Select Dropdown List” links Select value from “Select
		 * List Demo” section Verify value has been selected Select 4 options from
		 * “Multi Select List Demo” Deselect 1 of the option from the dd Quit browser
		 */

		setUp();
        driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]"))
				.click();

		WebElement dropDown = driver.findElement(By.id("select-demo"));

		Select select = new Select(dropDown);

		List<WebElement> listOptions = select.getOptions();

		for (WebElement option : listOptions) {

			String text = option.getText();

			if (text.equals("Wednesday")) {
				option.click();

				if (text.equals("Wednesday")) {
					System.out.println("Wednesday is selected :: " + option.isSelected());
				} else {
					System.err.println("Wednesday is Not selected");
				}
			}

		}

		WebElement multiSelect = driver.findElement(By.id("multi-select"));

		Select select2 = new Select(multiSelect);
		
		select2.selectByValue("California");
		wait(2);
		select2.selectByValue("Florida");
		wait(2);
		select2.selectByValue("New Jersey");
		wait(2);
		select2.selectByValue("Texas");
		wait(3);
		
		boolean isMultiSelect= select2.isMultiple();
		if (isMultiSelect) {
			select2.deselectByValue("Florida");
		}
		

		// tearDown();
	}

}
