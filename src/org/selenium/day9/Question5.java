package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question5 {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	WebElement dDnSelenium = driver.findElement(By.id("selenium_commands"));
	Select s = new Select(dDnSelenium);
	List<WebElement> obj = s.getOptions();
	for (int i = 1; i < obj.size(); i++) {
		WebElement w = obj.get(i);
		if(i % 2 == 0)
		{
			String text = w.getText();
			System.out.println(text);
		}
		
	}
	}

}
