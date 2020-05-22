package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class HW_4  extends CommonMethods{

	public static void main(String[] args) {
		/*TC 4: HRMS Login
Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “following and preceding siblings”
click login button using JS executer.
*/
       
		setUp();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username, "Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
        sendText(password, "Hum@nhrm123");
		
		
		//WebElement login1 = driver.findElement(By.xpath("//div[@id='divLoginHelpLink'] / following :: input"));
        WebElement login2 = driver.findElement(By.xpath("//div[@style='text-align: center']/ preceding :: input[1]"));
		
    	JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].click();", login2);
		
		
		
		
		
		
	}

}
