package com.syntax.class04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {

	public static void main(String[] args) throws IOException, InterruptedException {

		String filePath = System.getProperty("user.dir") + "\\configs\\MyHW2.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		XSSFWorkbook book = new XSSFWorkbook(fis);

		Sheet sheet1 = book.getSheet("Sheet1");

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "http://www.newtours.demoaut.com/";
		driver.get(url);

		int rows = sheet1.getPhysicalNumberOfRows();
		int cols = sheet1.getRow(0).getLastCellNum();

		List<Map<String, String>> mapList = new ArrayList<>();
		for (int r = 1; r < rows; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			driver.findElement(By.linkText("REGISTER")).click();

			for (int c = 0; c < cols; c++) {

				String key = sheet1.getRow(0).getCell(c).toString();
				String value = sheet1.getRow(r).getCell(c).toString();
				map.put(key, value);

				switch (key) {
				case "First Name":
					driver.findElement(By.name("firstName")).sendKeys(map.get(key));
					break;

				case "Last Name":
					driver.findElement(By.name("lastName")).sendKeys(map.get(key));
					break;
				case "Phone":
					driver.findElement(By.name("phone")).sendKeys(map.get(key));
					break;
				case "Email":
					driver.findElement(By.name("userName")).sendKeys(map.get(key));
					break;
				case "Address":
					driver.findElement(By.name("address1")).sendKeys(map.get(key));
					break;
				case "City":
					driver.findElement(By.name("city")).sendKeys(map.get(key));
					break;
				case "State":
					driver.findElement(By.name("state")).sendKeys(map.get(key));
					break;
				case "Postal Code":
					driver.findElement(By.name("postalCode")).sendKeys(map.get(key));
					break;
				case "User Name":
					driver.findElement(By.name("email")).sendKeys(map.get(key));
					break;
				case "Password":
					driver.findElement(By.name("password")).sendKeys(map.get(key));
					break;
				case "Confirm Password":
					driver.findElement(By.name("confirmPassword")).sendKeys(map.get(key));
					break;
				}

			}
			driver.findElement(By.name("register")).click();
			Thread.sleep(2000);
			mapList.add(map);

		}

	}

}
