package pages;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BasePage;

public class ElementsPage extends BasePage {

	public ElementsPage(WebDriver driver, Actions action) {
		super(driver, action);
	}
	public WebDriverWait wait;
	
	private By textBox = By.cssSelector("[id='item-0']");
	private By checkBox = By.cssSelector("[id='item-1']");
	private By radioBtn = By.cssSelector("[id='item-2']");
	private By webTables = By.cssSelector("[id='item-3']");
	private By btn = By.cssSelector("[id='item-4']");
	private By link = By.cssSelector("[id='item-5']");
	private By image = By.cssSelector("[id='item-6']");
	private By upload = By.xpath("//li/span[text()='Upload and Download']");
	private By dynamicProperties = By.cssSelector("[id='item-8']");
	 
	
 

	// Element Text box
	
	private By inputFullName = By.cssSelector("input[id='userName']");
	private By inputEmail = By.cssSelector("input[id='userEmail']");
	private By inputCurrentAddress = By.cssSelector("textarea[id='currentAddress']");
	private By inputPermanentAddress = By.cssSelector("textarea[id='permanentAddress']");
	private By btnSubmit = By.cssSelector("button[id='submit']");
	
 
	// Element Check box
	private By btnCheckBox = By.cssSelector("svg[class='rct-icon rct-icon-uncheck']");
 

	// Element Radio btn
	
	private By yesRadio = By.cssSelector("label[for='yesRadio']");
	private By impressiveRadio = By.cssSelector("input[id='impressiveRadio']");
	private By noRadio = By.cssSelector("input[id='noRadio']");
 
	// Element Table
	private By addBtn = By.cssSelector("button[id='addNewRecordButton']");
	private By editBtn = By.cssSelector("span[id = 'edit-record-1']");
	private By deleteBtn = By.cssSelector("span[id = 'delete-record-1']");
	
	private By inputFirstName = By.cssSelector("input[id = 'firstName']");
	private By inputLastName = By.cssSelector("input[id = 'lastName']");
	private By inputEmai1 = By.cssSelector("input[id = 'userEmail']");
	private By inputAge = By.cssSelector("input[id='age']");
	private By inputSalary = By.cssSelector("input[id='salary']");
	private By inputDepartment = By.cssSelector("input[id='department']");
	private By btnAdd = By.cssSelector("button[id='submit']");
 

	// Element Button
	
	private By doubleClickBtn = By.cssSelector("button[id='doubleClickBtn']");
	private By rightClickBtn = By.cssSelector("button[id='rightClickBtn']");
	private By dynamicClickBtn = By.xpath("//button[text()='Click Me']");
	private By doubleClkMess  = By.cssSelector("p[id='doubleClickMessage']");
	private By rightClkMess = By.cssSelector("p[id='rightClickMessage']");
	private By clickMess = By.cssSelector("p[id='dynamicClickMessage']");
	
	 
 
	
	
	
	// Element Link
	
	private By simpleLink = By.cssSelector("a[id='simpleLink']");
	private By dynamicLink = By.cssSelector("a[id='dynamicLink']");
	
	// Element Upload
	
	private By btnUpload = By.cssSelector("input[id='uploadFile']");
	

	// Page Actions
	public void testTextBox() {
		actionsKeyword.getElement(textBox).click();
		actionsKeyword.getElement(inputFullName).sendKeys("Nguyen Nhat Thong");
		actionsKeyword.getElement(inputEmail).sendKeys("thong0307@gmail.com");
		actionsKeyword.getElement(inputCurrentAddress).sendKeys("Thu Duc");
		actionsKeyword.getElement(inputPermanentAddress).sendKeys("Binh Duong");
		actionsKeyword.getElement(btnSubmit).click();

	}

	public void testCheckBox() {
		actionsKeyword.getElement(checkBox).click();

		
		actionsKeyword.getElement(btnCheckBox).click();

		boolean isCheckBoxSelected = actionsKeyword.getElement(btnCheckBox).isSelected();
		assertEquals(isCheckBoxSelected, true);

	}

	public void testRadioBtn() {
		actionsKeyword.getElement(radioBtn).click();

		// Yes Radio
		actionsKeyword.getElement(yesRadio).click();
		boolean isYesRadioSelected = actionsKeyword.getElement(yesRadio).isSelected();

		if (isYesRadioSelected) {
			System.out.println("Yes Radio is selected");
			// Impressive Radio
			actionsKeyword.getElement(impressiveRadio).click();
			boolean isImpressiveRadioSelected = actionsKeyword.getElement(impressiveRadio)
					.isSelected();
			if (isImpressiveRadioSelected) {
				System.out.println("Impressive Radio is selected");
				// No Radio
				actionsKeyword.getElement(noRadio).click();
				boolean isNoRadioSelected = actionsKeyword.getElement(noRadio).isSelected();
				assertEquals(isNoRadioSelected, true);
			}
		}

	}

	public void testTableAdd() {
		actionsKeyword.getElement(webTables).click();
		
		actionsKeyword.getElement(addBtn).click();
		actionsKeyword.getElement(inputFirstName).sendKeys("John");
		actionsKeyword.getElement(inputLastName).sendKeys("Wick");
		actionsKeyword.getElement(inputEmai1).sendKeys("johnnn@gmail.com");
		actionsKeyword.getElement(inputAge).sendKeys("99");
		actionsKeyword.getElement(inputSalary).sendKeys("1");
		actionsKeyword.getElement(inputDepartment).sendKeys("BD");
		actionsKeyword.getElement(btnAdd).click();
	}

	// Test Action Double Click
	public void testDoubleClick() {

		actionsKeyword.getElement(btn).click();
		WebElement doubleClick = actionsKeyword.getElement(doubleClickBtn);
		action.doubleClick(doubleClick).build().perform();
		 
		WebElement doubleClickMess = actionsKeyword.getElement(doubleClkMess);
		System.out.println(doubleClickMess.getText());
		
		 
		
//		boolean checkDoubleClk = doubleClickMess.getText().equals("You have done a double click");
//		assertEquals(checkDoubleClk, true);
	}

	// Test Action Right Click
	public void testRightClick() {

		actionsKeyword.getElement(btn).click();
		WebElement rightClick = actionsKeyword.getElement(rightClickBtn);
		action.contextClick(rightClick).build().perform();
		WebElement rightClickMess = actionsKeyword.getElement(rightClkMess);
		System.out.println(rightClickMess.getText());
		
		boolean checkRightClk = rightClickMess.getText().equals("You have done a right click");
		assertEquals(checkRightClk, true);
	}

	// Test Action Dynamic Click
	public void testDynamicClick() {

		actionsKeyword.getElement(btn).click();
//		WebElement dynamicClickBtn = actionsKeyword.getElement(clickBtn);
//		action.doubleClick(dynamicClickBtn);
		//action.doubleClick(null)
		actionsKeyword.click(dynamicClickBtn);
		WebElement dynamicClickMess = actionsKeyword.getElement(clickMess);
		System.out.println(dynamicClickMess.getText());
		boolean checkDynamicClk = dynamicClickMess.getText().equals("You have done a dynamic click");
		assertEquals(checkDynamicClk, true);
	}
	
	public void testUploadFile() throws InterruptedException {
		
//		//actionsKeyword.getElement(upload).click();
//		action.scrollToElement(actionsKeyword.getElement(upload)).build().perform();
//		actionsKeyword.getElement(upload).click();
//		
		 
//		actionsKeyword.waitForElementToClickable(upload);
//		action.moveToElement(actionsKeyword.getElement(upload)).build().perform();
//		actionsKeyword.getElement(upload).click();
		
//		action.scrollToElement(actionsKeyword.getElement(upload)).build().perform();
//		actionsKeyword.getElement(upload).click();
		
		
		
		WebElement m=driver.findElement(upload);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", m);
		
		 Path path = Paths.get("src/picture/Untitled.png");
		    File imagePath = new File(path.toUri());
		  //we want to import selenium-snapshot file.
		    actionsKeyword.getElement(btnUpload).sendKeys(imagePath.toString());

		    
		    Thread.sleep(4000);
		    
	}

	
	// test Element Links
	public void testElementLink() {
		actionsKeyword.getElement(link).click();
		
		actionsKeyword.getElement(simpleLink).click();
		
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();

		//Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;

		//Click the link which opens in a new window
		driver.findElement(By.linkText("new window")).click();

		//Wait for the new window or tab
	//	wait.until(numberOfWindowsToBe(2));

		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
 
	}
}
