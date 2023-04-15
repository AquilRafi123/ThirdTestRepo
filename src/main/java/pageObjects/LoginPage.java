package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Base {
//	WebDriver driver;
	
	public void landingPage() {
		
		browserSetup();
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		driver = new ChromeDriver(options);
//		driver.get("https://www.saucedemo.com/");
		
			
	}
	
	public void userName (String  anyusernName ) {
		
		WebElement username=getDriver().findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(anyusernName);
	}
	
	public void password(String anypswd) {
		
		WebElement password =getDriver().findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(anypswd);
		
	}
	
	public void loginClick () {
		
		WebElement loginbtn =getDriver().findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click();
		
	}
	
	
}
