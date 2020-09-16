package org.aspire;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrismAllDays {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int mon = 0;
		int tue = 0;
		int wed = 0;
		int thu = 0;
		int fri = 0;

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Resize current window to the set dimension

		// Logging in Prism home page
		driver.get("https://prism.aspiresys.com/PMO/login");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("vimal.ramachandran");
		driver.findElement(By.cssSelector("input[id= 'password'")).sendKeys("July@123");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		driver.findElement(By.cssSelector("a[class*= 'sf-with']")).click();

		// calling timesheet page
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='/PMO/timesheet/project']")).click();
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(20000);
		
		//finding locators using Tables
		WebElement pTable = driver.findElement(By.id("timesheet_table"));
		List<WebElement> lstRows = pTable.findElements(By.tagName("tr"));
		Thread.sleep(10000);
		for (int i = 0; i < lstRows.size(); i++) {
			WebElement wRows = lstRows.get(1);
			List<WebElement> lstData = wRows.findElements(By.tagName("td"));
			Thread.sleep(10000);
			for (int j = 0; j < lstData.size(); j++) {
				
				WebElement wTask = lstData.get(1);
				Thread.sleep(5000);
				String aTask = wTask.findElement(By.tagName("input")).getAttribute("value");
				Thread.sleep(5000);
				System.out.println("value"+aTask);
				
				if(aTask.isEmpty()) {
					WebElement wProject = lstData.get(0);
					wProject.findElement(By.tagName("input")).sendKeys("TestingSL-Bench");
					Thread.sleep(5000);
					//WebElement wTask = lstData.get(1);
					WebElement wDrop = wTask.findElement(By.tagName("input"));
					wDrop.sendKeys("bench");
					Thread.sleep(5000);
					//Thread.sleep(2000);
					wDrop.sendKeys(Keys.ARROW_DOWN);
					wDrop.sendKeys(Keys.ARROW_DOWN);
					wDrop.sendKeys(Keys.ENTER);
					Thread.sleep(10000);
					//WebElement wPlace = lstData.get(4);
					Select s = new Select(driver.findElement(By.xpath(
							"//tr[@class='timesheet-row ui-dynamic-row']//select[@class='timesheet-exclusion ui-control ui-mandatory']")));
					s.selectByValue("WFH");

					Select d = new Select(driver.findElement(By.xpath(
							"//tr[@class='timesheet-row ui-dynamic-row']//select[@class='timesheet-reason ui-control ui-mandatory']")));
					d.selectByValue("bench");
	
					WebElement wMon = lstData.get(7);
					///////wMon.findElement(By.tagName(tagName)
					//aMon.click();
					driver.findElement(By.xpath(
							"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
							.sendKeys("9");
					driver.findElement(By.xpath(
							"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
							.sendKeys("bench");
					driver.findElement(By.xpath(
							"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
							.click();
					System.out.println("monday attendace entered");
					  Thread.sleep(10000);
				}
				
			}
			
			
		}
//
//		// declaring strings for all the weekday
//		String assmon = driver
//				.findElement(By
//						.xpath("//input[@class='timesheet-project ui-complete ui-control ui-mandatory ui-autocomplete-input']"))
//				.getText();
//			if (assmon.isEmpty()) {
//					System.out.println(assmon + "-monday");
//					mon = 1;
//				}
//			
//		String asstue = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]")).getText();
//		if (asstue.isEmpty()) {
//			System.out.println(assmon + "-tuesday");
//			tue = 1;
//		}
//		String asswed = driver.findElement(By.xpath("(//div[@class='sticky-popup-toggler ui-widget-content ui-enabled ui-draft ui-unclosed weekday-3'])[1]")).getText();
//		if (asswed.isEmpty()) {
//			System.out.println(assmon + "-wednesday");
//			wed = 1;
//		}
//		String assthu = driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[11]/div")).getText();
//		if (assthu.isEmpty()) {
//			System.out.println(assmon + "-thursday");
//			thu = 1;
//		}
//		String assfri = driver.findElement(By.xpath("//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[12]/div")).getText();
//		if (assfri.isEmpty()) {
//			System.out.println(assmon + "-friday");
//			fri = 1;
//		}
//		System.out.println(mon + tue + wed + thu + fri);
//
//		// marking Ateendance for Monday, by selecting the project and summary, as it is
//		// the first day of week
//		switch (mon) {
//		// if (assmon.isEmpty()) {
//		case 1:
//			WebElement source = driver.findElement(
//					By.xpath("//tr[@class='timesheet-row ui-dynamic-row']//input[@placeholder='Type Your project']"));
//			source.sendKeys("TestingSL-Bench");
//			WebElement dest = driver.findElement(
//					By.xpath("//tr[@class='timesheet-row ui-dynamic-row']//input[@placeholder='Type Your Summary']"));
//			dest.sendKeys("bench");
//			Thread.sleep(2000);
//			dest.sendKeys(Keys.ARROW_DOWN);
//			dest.sendKeys(Keys.ARROW_DOWN);
//			dest.sendKeys(Keys.ENTER);
//			Thread.sleep(10000);
//			Select s = new Select(driver.findElement(By.xpath(
//					"//tr[@class='timesheet-row ui-dynamic-row']//select[@class='timesheet-exclusion ui-control ui-mandatory']")));
//			s.selectByValue("WFH");
//
//			Select d = new Select(driver.findElement(By.xpath(
//					"//tr[@class='timesheet-row ui-dynamic-row']//select[@class='timesheet-reason ui-control ui-mandatory']")));
//			d.selectByValue("bench");
//
//			driver.findElement(By.xpath(
//					"//tr[@class='timesheet-row ui-dynamic-row']//div[@class='sticky-popup-toggler ui-widget-content ui-enabled ui-draft ui-unclosed weekday-1']"))
//					.click();
//			driver.findElement(By.xpath(
//					"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
//					.sendKeys("9");
//			driver.findElement(By.xpath(
//					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
//					.sendKeys("bench");
//			driver.findElement(By.xpath(
//					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
//					.click();
//			System.out.println("monday attendace entered");
//			  Thread.sleep(10000);
//		}
//
//		// marking attendance for Tuesday
//		// else if (asstue.isEmpty()) {
//		switch (tue) {
//		case 1:
//			driver.findElement(By.xpath(
//					"/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]"))
//					.click();
//			driver.findElement(By.xpath(
//					"//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"))
//					.sendKeys("9");
//			driver.findElement(By.xpath(
//					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"))
//					.sendKeys("bench");
//			driver.findElement(By.xpath(
//					"//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"))
//					.click();
//			  Thread.sleep(10000);
//		}
//
//		// marking attendence for wednesday
//
//
//		  switch (wed) { 
//		  case 1:
//		  
//		  driver.findElement(By.xpath(
//		  "(//div[@class='sticky-popup-toggler ui-widget-content ui-enabled ui-draft ui-unclosed weekday-3'])[1]")).click();
//		  driver.findElement(By.xpath(
//		  "//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"
//		  )) .sendKeys("9"); driver.findElement(By.xpath(
//		  "//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"
//		  )) .sendKeys("bench"); driver.findElement(By.xpath(
//		  "//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"
//		  )) .click();
//		  Thread.sleep(10000);
//		  }
//		  
//		 switch (thu) { 
//		 case 1:
//		 driver.findElement(By.xpath(
//		  "//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[11]/div")).click();
//		  driver.findElement(By.xpath(
//		  "//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"
//		  )) .sendKeys("9"); driver.findElement(By.xpath(
//		  "//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"
//		  )) .sendKeys("bench"); driver.findElement(By.xpath(
//		  "//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"
//		  )) .click();
//		  Thread.sleep(10000);
//		 case 0:
//			 // System.out.println("thursday not enabled");
//		 } 
//		 
//		 switch (fri) { 
//		 case 1:
//		 driver.findElement(By.xpath(
//		  "//*[@id=\"timesheet_table\"]/tbody/tr[1]/td[12]/div")).click();
//		  driver.findElement(By.xpath(
//		  "//input[contains(@class,'timesheet-duration ui-mandatory ui-control ui-duration dynamic-time-entry hasTimeEntry')]"
//		  )) .sendKeys("9"); driver.findElement(By.xpath(
//		  "//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//textarea[contains(@class,'timesheet-comments ui-control ui-mandatory ui-comments')]"
//		  )) .sendKeys("bench"); driver.findElement(By.xpath(
//		  "//div[contains(@class,'float-menu-container sticky-popup-container sticky-popup-container-cloned')]//button[contains(@class,'float-menu-btn sticky-popup-btn ui-save')][contains(text(),'Save')]"
//		  )) .click(); }
		 

	}

}
