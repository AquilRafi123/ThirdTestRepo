package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		   
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		String parentWindowID=driver.getWindowHandle();
		System.out.println(parentWindowID);
		
		WebElement tabBtn=driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		tabBtn.click();
		
		Set<String> childWindowID=driver.getWindowHandles();
		
		for (String idstore:childWindowID) {
			System.out.println(idstore);
		if(!parentWindowID.equals(idstore)) {
			
			driver.switchTo().window(idstore);
		}
			
			
		}
		WebElement btnClickMe=driver.findElement(By.xpath("//button[@id='alertBox']"));
		btnClickMe.click();
		
		

	}

}
