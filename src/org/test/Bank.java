package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		
		WD.get("http://demo.guru99.com/test/drag_drop.html");
		WD.manage().window().maximize();
		WebElement drag = WD.findElement(By.id("credit2"));
		WebElement drop = WD.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement dr = WD.findElement(By.id("fourth"));
		WebElement drp = WD.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions a = new Actions (WD);
		a.dragAndDrop(drag, drop).perform();
		a.dragAndDrop(dr, drp).perform();
	
}
}
