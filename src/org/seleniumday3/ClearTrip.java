package org.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='forceHttps'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("signuplink")).click();

	}

}
