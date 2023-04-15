package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPage2 {
	
	WebDriver driver;
	
	
	public void userName() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
	  }
	
	public void password () {
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
			
	}
	public void clickLoginBtn() {
		
		WebElement Loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		Loginbtn.click();
	}
	
	public void validation() {
		
		WebElement headings =driver.findElement(By.xpath("//div[@class='app_logo']"));
		 String ActualHeading=headings.getText();
//		assertEquals("Swag Labs",ActualHeading,"heading is different "); //heading is different will print when validation fails
//		assertTrue(heading.isDisplayed());
//		 Assert.assertEquals("Swag Labs",ActualHeading);
	}
}
