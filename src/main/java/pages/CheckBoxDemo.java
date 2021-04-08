package pages;

import org.openqa.selenium.WebDriver;

import pageUIElements.CheckBoxDemoUI;

public class CheckBoxDemo extends AbstractInputForms{
	WebDriver webDriver;
	
	public CheckBoxDemo(WebDriver webDriver) {
		super(webDriver);
	}	
	
	public void clickCheckBoxDemo() {
		clickElement(CheckBoxDemoUI.checkBoxDemo);
	}
	
	public void clickSingleCheckBox() {
		clickElementByCSS(CheckBoxDemoUI.singleCheckbox);
	}
	
	public String getTextSingleCheckbox() {
		return getTextByCSS(CheckBoxDemoUI.textSingleCheckbox);
	}
	
	public void clickOptionCheckbox(String i) {
		String optionCheckbox = "//label[text() = \'Option" + i + "\']";		
		clickElement(optionCheckbox);
	}
	
	public void clickBtnCheckAll () {
		clickElementByCSS(CheckBoxDemoUI.btnCheckAll);
	}
	
	public String getTextBtnCheckAll () {
		return getTextByAttributeByCSS(CheckBoxDemoUI.btnCheckAll, "value");
		
	}
}
