package org.seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenOneTwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php ");
		driver.manage().window().maximize();
		WebElement para1 = driver.findElement(By.xpath("//p[contains(text(),'Selenium is one')]"));
		String p1 = para1.getText();
		WebElement para2 = driver.findElement(By.xpath("//p[contains(text(),'Emerging as')]"));
		String p2 = para2.getText();
		System.out.println("Para 1 \n"+p1+"\n"+"Para2 \n"+p2);
		
	}
}
