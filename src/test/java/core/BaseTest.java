package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 

public class BaseTest {

	public WebDriver driver;
	public Actions action;
	
	@BeforeMethod
	public void setUp() {
		this.driver = DriverFactory.getDriver("Edge");
		this.action = new Actions(driver);
		this.driver.get("https://demoqa.com/");
		this.driver.manage().window().maximize();
	}
	
	@AfterMethod
    public void tearDown(){
        this.driver.quit();
    }
}
