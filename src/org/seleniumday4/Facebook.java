package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("vimal");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Pass");
		String attEmail = txtEmail.getAttribute("value");
		System.out.println(attEmail);
		String attPass = txtPass.getAttribute("value");
		System.out.println(attPass);

	}

}
