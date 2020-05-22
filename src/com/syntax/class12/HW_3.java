package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class HW_3 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 3: HRMS Login Navigate to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login to the
		 * application by writing xpath based on “parent and child relation”
		 */

		setUp();
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username, "Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
        sendText(password, "Hum@nhrm123");
		
		
		WebElement login = driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));

		waitAndClick(login);

	}

}
