package org.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCourse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// To Launch the URL
		wd.get("http://greenstech.in/selenium-course-content.html");
		//To max the Window
		wd.manage().window().maximize();
		Actions a= new Actions(wd);
		WebElement findElement = wd.findElement(By.xpath("//div[@class='header-browse-greens']"));
			a.moveToElement(findElement).perform();
			WebElement findElement2 = wd.findElement(By.xpath("//span[text()='Oracle (48)']"));
			a.moveToElement(findElement2).perform();
			WebElement findElement3 = wd.findElement(By.xpath("//span[text()='SQL Certification Training']"));
			findElement3.click();
			
			
		}
		

}

