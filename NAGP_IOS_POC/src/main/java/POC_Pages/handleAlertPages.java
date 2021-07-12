package POC_Pages;

import java.util.List;

import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class handleAlertPages {

	
	
//	public static AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;
    
    private AppiumDriver<?> driver;
    
   
	
	 public handleAlertPages( AppiumDriver<?> driver) {
	        this.driver = driver;
	        PageFactory.initElements((new AppiumFieldDecorator(driver)), this);
	    }
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Views']")
	public MobileElement alertbtn;
	
	//XCUIElementTypeApplication[@name="UIKitCatalog"]
	
	public void clickAlertButton() {
		alertbtn.click();	
		
		
	}
	
}
