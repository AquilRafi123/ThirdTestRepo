package seleniumCode;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LopaCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.get("https://www.vuse.com/gb/en/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement acceptAllCookies = driver.findElement(By.xpath("//button[@id='onetrust-pc-btn-handler']"));
		
		acceptAllCookies.click();
		
		WebElement over18btn = driver.findElement(By.xpath("//button[@class='action allow secondary'] "));
		
		over18btn.click();
		
		
		
		WebElement userName = driver.findElement(By.xpath("//body[@id=\"html-body\"]"));
			
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@name=\"login[password]\"]"));
				
		password.sendKeys("secret_sauce");
				
		WebElement loginBtn = driver.findElement(By.xpath("//button[@class=\"action login primary\"]"));
				
		loginBtn.click();
				
		driver.close();
				
				
				
				
	
		

	}

}
