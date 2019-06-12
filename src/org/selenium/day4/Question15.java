package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement btnLogin = driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		btnLogin.click();
		Thread.sleep(3000);
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		txtUserName.sendKeys("rubysherly@gmail.com");
		String txtResult2 = txtUserName.getAttribute("value");
		System.out.println(txtResult2);
		
		Thread.sleep(3000);
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		txtPassword.sendKeys("ruby@123");
		String txtResult3 = txtPassword.getAttribute("value");
		System.out.println(txtResult3);
		
	}

}
