package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txtSource = driver.findElement(By.id("src"));
		Thread.sleep(4000);
		txtSource.sendKeys("chenn");
		Thread.sleep(2000);
		txtSource.sendKeys(Keys.ARROW_DOWN);
		txtSource.sendKeys(Keys.ARROW_DOWN);
		txtSource.sendKeys(Keys.ENTER);
		WebElement txtDest = driver.findElement(By.id("dest"));
		Thread.sleep(2000);
		txtDest.sendKeys("bang");
		Thread.sleep(2000);
		txtDest.sendKeys(Keys.ENTER);
		

	}

}
