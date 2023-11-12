package core;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class DriverFactory {
	
	public static WebDriver getDriver(String driverType) {
		
		switch(driverType) {
		case "chrome":
	 
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case "Edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
			
		default:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
	}

}
