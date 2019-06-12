package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("rubysherly");
		String txtResult = txtUsername.getAttribute("value");
		System.out.println(txtResult);
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("ruby@123");
		String txtResult1 = txtPassword.getAttribute("value");
		System.out.println(txtResult1);
		
		
		
		
	}

}
