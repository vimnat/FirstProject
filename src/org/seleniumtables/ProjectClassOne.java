package org.seleniumtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectClassOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\JunitStart\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone11");
		WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit'][1]"));
		btnSearch.click();
		
		//List<WebElement> liPrice = driver.findElements(By.xpath("//div[@class='a-section a-spacing-medium']"));
		List<WebElement> liPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < liPrice.size(); i++) {
			WebElement price = liPrice.get(i);
			//WebElement prodName = price.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			//List<WebElement> prodName = price.findElements(By.tagName("span"));
			//WebElement prod = prodName.get(j);
			//WebElement prodName = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
			String pName = price.getText();
			System.out.println(pName);

			
			
		}


	}

}
