package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Practice extends BaseClass {

	public static void main(String[] args) {

		setUp();

		WebElement firstCB = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));

		firstCB.click();
        wait(2);
		if (firstCB.isSelected()) {
			System.out.println("Select Box Selected!");
		} 
		if (firstCB.isSelected()){
			wait(2);
			firstCB.click();
			System.out.println("Select Box Unselected");
		}
		

		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement li : list) {
			String text = li.getText();
			System.out.println(text);
			wait(2);
		}

		System.out.println(list.size());

	}

}
