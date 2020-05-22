package com.syntax.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HW_1 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Open chrome browser Go to
		 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.
		 * aspx” Login to the application Verify customer “Susan McLaren” is present in
		 * the table Click on customer details Update customers last name and credit
		 * card info Verify updated customers name and credit card number is displayed
		 * in table Close browser
		 */
		setUp();

		WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		sendText(username, "Tester");
		WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
		sendText(password, "test");
		WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
		waitAndClick(login);
		String expectedValue = "Susan McLaren";
		String updatedName = "Susan Inci";
		String updatedCardNum = "123321123";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();
			if (rowText.contains(expectedValue)) {
				System.out.println("“Susan McLaren” is present in the table.");
				WebElement element = driver.findElement(
						By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + (i + 1) + "]/td[13]"));
				element.click();

				WebElement elementName = driver
						.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
				elementName.clear();
				elementName.sendKeys(updatedName);
				WebElement elementCardNum = driver
						.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
				elementCardNum.clear();
				elementCardNum.sendKeys(updatedCardNum);
				WebElement update = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']"));
				update.click();
				break;

			}
		}

		List<WebElement> updatedRows = driver
				.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for (WebElement updatedRow : updatedRows) {
			String rowText = updatedRow.getText();
			if (rowText.contains(updatedName) && rowText.contains(updatedCardNum)) {
				System.out.println("Updated customers name " + "(" + updatedName + ")" + " and credit card number "
						+ "(" + updatedCardNum + ")" + " is displayed in Table.");
				wait(2);
				break;

			}

		}
	}
}
