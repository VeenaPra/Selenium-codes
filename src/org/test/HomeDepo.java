package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// To Launch the URL
		wd.get("https://www.homedepot.com/");
		//To max the Window
		wd.manage().window().maximize();
		Actions a= new Actions(wd);
		WebElement course= wd.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		a.moveToElement(course).perform();
		WebElement dw = wd.findElement(By.xpath("(//a[@data-level='Heating & Cooling'])[1]"));
        a.moveToElement(dw).perform();
        //
        WebElement air= wd.findElement(By.xpath("//a[@title='Air Conditioners']"));
		a.moveToElement(air).perform();
		WebElement pair = wd.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
        a.moveToElement(pair).perform();

}

}
