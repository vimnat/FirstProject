package org.seleniumtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alternative {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < lstRows.size(); i++) {
			
			WebElement cRows = lstRows.get(i);
			//String rName = cRows.getText();
			//System.out.println(rName);
			List<WebElement> lstCols = cRows.findElements(By.tagName("td"));
			for (int j = 0; j < lstCols.size(); j=j+2) {
				WebElement cols = lstCols.get(j);
				String cName = cols.getText();
				System.out.println(cName);
			}
			
			
		}
	}

}
