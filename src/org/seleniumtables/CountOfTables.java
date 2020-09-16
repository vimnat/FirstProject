package org.seleniumtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> lstTable = driver.findElements(By.tagName("table"));
		System.out.println("Count of Tables: "+lstTable.size());
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
		System.out.println("count of Rows: "+lstRows.size());
		WebElement cRows = lstRows.get(0);
		List<WebElement> lstCols = cRows.findElements(By.tagName("th"));
		System.out.println("Count of colunms: "+lstCols.size());
//		for (int i = 0; i < lstRows.size(); i++) {
//			WebElement cRows = lstRows.get(0);
//			List<WebElement> lstCols = cRows.findElements(By.tagName("td"));
//			System.out.println("Count of colunms"+lstCols.size());
//		}
	}

}
