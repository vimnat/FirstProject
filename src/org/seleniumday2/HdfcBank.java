package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Continue to NetBanking')])[2]")).click();
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtUserName.sendKeys("Vimal");
//		driver.switchTo().frame("login_page");
//		driver.findElement(By.name("fldLoginUserId")).sendKeys("44232");
		
		//txtUserName.getClass();

	}

}
