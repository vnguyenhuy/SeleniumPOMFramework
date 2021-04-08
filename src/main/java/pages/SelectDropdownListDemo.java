package pages;

import org.openqa.selenium.WebDriver;

import pageUIElements.SelectDropdownListDemoUI;

public class SelectDropdownListDemo extends AbstractInputForms {
	WebDriver webDriver;	
	
	public SelectDropdownListDemo(WebDriver webDriver) {
		super(webDriver);	
	}
	
	public void clickSelectDropdownList() {
		clickElement(SelectDropdownListDemoUI.selectDropdownList);		
	}
	
	public void clickSelectList() {
		clickElement(SelectDropdownListDemoUI.selectList);		
	}
	
	public void setDayItem(String day) {
		String xpath = "//select[@id='select-demo']//child::option[@value='" + day + "']";
		clickElement(xpath);
	}
	
	public void setStateItem(String state) {
		String xpath =  "//select[@id='multi-select']//child::option[@value='" + state + "']";
		clickElement(xpath);
	}
	
	public void clickBtnFirstSelected() {
		clickElement(SelectDropdownListDemoUI.btnFirstSelected);		
	}
	
	public String getTextDayItem() {
		return getText(SelectDropdownListDemoUI.textDayItem);		
	}
	
	public String getTextStateItem() {
		return getText(SelectDropdownListDemoUI.textStateItem);
	}
	
	public String getExpectedStateName (String state) {
		String result = "First selected option is : " + state;
		return result;
	}
	
	public String getExpectedDayItem (String dayItem) {
		String result = "Day selected :- " + dayItem;
		return result;
	}
}
