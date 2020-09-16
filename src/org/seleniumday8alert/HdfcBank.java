package org.seleniumday8alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("login_page");
		WebElement btnCont = driver.findElement(By.xpath("(//img[contains(@alt,'continue')])[1]"));
		btnCont.click();
		driver.switchTo().alert().accept();
		

	}

}
