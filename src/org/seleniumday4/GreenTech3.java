package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com ");
		driver.manage().window().maximize();
		WebElement para3 = driver.findElement(By.xpath("//p[contains(.,'We at')]"));
		String p3 = para3.getText();
		System.out.println(p3);
		
		

	}

}
