package org.seleniumday8alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='login_button'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='Button2'])[1]")).click();
		driver.switchTo().alert().accept();

	}

}
