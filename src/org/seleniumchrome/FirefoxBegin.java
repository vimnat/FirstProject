package org.seleniumchrome;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBegin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
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
