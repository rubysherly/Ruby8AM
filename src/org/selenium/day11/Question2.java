package org.selenium.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			WebElement row = tRow.get(i);
			List<WebElement> tData = row.findElements(By.tagName("td"));
			for (int j = 0; j < tData.size(); j++) {
				WebElement data = tData.get(j);
				String name = data.getText();
				//System.out.println(name);
				if(name.equals("4")) {
					System.out.println("China Rank is " +name);
					 
				}
				
			}
			
		}
		
	}

}
