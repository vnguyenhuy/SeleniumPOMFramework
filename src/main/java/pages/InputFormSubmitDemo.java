package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageUIElements.InputFormSubmitDemoUI;

public class InputFormSubmitDemo extends AbstractInputForms{
	WebDriver webDriver;	
	
	public InputFormSubmitDemo(WebDriver webDriver) {
		super(webDriver);		
	}
	
	public void clickInputFormSubmit() {
		clickElement(InputFormSubmitDemoUI.inputFormSubmit);		
	}
	
	public void setTextFirstName(String firstName) {
		sendKeys(InputFormSubmitDemoUI.textFirstName, firstName);		
	}
	
	public void setTextLastName(String lastName) {
		sendKeys(InputFormSubmitDemoUI.textLastName, lastName);	
	}
	
	public void setTextEmail(String email) {
		sendKeys(InputFormSubmitDemoUI.textEmail, email);
	} 
	
	public void setTextPhone(String phone) {
		sendKeys(InputFormSubmitDemoUI.textPhone, phone);
	} 
	
	public void setTextAddress(String address) {
		sendKeys(InputFormSubmitDemoUI.textAddress, address);
	}
	
	public void setTextCity(String city) {
		sendKeys(InputFormSubmitDemoUI.textCity, city);
	}
	
	public void setTextZipCode(String zipCode) {
		sendKeys(InputFormSubmitDemoUI.textZipCode, zipCode);
	}
	
	public void setTextWebsite(String website) {
		sendKeys(InputFormSubmitDemoUI.textWebsite, website);
	}
	
	public void clickHostingYesOption() {
		clickElement(InputFormSubmitDemoUI.hostingYesOption);
	}
	
	public void clickHostingNoOption() {
		clickElement(InputFormSubmitDemoUI.hostingNoOption);
	}
	
	public void setTextAreaComment( String comment) {
		sendKeys(InputFormSubmitDemoUI.textAreaComment, comment);
	}
	
	public void clickDropListState () {
		clickElement(InputFormSubmitDemoUI.dropListState);		
	}
	
	public void clickItemState(String state) {
		String itemState = "//select[@name='state']//following::option[text() = '" + state + "']";
		clickElement(itemState);
	}
	
	By btnSend = By.xpath("//button[contains(text(), 'Send')]");
	
	public void clickBtnSend() {
		clickElement(InputFormSubmitDemoUI.btnSend);		
	}
}
