package org.selenium.day9;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement btnContinue = driver.findElement(By.xpath("//div[text()='Creative Images']"));
		btnContinue.click();
		Thread.sleep(3000);
		WebElement lblVideo = driver.findElement(By.xpath("//label[text()='Video']"));
		lblVideo.click();
		
	}

}
