package com.poc.test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import POC_Pages.handleAlertPages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


public class handleAlertTests extends BaseTest {
	
	

	private AppiumDriver<?> driver;
	
	public static handleAlertPages alert;
	
	public static Properties prop;
	
	
	public void AlertButton() {
		handleAlertPages alertbtn = new handleAlertPages(driver);
		logger.info(prop.getProperty("Alert"));
		alertbtn.clickAlertButton();
	
	}
	
	@Test
	public void AlertClick() {
		logger.info(prop.getProperty("Alert1"));
		MobileElement AlertViews =  (MobileElement) driver.findElement(By.xpath("Alert1"));
		AlertViews.click();
		logger.info("");
    	MobileElement button = (MobileElement) driver.findElement(By.xpath("Button"));
		button.click();
		
		
	}
}
	



