package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		
		WebElement txtSearch = driver.findElement(By.id("autocomplete"));
		txtSearch.sendKeys("titan watch for women");
		
		WebElement btnSearch = driver.findElement(By.xpath("//a[text()='Search']"));
		btnSearch.click();
		
		
		WebElement lnkWatch = driver.findElement(By.xpath("//h2[text()='Titan Quartz Gold Oval Women Watch TI000I20500']"));
		lnkWatch.click();
		
		WebElement btnAddtocart = driver.findElement(By.xpath("//button[text()='Add To Cart']"));
		String txtResult = btnAddtocart.getAttribute("value");
		System.out.println(txtResult);
		
	}

}
