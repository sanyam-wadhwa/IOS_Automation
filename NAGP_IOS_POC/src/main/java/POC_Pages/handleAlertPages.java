package POC_Pages;

import java.util.List;

import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;

public class handleAlertPages {

	
	
	protected AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;
    
	
	
	public handleAlertPages(AppiumDriver<MobileElement> driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    wait = new WebDriverWait(driver, 15);
	  }
	
	String AlertButton = "Alert Views";
	
	
//	@FindBy(xpath = "//XCUIElementTypeApplication[@name='Alert Views']")
//	private MobileElement alertbtn;
//	
//	//XCUIElementTypeApplication[@name="UIKitCatalog"]
//	
//	public void clickAlertButton() {
//		alertbtn.click();
//		
//		
//	}
	
}
