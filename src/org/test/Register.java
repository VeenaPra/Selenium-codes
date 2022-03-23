package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("http://www.amazon.in");
		WD.manage().window().maximize();
		Actions a = new Actions (WD);
		WebElement sign = WD.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(sign).perform();
		//
		WebElement reg = WD.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		a.moveToElement(reg).perform();
		Thread.sleep(3000);
		WebElement reg1 = WD.findElement(By.xpath("//input[@type='email']"));
		
		WebElement con = WD.findElement(By.id("continue"));
		a.moveToElement(con).perform();
		
	}

}
