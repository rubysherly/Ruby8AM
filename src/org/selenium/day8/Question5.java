package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement btnContinue = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		btnContinue.click();
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
		btnLogin.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	

}
