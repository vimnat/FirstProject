package org.seleniumbaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	//WebDriver driver;
	WebElement element;

	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public void getUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public WebElement findId(WebDriver driver,String find) {
		WebElement element = driver.findElement(By.id(find));
		return element;
	}
	
	public WebElement findXpath(WebDriver driver, String find) {
		WebElement element = driver.findElement(By.xpath(find));
		return element;
	}
	
	public void sendText(WebElement element, String text ) {
		element.sendKeys(text);
	}
	
	public void click(WebElement element) {
		element.click();
	}
		
}
