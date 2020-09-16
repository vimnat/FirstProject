package org.seleniumday8alert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File ("C:\\Users\\ELCOT\\Desktop\\Selenium\\google.png");
		FileUtils.copyFile(s,d);
		

	}



}
