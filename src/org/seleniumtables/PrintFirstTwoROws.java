package org.seleniumtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFirstTwoROws {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
		System.out.println(lstRows.size());
		for (int i = 0; i < lstRows.size(); i++) {
		WebElement rtable = lstRows.get(i);
		List<WebElement> col = rtable.findElements(By.tagName("td"));
		for (int j = 0; j < col.size(); j++) {
			WebElement cData = col.get(j);
			if(j==0) {		
			String cName = cData.getText();
			System.out.print(cName);
			
			}
			
		}

		System.out.println("");	
		}

	}

}
