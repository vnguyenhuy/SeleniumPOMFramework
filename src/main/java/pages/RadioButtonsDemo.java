package pages;

import org.openqa.selenium.WebDriver;

import pageUIElements.RadioButtonsDemoUI;

public class RadioButtonsDemo extends AbstractInputForms{		
	
	WebDriver webDriver;
	
	public RadioButtonsDemo(WebDriver webDriver) {
		super(webDriver);		
	}
	public String getTextRadioButton() {
		return getText(RadioButtonsDemoUI.textRadioButton);		
	}
	
	public String getTextGroupRadioButton() {
		return getText(RadioButtonsDemoUI.textGroupRadioButton);
	}	
	
	public void clickRadioButtonsDemo() {
		clickElement(RadioButtonsDemoUI.radioButtonsDemo);
	}
	
	public void clickMaleRadioButton() {
		clickElement(RadioButtonsDemoUI.maleRadioButton);
	}
	
	public void clickFemaleRadioButton() {
		clickElement(RadioButtonsDemoUI.femaleRadioButton);		
	}

	public void clickBtnCheck() {
		clickElement(RadioButtonsDemoUI.btnCheck);		
	}

	public void clickMaleGroupRadioButton() {
		clickElement(RadioButtonsDemoUI.maleGroupRadioButton);		
	}

	public void clickFemaleGroupRadioButton() {
		clickElement(RadioButtonsDemoUI.femaleGroupRadioButton);		
	}

	public void clickAgeGroup1() {
		clickElement(RadioButtonsDemoUI.ageGroup1);		
	}

	public void clickAgeGroup2() {
		clickElement(RadioButtonsDemoUI.ageGroup2);
	}

	public void clickAgeGroup3() {
		clickElement(RadioButtonsDemoUI.ageGroup3);
	}
}