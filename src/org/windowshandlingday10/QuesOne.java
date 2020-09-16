package org.windowshandlingday10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesOne {

	public static void main(String[] args) throws InterruptedException {
		
//		URL : https://www.amazon.com/
//		NOTE: NOTE: Search iphones X and click 1st phone and add it to cart.click Proceed to checkout print the
//			 1 st line from thr popoup.
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumStart\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String pWid = driver.getWindowHandle();
		System.out.println(pWid);
		driver.manage().window().maximize();
		//searching iphone X and enter
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone");
		Thread.sleep(2000);
		txtSearch.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement btnXs = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone XS Max, 64GB, Gold - Fully Unlocked (Renewed)')]"));
		btnXs.click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("addToCart_feature_div")).click();
		
		
		//all windows



	}

}
