package com.poc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.poc.utils.ExtentReportClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest extends ExtentReportClass{

	AppiumDriver<MobileElement> driver ;
	public static Properties prop;
	
	public final static Logger logger = Logger.getLogger(BaseTest.class);
	
	
	// Extent Report
		public static ExtentReports extentReport = null;
		public static ExtentTest extentTest = null;
		
		
		public BaseTest() {
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("./config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
	@BeforeTest
	public void setup()  {
		try {


		
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
//		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        //capability.setCapability("App", "/Users/sanyamwadhwa/Library/Developer/Xcode/DerivedData/UIKitCatalog-ewuvachlsyekljglmjzppmwquwwm/Build/Products/Debug-iphonesimulator");
		capability.setCapability(MobileCapabilityType.APP, "/Users/sanyamwadhwa/Library/Developer/Xcode/DerivedData/UIKitCatalog-ewuvachlsyekljglmjzppmwquwwm/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
		//capability.setCapability(MobileCapabilityType.APP, "../APP File/UIKitCatalog.app");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		
		driver = new IOSDriver<MobileElement>(url, capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
	} catch(Exception exp){
		System.out.println("Cause is : "+exp.getCause());
		System.out.println("Message is : "+ exp.getMessage());
		exp.printStackTrace();		
	}
	}
	
	@Test
	public void sampleTest() {
		
		System.out.println("I am in sample test");
		
	}
	
	
	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();
		
	}
	
}
