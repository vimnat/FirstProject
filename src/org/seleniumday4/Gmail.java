package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='h-c-header__nav-li-link '])[1]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("vimnat");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb'])")).click();
		

	}

}
