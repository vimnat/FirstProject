package org.seleniumchrome;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBegin {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
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
