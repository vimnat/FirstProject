package org.seleniumbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Employee {

	public static void main(String[] args) {

		LibGlobal base = new LibGlobal();
		
		WebDriver driver = base.getDriver();
		base.getUrl(driver, "https://facebook.com");
		
		//base.findId(element, "email");
		WebElement txtUserName = base.findId(driver, "email");
		base.sendText(txtUserName, "vimal");
		
		WebElement txtPass = base.findXpath(driver, "//input[@id='pass']");
		base.sendText(txtPass, "vimalnath");
		
		WebElement btnsubmit = base.findXpath(driver, "//button[@name='login']");
		base.click(btnsubmit);
				
	}

}
