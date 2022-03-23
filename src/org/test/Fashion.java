package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fashion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// To Launch the URL
		wd.get("https://www.snapdeal.com/");
		//To max the Window
		wd.manage().window().maximize();
		Actions a= new Actions(wd);
		WebElement fashion= wd.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(fashion).perform();
		WebElement foot = wd.findElement(By.xpath("(//span[@class='headingText'])[1]"));
	    
	    WebElement heel = wd.findElement(By.xpath("//span[text()='Heels']"));
	    a.moveToElement(heel).perform();

	}

}
