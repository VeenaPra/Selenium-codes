package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Xpath\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("https://www.flipkart.com/");
		WD.manage().window().maximize();
		WebElement ac = WD.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		Actions a = new Actions (WD);
		a.moveToElement(ac).perform();

}
}
