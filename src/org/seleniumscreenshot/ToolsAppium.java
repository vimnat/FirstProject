package org.seleniumscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsAppium {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		WebElement sDown = driver.findElement(By.xpath("//span[contains(text(),'Appium Mob')]"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",sDown);
		
		Object rValue = js.executeScript("return arguments[0].getAttribute('value')", sDown);
		
		System.out.println(rValue);
		
//		Thread.sleep(4000);
//		TakesScreenshot tk = (TakesScreenshot) driver;
//		
//		File source = tk.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\ELCOT\\Desktop\\Selenium\\toolssqa.png");
//		
//		FileUtils.copyFile(source, dest);

	}

}
