package org.seleniumscreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		List<WebElement> li = s.getOptions();
		
		for (int i = 0; i < li.size(); i++) {
			WebElement element = li.get(i);
			String text = element.getAttribute("value");
			System.out.println(text);
		}
	
		System.out.println(li.size());

	}

}
