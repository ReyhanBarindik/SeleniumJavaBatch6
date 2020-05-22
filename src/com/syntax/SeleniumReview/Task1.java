package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) {
		/*@here Go to amazon.com
	 * select books from the search dropdown
	 * type Harry potter
	 * and click on Search
	 * check Unofficial CookBook checkbox on the left under Book Series
*/
		
		setUp();
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(dropDown);
		
		List<WebElement> ddOptions = select.getOptions();
		
		for (WebElement option : ddOptions) {
			String optionText = option.getText();
			System.out.println(optionText);
		}
		select.selectByVisibleText("Books");
		
		
		WebElement searchTextBox= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		searchTextBox.sendKeys("Harry Potter");
		
		WebElement searhText=driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']"));
		
		searhText.click();
		
		List<WebElement>bookSeriesCB=driver.findElements(By.className("a-spacing-micro"));
		wait(2);
		
		for (WebElement bookSeries : bookSeriesCB) {
			String text= bookSeries.getText();
			if (text.equals("Unofficial Cookbook") && !bookSeries.isSelected()) {
				bookSeries.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
