package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.name("DUMMY1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL")).sendKeys("vimnat");
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("****");
		

	}

}
