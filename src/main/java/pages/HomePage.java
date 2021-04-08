package pages;

import org.openqa.selenium.WebDriver;

import pageUIElements.HomePageUI;

public class HomePage extends AbstractInputForms {
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	public void closePopUp() {
		waitExplicitToBeClick(HomePageUI.btnNoThanks);
		clickElement(HomePageUI.btnNoThanks);
	}
}
