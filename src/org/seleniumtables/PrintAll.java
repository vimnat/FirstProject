package org.seleniumtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAll {

	public static void main(String[] args) {
		//print all the tables data with looping
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
		
		for (WebElement rData : lstRows) {
			String rName = rData.getText();
			System.out.println(rName);
		}


	}

}
