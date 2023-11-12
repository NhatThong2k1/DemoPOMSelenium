package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
 

public class BasePage {
    protected WebDriver driver;
    protected Actions action  ;
    public ActionKeyword actionsKeyword;
    
    public BasePage(WebDriver driver,Actions action ){
        this.driver = driver;
        this.action = action;
        this.actionsKeyword = new ActionKeyword(driver);
    }
    
    public WebDriver getDriver() {
		return driver;
	}
}
