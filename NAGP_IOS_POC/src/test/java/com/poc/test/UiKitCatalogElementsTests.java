package com.poc.test;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import POC_Pages.UiKitcatalogElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UiKitCatalogElementsTests extends BaseTest {
	
	public static AppiumDriver<MobileElement> driver;
	
	public static Properties prop;
	
	Logger logger ;
	
	@Test
	public void clickingOnButtons() {
		UiKitcatalogElements elements = new UiKitcatalogElements(driver);
		logger.info(prop.getProperty("ButtonandImageViewer"));
		elements.clickonButtons();
		elements.clickOnImageviewer();
		
	}

}
