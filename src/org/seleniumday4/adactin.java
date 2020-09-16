package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Vimal");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Nath");
		String vUser = txtUserName.getAttribute("value");
		String vPass = txtPassword.getAttribute("value");
		System.out.println(vUser);
		System.out.println(vPass);

	}

}
