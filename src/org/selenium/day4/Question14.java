package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement lnkElectronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String txtResult = lnkElectronics.getAttribute("value");
		System.out.println(txtResult);
		
		WebElement lnkTV = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String txtResult2 = lnkTV.getAttribute("value");
		System.out.println(txtResult2);
		
		
	}

}
