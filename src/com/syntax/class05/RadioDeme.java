package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDeme {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form/");
		
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='sex-0']"));
		
		System.out.println(maleRadioB.isDisplayed());  //----> find if it is here // true 
		System.out.println(maleRadioB.isEnabled());    //----> if is it able to use // true 
		System.out.println(maleRadioB.isSelected());   // ----> if you did not select it. // false 
		System.out.println("***********");
		// first way to click on a Radio Button 
		maleRadioB.click();
		System.out.println(maleRadioB.isSelected()); // you clicked it and it turned // ture 
		
		// second way to click on Radio Button 
		List <WebElement>proList=driver.findElements(By.xpath("//input[@name='profession']"));   // ---> there are 6 elements of WebElement with this xpath so we cannot click in here 
		int listSize=proList.size();                                                                                   // we created list for them 
		System.out.println("Size of CheckBoxes are :"+listSize);
		
		String valueToBeSelected= "Manual Tester";
		//driver.findElement(By.xpath("//input[@id='sex-0']")).getAttribute("value");
		for (WebElement profession : proList) {
			if (profession.isEnabled()) {
				String value=profession.getAttribute("value");  // --> give me value of value Attribute  
				System.out.println(value);
				if (value.equals(valueToBeSelected)) {
					profession.click();
					break;
				}
			}
		}
		
		
		
	}

}
