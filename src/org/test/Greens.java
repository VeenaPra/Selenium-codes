package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		// To Launch the URL
		WD.get("http://www.greenstechnologys.com");
		//To max the Window
		WD.manage().window().maximize();
		// To launch and pass the values
		////img[@alt='Greens Technologys - Leaders in IT training and Placement']
		WebElement gt = WD.findElement(By.xpath("(//img[@border='0'])[1]"));
		String pr = gt.getAttribute("value");
		System.out.println(pr);

}
}
