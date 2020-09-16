package org.seleniumday6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement para1 = driver.findElement(By.xpath("//p[contains(text(),'leading')]"));
		String p1 = para1.getText();
		
		System.out.println(p1);
		Robot r= new Robot();
		Actions acc= new Actions(driver);
		acc.doubleClick(para1).perform();
		acc.doubleClick().perform();
//		acc.click(para1).perform();
//		acc.click(para1).perform();
		acc.contextClick(para1).perform();
/*		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);*/



		
/*		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Email");*/
//
//		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

	}

}
