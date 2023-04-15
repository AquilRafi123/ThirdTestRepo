package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindowID=driver.getWindowHandle();
		System.out.println(parentWindowID);
		
		WebElement btn3 =driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		btn3.click();
		
		Set<String> childWindowID = driver.getWindowHandles();
		
		for (String childStore:childWindowID) {
			
			System.out.println(childStore);
			
			if(!parentWindowID.equals(childStore)) {
				
				driver.switchTo().window(childStore);
				String Title=driver.getTitle();
				System.out.println(Title);
				
				if(Title.contains("Basic Controls")) {
				driver.manage().window().maximize();
				WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
				firstname.sendKeys("Nahid");
				
			}
			}
			
		
		}
	
	}
	
	}
