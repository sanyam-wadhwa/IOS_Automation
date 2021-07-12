package com.poc.test;

import java.util.Properties;

import org.testng.annotations.Test;
import POC_Pages.handleAlertPages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


public class handleAlertTests extends BaseTest {
	
	

	private AppiumDriver<?> driver;
	
	public static handleAlertPages alert;
	
	public static Properties prop;
	
	
	

	
	@Test
	public void AlertButton() {
		handleAlertPages alertbtn = new handleAlertPages(driver);
		logger.info(prop.getProperty("Alert"));
		alertbtn.clickAlertButton();
	
	}
}
	



