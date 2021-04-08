package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataProviders.InputFormsDataProvider;
import pageUIElements.CheckBoxDemoUI;
import pageUIElements.RadioButtonsDemoUI;
import pages.CheckBoxDemo;
import pages.HomePage;
import pages.InputFormSubmitDemo;
import pages.RadioButtonsDemo;
import pages.SelectDropdownListDemo;
import pages.SingleFormDemo;

@Guice
public class TestInputFormsDemo extends BaseTest {
	WebDriver webDriver;
	HomePage homePage;
	SingleFormDemo objSingleForm;
	CheckBoxDemo objCheckBoxDemo;
	RadioButtonsDemo objRadioButtonsDemo;
	SelectDropdownListDemo objSelectDropdownListDemo;
	InputFormSubmitDemo objInputFormSubmitDemo;

	@Parameters("browser")
	@BeforeClass
	public void start(String browser) {
		webDriver = setup(browser);
		homePage = new HomePage(webDriver);
		homePage.closePopUp();
	}

	@Test(priority = 0, dataProvider = "inputForms", dataProviderClass = InputFormsDataProvider.class)
	public void testSingleForm(String inputMessage, String sum1, String sum2) {

		objSingleForm = new SingleFormDemo(webDriver);
		objSingleForm.clickInputForms();
		objSingleForm.clickSingleFormDemo();

		// Check input textbox
		objSingleForm.setInputMessage(inputMessage);
		objSingleForm.clickShowMessage();
		Assert.assertEquals(objSingleForm.getSpanMessage(), SingleFormDemo.expectedInputMessage);

		// check sum textBox
		float expectedSum = Float.parseFloat(sum1) + Float.parseFloat(sum2);
		objSingleForm.setInputSum1(sum1);
		objSingleForm.setInputSum2(sum2);
		objSingleForm.clickGetTotal();
		float actualSum = Float.parseFloat(objSingleForm.getSpanSum());
		Assert.assertEquals(String.valueOf(actualSum), String.valueOf(expectedSum));
	}

	@Test(priority = 1)
	public void testCheckBox() {
		objCheckBoxDemo = new CheckBoxDemo(webDriver);
		objCheckBoxDemo.clickInputForms();
		objCheckBoxDemo.clickCheckBoxDemo();		
		
		
		  /*try { 
			  Thread.sleep(2000); 
		  } catch (InterruptedException e) { 
			  e.printStackTrace(); 			  
		  }*/
		 
		
		objCheckBoxDemo.clickSingleCheckBox();
		Assert.assertEquals(objCheckBoxDemo.getTextSingleCheckbox(), CheckBoxDemoUI.expectedTextSingleBox);
		
		objCheckBoxDemo.clickBtnCheckAll();
		Assert.assertEquals(objCheckBoxDemo.getTextBtnCheckAll(), CheckBoxDemoUI.expectedBtnCheckAll);
	}

	@Test(priority = 2)
	public void testRadioButtons() {

		objRadioButtonsDemo = new RadioButtonsDemo(webDriver);
		objCheckBoxDemo.clickInputForms();
		objRadioButtonsDemo.clickRadioButtonsDemo();

		objRadioButtonsDemo.clickMaleRadioButton();
		objRadioButtonsDemo.clickBtnCheck();
		Assert.assertEquals(objRadioButtonsDemo.getTextRadioButton(), RadioButtonsDemoUI.expectedTextMaleRadioButton);

		objRadioButtonsDemo.clickFemaleRadioButton();
		objRadioButtonsDemo.clickBtnCheck();
		Assert.assertEquals(objRadioButtonsDemo.getTextRadioButton(), RadioButtonsDemoUI.expectedTextFeMaleRadioButton);

		// Group Radio Buttons
		objRadioButtonsDemo.clickMaleGroupRadioButton();
		objRadioButtonsDemo.clickAgeGroup2();
		// Assert.assertEquals(objRadioButtonsDemo.getTextGroupRadioButton(),
		// RadioButtonsDemo.expectedTextMaleGroupRadioButton);
	}

	/*@Test(priority = 3, dataProvider = "inputForms", dataProviderClass = InputFormsDataProvider.class)
	public void testInputFormSubmitDemo(String firstName, String lastName, String email, String phone, String address,
			String city, String state, String zipcode, String website, String textarea) {
		objInputFormSubmitDemo = new InputFormSubmitDemo(webDriver);
		objInputFormSubmitDemo.clickInputForms();
		objInputFormSubmitDemo.clickInputFormSubmit();

		objInputFormSubmitDemo.setTextFirstName(firstName);
		objInputFormSubmitDemo.setTextLastName(lastName);
		objInputFormSubmitDemo.setTextEmail(email);
		objInputFormSubmitDemo.setTextPhone(phone);
		objInputFormSubmitDemo.setTextAddress(address);
		objInputFormSubmitDemo.setTextCity(city);
		objInputFormSubmitDemo.clickDropListState();
		objInputFormSubmitDemo.clickItemState(state);
		objInputFormSubmitDemo.setTextZipCode(zipcode);
		objInputFormSubmitDemo.setTextWebsite(website);
		objInputFormSubmitDemo.clickHostingYesOption();
		objInputFormSubmitDemo.setTextAreaComment(textarea);

		objInputFormSubmitDemo.clickBtnSend();
	}

	@Test(priority = 4, dataProvider = "inputForms", dataProviderClass = InputFormsDataProvider.class)
	public void testSelectDropdownListDemo(String day, String state) {
		// TODO Auto-generated method stub
		objSelectDropdownListDemo = new SelectDropdownListDemo(webDriver);
		objSelectDropdownListDemo.clickInputForms();
		objSelectDropdownListDemo.clickSelectDropdownList();

		// day
		objSelectDropdownListDemo.clickSelectList();
		objSelectDropdownListDemo.setDayItem(day);
		Assert.assertEquals(objSelectDropdownListDemo.getTextDayItem(),
				objSelectDropdownListDemo.getExpectedDayItem(day));

		// State
		objSelectDropdownListDemo.setStateItem(state);
		objSelectDropdownListDemo.clickBtnFirstSelected();
		Assert.assertEquals(objSelectDropdownListDemo.getTextStateItem(),
				objSelectDropdownListDemo.getExpectedStateName(state));
	}*/

	@AfterClass
	public void afterClass() {
		cleanup();
	}
}
