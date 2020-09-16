package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		WebElement txtLoc = driver.findElement(By.id("location"));
		txtLoc.sendKeys("chenn");
		Thread.sleep(2000);
		txtLoc.sendKeys(Keys.ARROW_DOWN);
		txtLoc.sendKeys(Keys.ENTER);
		

	}

}
