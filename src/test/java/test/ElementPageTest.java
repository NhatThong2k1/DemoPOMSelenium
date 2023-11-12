package test;

 
import org.testng.annotations.Test;

import core.BaseTest;
 
import pages.ElementsPage;
 
import pages.LoginPage;

public class ElementPageTest extends BaseTest {

 
	

	@Test
	public void testWithpageObjectModel() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver, action);
		loginPage.toElementPage();

		ElementsPage elementPage = new ElementsPage(driver, action);
		//elementPage.testTextBox();
		elementPage.testUploadFile();
		System.out.println("Passsss");
	}
}
