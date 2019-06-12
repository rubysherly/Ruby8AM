package org.selenium.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtUsername = driver.findElement(By.className("_2zrpKA"));
		txtUsername.sendKeys("rubysherly@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("Ruby@1993");
		WebElement btnLogin = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		btnLogin.click();
		
	}

}
