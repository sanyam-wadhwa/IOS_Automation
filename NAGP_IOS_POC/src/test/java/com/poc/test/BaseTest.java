package com.poc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest{

	public static AppiumDriver<MobileElement> driver ;
    public static Properties prop = new Properties();
	public static File file = new File("./Resources/configuration.properties");
	public final static Logger logger = Logger.getLogger(BaseTest.class);


//	public BaseTest(AppiumDriver<MobileElement> driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//		//		wait = new WebDriverWait(driver, 15);
//	}
	
	public BaseTest(IOSDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	



	// Extent Report
	public static ExtentReports extentReport = null;
	public static ExtentTest extentTest = null;
	public ExtentReports extent;


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
	public void setExtent(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "sanyamwadhwa-1.local");
		extent.addSystemInfo("User Name", "sanyamwadhwa");


	}

	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	@BeforeTest
	public void setup()  {
		try {



			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("PLATFORM_NAME"));
			capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("PLATFORM_VERSION"));
			capability.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("DEVICE_NAME"));
			capability.setCapability(MobileCapabilityType.APP, prop.getProperty("APP"));

			URL url = new URL("http://127.0.0.1:4723/wd/hub");


			driver = new IOSDriver<MobileElement>(url, capability);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		} catch(Exception exp){
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+ exp.getMessage());
			exp.printStackTrace();		
		}
	}

	//	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Views']")
	//	private MobileElement alertbtn;

	@Test
	public void sampleTest() {

		System.out.println(driver.getPageSource());

		//		alertbtn.click();

		//		MobileElement button = driver.findElement(By.xpath("//XCUIElementTypeButton[@name='chevron']"));
		//		button.click();


	}


	private MobileElement ClickAction(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}


	@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}

	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();

	}

}
