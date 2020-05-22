package com.syntax.SeleniumReview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YunusWebTable {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://166.62.36.207/syntaxpractice/table-search-filter-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']")).click();
		WebElement header = driver.findElement(By.xpath("//table[@class='table']/thead[@class='thead-inverse']"));
		String head = header.getText();
		System.out.println(head);
//			WebElement bodyList = driver.findElement(By.xpath("//table[@class='table']//tbody"));
//			String people = bodyList.getText();
//			System.out.println(people);
//			List<WebElement> bodyList = driver.findElements(By.xpath("//table[@class='table']//tbody/tr"));
//			for (WebElement people : bodyList) {
//				String peopleText = people.getText();
//				
//				if(peopleText.contains("Byron")) {
//					System.out.println(peopleText);
//				}
//			}
		List<WebElement> bodyList = driver.findElements(By.xpath("//table[@class='table']//tbody/tr"));
		System.out.println(bodyList.size());
		WebElement serachBox = driver.findElement(By.xpath("//input[@placeholder='#']"));
		String path = "C:\\Users\\reyha\\eclipse-workspace\\SeleniumJavaBatch6\\configs\\MyHW2.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.createSheet("Sheet 10");
		for (int i = 1; i < bodyList.size() + 1; i++) {
			serachBox.clear();
			serachBox.sendKeys("" + i + "");
			Thread.sleep(1000);
			List<WebElement> people = driver.findElements(By.xpath("//table[@class='table']//tbody//tr[" + i + "]"));
			for (WebElement peopleList : people) {
				String text = peopleList.getText();
				sheet.createRow(i).createCell(0).setCellValue(text);
			}
		}
		FileOutputStream fos = new FileOutputStream(path);
		book.write(fos);
		fos.close();
	}

}
