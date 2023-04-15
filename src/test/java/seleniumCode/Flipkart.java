package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement search =driver.findElement(By.xpath("//input[@title='Search']"));
		
		search.sendKeys("flipkart");
		search.sendKeys(Keys.ENTER);
		
		WebElement searchbutton=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		searchbutton.click();
		
	}

}
