package org.seleniumchrome;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBegin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Enter 1 for opening Greentechnology's URL"+ "\n"
							+"Enter 2 for Facebook's URL"+"\n"+"Enter 3 for amazon URL"
							+"\n"+"Enter 4 for Green technologies Course content");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if(a==2) {
		driver.get("http://facebook.com");
		String c = driver.getCurrentUrl();
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Url: "+c);
		}
		
		if(a==1) {
		driver.get("http://www.greenstechnologys.com/");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Url: "+driver.getCurrentUrl());
		}
		if(a==3) {
		driver.get("https://www.amazon.in");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Url: "+driver.getCurrentUrl());
		}
		if(a==4) {
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Url: "+driver.getCurrentUrl());
		}
		
		
		driver.close();

	}
}

