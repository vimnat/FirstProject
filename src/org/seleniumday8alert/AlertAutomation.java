package org.seleniumday8alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement txtBox = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		Actions acc = new Actions(driver);
		acc.contextClick(txtBox).perform();
		acc.doubleClick(txtBox).perform();
		acc.keyDown(txtBox, "a").keyUp("a").perform();
		
		driver.findElement(By.xpath("(//button[contains(text(),'click the')])[1]")).click();
		driver.switchTo().alert().accept();

	}

}
