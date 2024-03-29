package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.switchTo().frame("login_page");
		WebElement btnContinue = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		btnContinue.click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}

}
