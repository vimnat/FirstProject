package org.seleniumscreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbClassSix {

	public static void main(String[] args) {
		//alternate options
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		List<WebElement> li = s.getOptions();
		
		for (int i = 0; i < li.size(); i=i+2) {
			WebElement element = li.get(i);
			String text = element.getText();
			System.out.println(text);
		}



	}

}
