package seleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		  driver.manage().window().maximize();
		  
		  WebElement dropdown =driver.findElement(By.xpath("//button[@id='menu1']"));
		  dropdown.click();
		  List<WebElement>dropdownList=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));

		   
		  for ( WebElement test:dropdownList) {
			  
			
			  
			 			  
			   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			   
			   wait.until(ExpectedConditions.visibilityOfAllElements(dropdownList));  
			  String value = test.getText();
//			  test.click();
			  System.out.println(value);
			  			  
		  }
		  Thread.sleep(2000);
		

	}

}
