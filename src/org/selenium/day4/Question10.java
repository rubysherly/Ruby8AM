package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement txtEmail = driver.findElement(By.id("identifierId"));
		txtEmail.sendKeys("rubysherly@gmail.com");
		
		WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext.click();
		
		Thread.sleep(3000);
		
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("georgely");
		
		WebElement btnNextPwd = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNextPwd.click();
		
		driver.quit();
		
	}

}
