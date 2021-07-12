package com.poc.test;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import POC_Pages.UiKitcatalogElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UiKitCatalogElementsTests extends BaseTest {
	
	public static AppiumDriver<MobileElement> driver;
	
	public static Properties prop;
	
	Logger logger ;
	
	@Test
	public void Steppers() {
		logger.info(prop.getProperty("ButtonandImageViewer"));
		driver.findElement(By.xpath(prop.getProperty("Steppers")));
		
		
	}
	
	
	@Test
	public void PageControl() {
		logger.info(prop.getProperty("PageConroller"));
		MobileElement element = driver.findElement(By.xpath(prop.getProperty("PageControl")));
		Assert.assertEquals(prop.getProperty("Expectedresults"), element);
		
		
	}
	

}
