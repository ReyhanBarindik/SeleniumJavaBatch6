package com.syntax.class10;




import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class HW_3 extends CommonMethods {

	public static void main(String[] args) {
		/*TC 3: Windows Handling
		Open chrome browser
		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		Click on “Javascript Alerts” link
		Click on “Window Popup Modal” link
		Click on the “ Follow On Instagram” button
		Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
		Click on the “Like us On Facebook ” button
		Verify title of the page is “Go to Facebook Home” 
		Quit the browser
        */
		
		setUp();
		
		List<WebElement> alertsModels =driver.findElements(By.tagName("a"));
		clickRightElement(alertsModels, "Alerts & Modals");
		
		List<WebElement> javaScriptAlerts =driver.findElements(By.tagName("a"));
		clickRightElement(javaScriptAlerts, "Javascript Alerts");
		
		List<WebElement> alertsModels2 =driver.findElements(By.tagName("a"));
		clickRightElement(alertsModels2, "Alerts & Modals");
		
		List<WebElement> windowPopupModal =driver.findElements(By.tagName("a"));
		clickRightElement(windowPopupModal, "Window Popup Modal");
		
		String parentHandle=driver.getWindowHandle();
		WebElement childWindow1 =driver.findElement(By.linkText("Follow On Instagram"));
		waitAndClick(childWindow1);
		
		Set<String> allWindowHandle=driver.getWindowHandles();
		windowsHandle(allWindowHandle, parentHandle);
				
		WebElement childWindow2 =driver.findElement(By.linkText("Like us On Facebook"));
		waitAndClick(childWindow2);
		
		Set<String> allWindowHandle2=driver.getWindowHandles();
		windowsHandle(allWindowHandle2, parentHandle);
		
		
		//tearDown();
		
		
		
		
		
		
		
	}

}
