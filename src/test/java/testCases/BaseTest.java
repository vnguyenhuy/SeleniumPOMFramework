package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.GlobalConstant;

public class BaseTest {
	public WebDriver webDriver;	
	
	public WebDriver setup(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", GlobalConstant.LOCAL_PATH + GlobalConstant.WEB_DRIVER_FIREFOX_FOLDER);	
			webDriver = new FirefoxDriver();
		}		
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", GlobalConstant.LOCAL_PATH + GlobalConstant.WEB_DRIVER_CHROME_FOLDER);	
			webDriver = new ChromeDriver();
		}		
		
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(GlobalConstant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		webDriver.get(GlobalConstant.TESTING_LINK);
		return webDriver;								
	}	
	
	public void cleanup() {
		webDriver.quit();
	}
}
