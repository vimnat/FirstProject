package org.seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Vimal");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("****");
		System.out.println(txtUserName.getText());
		String text = txtPassword.getTagName();
		System.out.println(text);

	}

}
