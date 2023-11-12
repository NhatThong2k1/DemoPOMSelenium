package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import core.BaseTest;
import data.ActionBlockData;
 
import pages.FormPage;
import pages.LoginPage;

public class FormPageTest extends BaseTest {

	@Test(dataProvider = "DataFromJsonFile", dataProviderClass = ActionBlockData.class)
	public void testFormPage(String firstName, String lastName, String email, String gender, String number,
			String dateOfBirth, String address, String subjects) throws AWTException, InterruptedException {

		LoginPage loginPage = new LoginPage(driver, action);
		loginPage.toFormPage();

		FormPage formPage = new FormPage(driver, action);
		formPage.openForm();
		formPage.sendInf(firstName, lastName, email, gender, number, dateOfBirth, address, subjects);

	}
}
