package com.poc.utils;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitElement {
	
	// To wait for some seconds explicitly
		public static void checkClickableExplicitly(WebDriver driver, WebElement locator, int timeout) {
			
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).
			until(ExpectedConditions.elementToBeClickable(locator));
			//locator.click();
		}

}
