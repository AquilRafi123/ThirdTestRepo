package popupHandlingCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
//		driver.get("https://the-internet.herokuapp.com/");
//		WebElement basicauthhyperlink=driver.findElement(By.xpath("//a[text()='Basic Auth']"));
//		
//		basicauthhyperlink.click();
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
