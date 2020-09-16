package org.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreensTech {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.findElement(By.xpath("//a[@href='contact.php']")).click();
		driver.findElement(By.xpath("//input[@id='InputName']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//input[@id='InputEmail1']")).sendKeys("vimnat@gmail.com");
		driver.findElement(By.xpath("//input[@id='InputSubject']")).sendKeys("9003276760");
		Select s=new Select(driver.findElement(By.xpath("(//select[@name='courses'])[1]")));
		s.selectByValue("Selenium");
		Select sBranch=new Select(driver.findElement(By.xpath("(//select[@name='branch'])[1]")));
		sBranch.selectByValue("OMR");
		Select sTime=new Select(driver.findElement(By.xpath("(//select[@name='time'])[1]")));
		sTime.selectByValue("In a Month");
		driver.findElement(By.xpath("(//textarea[@name='comments'])[2]")).sendKeys("Starting with Selenium");
		
	}

}
