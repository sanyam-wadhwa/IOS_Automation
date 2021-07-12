package POC_Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class UiKitcatalogElements {
	
	public static AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;
    
    
    public UiKitcatalogElements(AppiumDriver<MobileElement> driver) {
    	Super();
    	UiKitcatalogElements.driver = (AppiumDriver<MobileElement>) driver;
        PageFactory.initElements((driver), this);
    }


	private void Super() {
		// TODO Auto-generated method stub
		
	}
    
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Buttons']")
	public MobileElement Buttons;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Image View']")
	public MobileElement imageView ;
	
	public void clickonButtons() {
		Buttons.click();
	}
    
	public void clickOnImageviewer() {
		imageView.click();
	}

    

}
