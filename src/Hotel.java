import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRuby\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("gayathri");
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("45454");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
	}

}
