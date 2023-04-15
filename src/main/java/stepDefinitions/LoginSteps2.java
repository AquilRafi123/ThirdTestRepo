package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage2;

public class LoginSteps2 {

	WebDriver driver;
	LoginPage2 fn =new LoginPage2();
	

	
		
		@Given("user enters correct user name")
		public void user_enters_correct_user_name() {
			
			fn.userName();
//			WebDriverManager.chromedriver().setup();
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--incognito");
//			driver = new ChromeDriver(options);
//			driver.get("https://www.saucedemo.com/");
//			WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
//			username.sendKeys("standard_user");
//		  
		}

		@Given("user enters correct password")
		public void user_enters_correct_password() {
			fn.password();
//			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
//			password.sendKeys("secret_sauce");
		}

		@Then("User click on login button")
		public void user_click_on_login_button() {
			fn.clickLoginBtn();
//			WebElement Loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
//			Loginbtn.click();
			
		}
		
		@Then("USer is navigated to next page")
		public void u_ser_is_navigated_to_next_page() {
			fn.validation();
//		 WebElement headings =driver.findElement(By.xpath("//div[@class='app_logo']"));
//		 String ActualHeading=headings.getText();
////		assertEquals("Swag Labs",ActualHeading);
////		assertTrue
		}
		


	}


