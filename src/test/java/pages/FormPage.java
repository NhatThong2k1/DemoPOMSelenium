package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import core.BasePage;

public class FormPage extends BasePage {

	public FormPage(WebDriver driver, Actions action) {
		super(driver, action);
		// TODO Auto-generated constructor stub
	}
	
	
	private By PracticeForm = By.xpath("//div/ul/li//span[text()='Practice Form']");
	
	private By InputFirstName = By.cssSelector("input[id='firstName']");
	private By InputLastName = By.cssSelector("input[id='lastName']");
	private By InputEmail = By.cssSelector( "input[id='userEmail']");
	private By InputNumber = By.cssSelector("input[id='userNumber']");
	private By InputSubjects = By.cssSelector("textarea[id='currentAddress']");
	private By InputAddress = By.cssSelector("textarea[id='currentAddress']");
	private By MaleGender = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label");
	private By FemaleGender = By.cssSelector("input[id='gender-radio-2']");
	private By OtherGender = By.cssSelector("input[id='gender-radio-3']");
	private By DateOfBirth = By.cssSelector( "input[id='dateOfBirthInput']");
	private By SubmitBtn = By.cssSelector( "button[id='submit']");
	private By LabelBirth = By.cssSelector("label[id='dateOfBirth-label']");
	private By AddFile = By.cssSelector("[id='uploadPicture']");
	
	
	
 
	String filePath = "C:\\Users\\Kythu\\Desktop\\AUT_JAVA\\bt_mau\\DemoSeleniumOnTap\\src\\picture\\Untitled.png";

	public void openForm() {
		//this.driver.findElement(By.xpath(xPathPracticeForm)).click();
		action.scrollToElement( actionsKeyword.getElement(PracticeForm)).build().perform();
		actionsKeyword.getElement(PracticeForm).click();
	}

	public void sendInf(String firstName, String lastName, String email, String gender, String number,
			String dateOfBirth, String address, String subjects) throws AWTException, InterruptedException {
		// set First Name
		 actionsKeyword.getElement(InputFirstName).sendKeys(firstName);
		// set Last Name
		 actionsKeyword.getElement(InputLastName).sendKeys(lastName);
		// set Email
		 actionsKeyword.getElement(InputEmail).sendKeys(email);

		// Set Male Gender
		if (gender.equals("Male")) {
			 actionsKeyword.getElement(MaleGender).click();
		} else if (gender.equals("Female")) {
			 actionsKeyword.getElement(FemaleGender).click();
		} else {
			 actionsKeyword.getElement(OtherGender).click();
		}

		// Set User Number
		 actionsKeyword.getElement(InputNumber).sendKeys(number);

		// Set date of Birth
		 actionsKeyword.getElement(DateOfBirth).sendKeys(dateOfBirth);
		System.out.println("Passs1");
		 actionsKeyword.getElement(LabelBirth).click();

		// Set Current Address

		 actionsKeyword.getElement(InputAddress).sendKeys(address);

		// Set Subjects
		 actionsKeyword.getElement(InputSubjects).sendKeys(subjects);

		System.out.println("Passs2");
		
		
		
		 Path path = Paths.get("src/picture/Untitled.png");
		    File imagePath = new File(path.toUri());
		  //we want to import selenium-snapshot file.
		    actionsKeyword.getElement(AddFile).sendKeys(imagePath.toString());

		    
		    Thread.sleep(4000);
		    
		    WebElement m=driver.findElement(SubmitBtn);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", m);
		    
		    
//		    action.scrollToElement( actionsKeyword.getElement(SubmitBtn)).build().perform();
//		    
//		    actionsKeyword.getElement(SubmitBtn).click();
		    
		    
	}

}
