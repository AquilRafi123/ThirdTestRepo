package seleniumCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseSeleniumCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();//to setup browser
		
		WebDriver driver =new ChromeDriver();
		   driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		   driver.manage().window().maximize();
		   
		   //for pageload time check
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		   
		  WebElement cookies=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		   	 cookies.click();
		   	 
		   	 WebElement over18btn=driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		   	 over18btn.click();
		   	 
		   	 
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		   		wait.until(ExpectedConditions.visibilityOf(cookies));
//		   		cookies.click();
//		   		JavascriptExecutor js = (JavascriptExecutor)driver;
//		   		js.executeScript("arguments[0].click();", cookies);
		   		
		  WebElement firstname = driver.findElement(By.xpath("(//input[@id='firstname'])[1]"));
		  	firstname.sendKeys("Aquil");
		  	
		  WebElement lastname = driver.findElement(By.xpath("(//input[@id='lastname'])[1]"));
		  	lastname.sendKeys("Rafi");
		  	
		   WebElement email=driver.findElement(By.xpath("//input[@id='email_address']"));
		  	 email.sendKeys("nahid@yahoo.com");
		  	 
		  	  WebElement dob=driver.findElement(By.xpath("//input[@id='dob']"));
		  	 dob.sendKeys("12/05/1997");  //how to use dob from calendar
		  	 
		  	 WebElement genderDropdown=driver.findElement(By.xpath("//select[@id='gender']"));
		  	 
		  	 Select s = new Select(genderDropdown);
		  	 s.selectByValue("1");
//		  	 s.selectByIndex(0);
//		  	 s.selectByVisibleText("Female");
		  	 
//		  	 WebElement address=driver.findElement(By.xpath("//input[@id='address-search']"));
//		  	  address.sendKeys("London");
		  	  
		  	 WebElement manualaddress=driver.findElement(By.xpath("//div[@class='address-manual-button']"));
		  	  manualaddress.click();
		  	
		  	  
		  	  WebElement streetAddress =driver.findElement(By.xpath("//input[@id='street_1']"));
		  	  		streetAddress.sendKeys("Kerma");
		  	  		
		  	    WebElement city=driver.findElement(By.xpath("//input[@id='city']"));		
		  	    	city.sendKeys("Muzaffarpur");
		  	    	
		  	   WebElement state =driver.findElement(By.xpath("//input[@id='region']")); 	
		  	   		state.sendKeys("New York");
		  	   		
		  	   	WebElement zipCode=driver.findElement(By.xpath("//input[@id='zip']"));
		  	   			zipCode.sendKeys("23456789");
		  	   			
		  	   	WebElement country = driver.findElement(By.xpath("//select[@id='country']"));		
		  	   			country.click();
		  	   			
		  	   	
		
		
		
		
		
		
		
	}

}
