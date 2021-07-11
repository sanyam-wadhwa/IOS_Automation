package com.poc.test;

import org.testng.annotations.Test;
import POC_Pages.handleAlertPages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class handleAlertTests extends BaseTest {
	
	AppiumDriver<MobileElement> driver;
	
	handleAlertPages alert;
	
	
	//handleAlertPages alert = new handleAlertPages(driver);
	
	@Test
	public void AlertButton() {
		logger.info("Second method runs out");
		System.out.println("This is the second test case");
	}
	


}
