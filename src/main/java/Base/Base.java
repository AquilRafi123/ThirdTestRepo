package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;
	public static Properties prop;

//	to read and load property file
	static {
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\khan\\eclipse-workspace\\ManishSirPractise\\Data\\Testdata.properties");
//		Properties prop = new Properties();//we have to make property global so used line 17 and 9
		 prop = new Properties();
		
//		try {
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {		//IO exception is parent exception of file not found exception , so child exception i.e. file not found exception used first
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
//	browser setup
	public void browserSetup() {
		
	String BrowserName=prop.getProperty("browser");
	
	if(BrowserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	}else if(BrowserName.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}else if (BrowserName.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	driver.get(prop.getProperty("url"));
	}

//	webdriver setup
	public WebDriver getDriver() {
		return driver;
	}
	
// perfectclick i.e. java click
	
	public void javaExecutorClick(WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", ele);
		jse.executeScript("arguments[0].click()", ele);
	}

//	dropdown set up of select type using select class
	public void dropdownSelectByValue(WebElement ele , String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
		
		}
	public void dropdownSelectByVisibleText(WebElement ele, String value) {
		Select s = new Select (ele);
		s.selectByVisibleText(value);
		
	}
	
	public void dropdownSelectByIndex(WebElement ele, int num) {
		Select s  = new Select(ele);
		s.selectByIndex(num);
		
		}
	
	
}
