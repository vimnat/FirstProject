package org.windowshandlingday10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuesFourGreens {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		WebElement btnContact = driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]"));
		
		Actions acc = new Actions(driver);
		acc.contextClick(btnContact).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String eachId : allId) {
			if(parentId!=eachId) {
				driver.switchTo().window(eachId);
			}
		}
		driver.findElement(By.id("InputName")).sendKeys("vimal");
		
		//(//a[contains(text(),'Contact Us')])[1]
		

		
		

	}

}
