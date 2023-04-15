package mouseHoverActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options );
		
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		WebElement products = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		
		//explicit wait and its class
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));
		waits.until(ExpectedConditions.visibilityOf(products));
		
		//Action class for hover
		Actions a = new Actions(driver);
		a.moveToElement(products).build().perform();
		
//		a.sendKeys(Keys.ENTER);	{using enter using action class}
		
		
		
	}

}
