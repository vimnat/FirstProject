package org.seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsSqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Vimalnath");
		driver.findElement(By.id("lastName")).sendKeys("Ramachandran");
		driver.findElement(By.id("userEmail")).sendKeys("vimnat@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9003276760");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);
		Select sMonth = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		sMonth.selectByValue("4");
		Thread.sleep(2000);
		Select sYear = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		sYear.selectByValue("1991");
		//div[text()='21']
		driver.findElement(By.xpath("//div[text()='21']")).click();
		WebElement txtSub = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		txtSub.click();
		txtSub.sendKeys("eng");
		txtSub.sendKeys(Keys.ENTER);
		
		
		
		
		
		

	}

}
