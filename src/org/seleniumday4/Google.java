package org.seleniumday4;

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
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		WebElement txtBox = driver.findElement(By.xpath("//input[@name='q']"));
		txtBox.sendKeys("Greens Velmurugan");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		/*WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Pass");
		String attEmail = txtEmail.getAttribute("value");
		System.out.println(attEmail);
		String attPass = txtPass.getAttribute("value");
		System.out.println(attPass);*/

	}

}
