package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatawareHouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// To Launch the URL
		wd.get("http://greenstech.in/selenium-course-content.html");
		//To max the Window
		wd.manage().window().maximize();
		Actions a= new Actions(wd);
		WebElement course= wd.findElement(By.xpath("//div[@class='header-browse-greens']"));
		//
		a.moveToElement(course).perform();
		WebElement dw = wd.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
        a.moveToElement(dw).perform();
}
}
