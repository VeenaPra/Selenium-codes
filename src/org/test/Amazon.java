package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("http://www.amazon.in");
		WD.manage().window().maximize();
		WebElement prime = WD.findElement(By.id("nav-link-prime"));
		
		Actions a = new Actions (WD);
		a.moveToElement(prime).perform();
		
		
				
		
		
		
	}

}
