package org.seleniumscreenshot;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		WebElement year = driver.findElement(By.id("year"));
		Select s = new Select(year);
		List<WebElement> li = s.getOptions();
		
		for (int i = 0; i < li.size(); i++) {
			WebElement element = li.get(i);
			String text = element.getText();
			System.out.println(text);
		}
	
		System.out.println(li.size());

	}

}
