package org.seleniumday4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GreenTech extends Chromed {

	public static void main(String[] args) {
		GreenTech gt = new GreenTech();
		gt.chromeDriv();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		WebElement para1 = driver.findElement(By.xpath("//p[contains(.,'in ADYAR')]"));
		System.out.println(para1.getText());
		
	
		
	
		
		

	}

}
