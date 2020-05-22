package com.syntax.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class HW_2 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * TC 2: Delete Employee Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login into
		 * the application Add Employee Verify Employee has been added Go to Employee
		 * List Delete added Employee Quit the browser
		 */
		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		wait(2);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee")).click();
		
        
		String firstName = "Reyhan";
		String lastName = "Barindik";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);

		// store your employee id
		String myId = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();

		WebElement addedId = driver.findElement(By.xpath("//div[@id='profile-pic']"));
		String myIdDetails = addedId.getText();

		if (myIdDetails.equals(firstName + " " + lastName)) {
			System.out.println("Employee added successfully :: " + addedId.isDisplayed());
		} else {
			System.err.println("Employee did Not add successfully :: " + addedId.isDisplayed());
		}

		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();

		boolean found = false;
		while (!found) {

			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

			for (int i = 1; i < rows.size(); i++) {
				String rowsText = rows.get(i - 1).getText();
				if (rowsText.contains(myId )) {
					found = true;
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
					wait(2);
					driver.findElement(By.id("btnDelete")).click();
					driver.findElement(By.id("dialogDeleteBtn")).click();
					break;
				}

			}
            driver.findElement(By.linkText("Next")).click();
		}
		System.out.println("Added Employee :: " + myId + " successfully deleted! Test Case is Passed.");
		wait(2);
        tearDown();
	}

}
