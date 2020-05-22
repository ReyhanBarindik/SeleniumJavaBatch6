package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php /auth”
		 * Login to the application by writing xpath based on “parent and child
		 * relation”
		 */
		
		setUp();
		
		WebElement parentChild=driver.findElement(By.xpath("//form[@id='frmLogin']/div[1]"));
		
		
		WebElement siblingRelation=driver.findElement(By.xpath("//input[@name='_csrf_token']/following-sibling :: div[1]"));
		
		
		
		
		

	}

}
