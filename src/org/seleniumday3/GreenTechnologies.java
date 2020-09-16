package org.seleniumday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechnologies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		driver.manage().window().maximize();
		//driver.findElement(arg0)
		

	}

}
