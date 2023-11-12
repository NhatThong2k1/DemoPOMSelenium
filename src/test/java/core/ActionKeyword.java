package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

 
public class ActionKeyword {

	public WebDriver driver;
	public WebDriverWait wait;

	private int TIMEOUT = 300;
	private int POLLING = 2;
	
	public ActionKeyword(WebDriver driver) {
		super();
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT), Duration.ofSeconds(POLLING));
} 
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public WebElement getElement(By element) {
		waitForElementToClickable(element);
		return driver.findElement(element) ;
	}
	
	
	public WebElement waitForElementToAppear(By element) {

		return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public WebElement waitForElementToClickable(By element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void click(By element) {
		waitForElementToClickable(element).click();
	}
	
	public String getText(By element) {
		String textOfElement = waitForElementToAppear(element).getText();
		return textOfElement;
	}
	
	public void selectLanguage(By element , int index  ) {
		waitForElementToClickable(element);
		driver.findElement(element).click();
	}
	
	public void setName(By element, String name) {
		waitForElementToClickable(element);
		driver.findElement(element).sendKeys(name);
	}
	
	public String actualResultAndBackHome(By element) {
		waitForElementToAppear(element);
		String actualScore = driver.findElement(element).getText();
		// return score after answer the question
		return actualScore;
	}
}