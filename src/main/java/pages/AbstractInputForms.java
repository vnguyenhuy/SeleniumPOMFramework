package pages;

import org.openqa.selenium.WebDriver;

import pageUIElements.InputFormsUI;

public class AbstractInputForms extends AbstractPageObject{	
	
	public AbstractInputForms(WebDriver webDriver) {
		super(webDriver);		
	}
	
	public void clickInputForms() {
		clickElement(InputFormsUI.inputForms);
	}		
}
