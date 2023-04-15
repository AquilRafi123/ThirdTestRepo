package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;
	public static Properties prop;

	
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

	public WebDriver getDriver() {
		return driver;
	}
}
