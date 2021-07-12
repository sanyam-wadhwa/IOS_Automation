package POC_Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class handleAlertPages {

	
	
//	public static AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;
    
    public handleAlertPages( AppiumDriver<?> driver) {
	        PageFactory.initElements((new AppiumFieldDecorator(driver)), this);
	    }
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Views']")
	public MobileElement alertbtn;
	
	//XCUIElementTypeApplication[@name="UIKitCatalog"]
	
	public void clickAlertButton() {
		alertbtn.click();	
		
		
	}
	
}
