package org.seleniumday3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement txtFirst = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		txtFirst.sendKeys("Vimalnath");
		WebElement txtLast = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		txtLast.sendKeys("Ramachandran");
		WebElement txtAdrs = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAdrs.sendKeys("Thanjavur");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		txtPhone.sendKeys("9003276760");
		WebElement rdoM = driver.findElement(By.xpath("//input[@ng-model='radiovalue']"));
		rdoM.click();
		WebElement chkHob = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		chkHob.click();
		Thread.sleep(4000);
		WebElement txtLang = driver.findElement(By.xpath("//div[@id='msdd']"));
		txtLang.click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		

		}
		


	}


