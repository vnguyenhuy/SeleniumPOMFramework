package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.GlobalConstant;

public abstract class AbstractPageObject {	
	
	protected WebDriver webDriver;
	protected WebDriverWait wait;
	
	public AbstractPageObject(WebDriver webDriver) {
		this.webDriver = webDriver;		
		wait = new WebDriverWait(webDriver, GlobalConstant.EXPLICIT_WAIT);
	}
	
	protected void waitExplicitToBeClick(String xpath) {
		waitExplicitToBeClick(By.xpath(xpath));
	}
	
	protected void waitExplicitToBeClick(By by) {	
		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			System.out.println("continue....");
		}		
	}
		
	private WebElement findElement(By by) {
		return webDriver.findElement(by);
	}
	
	private WebElement findElement(String xpath) {
		return findElement(By.xpath(xpath));
	}
	
	private WebElement findElementByCSS(String css) {
		return findElement(By.cssSelector(css));
	} 
	
	protected void clickElement(String xpath) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		findElement(xpath).click();
	}
	
	protected void clickElementByCSS(String css) {
		findElementByCSS(css).click();
	}
	
	protected void sendKeys(String xpath, String keys) {
		findElement(By.xpath(xpath)).sendKeys(keys);
	}
	
	protected void sendKeysByCSS(String css, String keys) {
		findElementByCSS(css).sendKeys(keys);
	}
	
	protected String getText(String xpath) {
		return findElement(By.xpath(xpath)).getText();
	}	
	
	protected String getTextByCSS(String css) {
		return findElementByCSS(css).getText();
	}
	
	protected String getTextByAttribute(String xpath, String value) {
		return findElement(By.xpath(xpath)).getAttribute(value);
	}
	
	protected String getTextByAttributeByCSS(String css, String value) {
		return findElementByCSS(css).getAttribute(value);
	}	
}
