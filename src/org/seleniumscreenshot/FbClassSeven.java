package org.seleniumscreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbClassSeven {

	public static void main(String[] args) {
		//all options without select
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> li = driver.findElements(By.xpath("//span[@id='u_0_w']/span/select/option"));
		System.out.println("total options: "+li.size());
		for (int i = 0; i < li.size(); i++) {
			WebElement element = li.get(i);
			String text = element.getText();
			System.out.println(text);
		}
	}
}
