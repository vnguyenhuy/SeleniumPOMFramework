package pages;

import org.openqa.selenium.WebDriver;

import pageUIElements.SingleFormDemoUI;

public class SingleFormDemo extends AbstractInputForms{
	
	public static final String expectedInputMessage = "chao Milk!!!";
	public static final String expectedSum = "35";
	
	WebDriver webDriver;

	public SingleFormDemo(WebDriver webDriver) {
		super(webDriver);
	}

	public void clickSingleFormDemo() {
		clickElement(SingleFormDemoUI.singleFormDemo);
	}

	public void setInputMessage(String inputMessage) {
		sendKeys(SingleFormDemoUI.inputMessage, inputMessage);
	}

	public void setInputSum1(String inputSum1) {
		sendKeys(SingleFormDemoUI.inputSum1, inputSum1);		
	}

	public void setInputSum2(String inputSum2) {
		sendKeys(SingleFormDemoUI.inputSum2, inputSum2);
	}

	public void clickShowMessage() {
		clickElement(SingleFormDemoUI.btnShowMessage);		
	}

	public void clickGetTotal() {
		clickElement(SingleFormDemoUI.btnGetTotal);		
	}

	public void showMessage(String inputMessage) {
		sendKeys(SingleFormDemoUI.inputMessage, inputMessage);		
		clickShowMessage();
	}

	public String getSpanMessage() {
		return getText(SingleFormDemoUI.spanMessage);		
	}

	public String getSpanSum() {
		return getText(SingleFormDemoUI.spanSum);		
	}

	public void showGetTotal(String inputSum1, String inputSum2) {
		setInputSum1(inputSum1);
		setInputSum2(inputSum2);
		clickGetTotal();
	}
}
