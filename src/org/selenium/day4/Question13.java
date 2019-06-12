package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement txtFirstName = driver.findElement(By.id("firstName"));
		txtFirstName.sendKeys("ruby");
		String txtResult = txtFirstName.getAttribute("data-initial-value");
		System.out.println(txtResult);
		
		WebElement txtLastName = driver.findElement(By.id("lastName"));
		txtLastName.sendKeys("sherly");
		String txtResult1 = txtLastName.getAttribute("data-initial-value");
		System.out.println(txtResult1);
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("rubysherly");
		String txtResult2 = txtUserName.getAttribute("data-initial-value");
		System.out.println(txtResult2);
		
		WebElement txtPassword = driver.findElement(By.name("Passwd"));
		txtPassword.sendKeys("ruby@123");
		String txtResult3 = txtPassword.getAttribute("data-initial-value");
		System.out.println(txtResult3);
		
		
		WebElement txtConfirmPassword = driver.findElement(By.name("ConfirmPasswd"));
		txtConfirmPassword.sendKeys("ruby@123");
		String txtResult4 = txtConfirmPassword.getAttribute("data-initial-value");
		System.out.println(txtResult4);
		
		
	}

}
