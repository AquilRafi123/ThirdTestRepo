package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);		
		
		WebElement btn1=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		btn1.click();
		
		Set<String> childWindowID=driver.getWindowHandles();
		
		for(String childstore:childWindowID) {
			System.out.println(childstore);
			
			if(!parentWindowId.equals(childstore)) {
				driver.switchTo().window(childstore);
					
			}
				
			}
			
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));		
		firstname.sendKeys("Aquil");
		
	
	}
		
		
		
		
	}



