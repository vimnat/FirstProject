package org.seleniumscreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbClassFive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		List<WebElement> li = s.getOptions();
		
		int size = (li.size()-1)/2;
		System.out.println(size);
		WebElement element = li.get(size);
		element.click();
		String text = element.getText();
		System.out.println(text);
		//System.out.println(s.selectByIndex(size2));


	}

}
