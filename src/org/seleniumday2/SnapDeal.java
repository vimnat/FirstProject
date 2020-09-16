package org.seleniumday2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for mail and 2 for mobile number ");
		int a = sc.nextInt();
		if (a==2) {
		driver.findElement(By.id("username")).sendKeys("9003276760");
		}
		if (a==1) {
		driver.findElement(By.id("username")).sendKeys("vimnat@gmail.com");
		}
		
		
	}

}
