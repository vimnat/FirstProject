package org.seleniumday6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		
/*		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Email");*/
		Robot r= new Robot();
		
		//press tab 6 times
		for (int i = 0; i < 6; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		


	}

}
