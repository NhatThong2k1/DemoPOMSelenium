package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.ActionKeyword;
import core.BasePage;

public class LoginPage extends BasePage {
 
 

    public LoginPage(WebDriver driver,Actions action) {
    	super(driver,action);
 
		// TODO Auto-generated constructor stub
	}

 
    
    private By Elements = By.xpath("//h5[text()='Elements']//../..");
    private By Forms = By.xpath("//h5[text()='Forms']//../..");

 
    // Page Actions
    public void toElementPage()throws InterruptedException{
    	action.scrollToElement(actionsKeyword.getElement(Elements)).build().perform();
    	   Thread.sleep(2000);
    	 actionsKeyword.click(Elements);
          Thread.sleep(2000);
    }
    public void toFormPage() throws InterruptedException{
       // this.driver.findElement(By.xpath(Forms)).click();    
        action.scrollToElement(actionsKeyword.getElement(Forms)).build().perform();
        Thread.sleep(2000);
        actionsKeyword.getElement(Forms).click();  
        Thread.sleep(2000);
    }
    
    // Page Validation
}
