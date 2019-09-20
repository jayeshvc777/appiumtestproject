package mobileauto;

import java.net.MalformedURLException;

import org.testng.Assert;

import appUtilities.Baseclass;

public class AndroiduiAutomator extends Baseclass {
	
	public static void main(String[] args) throws MalformedURLException {
		driver = capabilities();
		// use of AndroidUIAutomator Locator 
		driver.findElementByAndroidUIAutomator("text(\"API Demos\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Content\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Resources\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Layout Reference\")").click();
		String actual = driver.findElementsByClassName("android.widget.TextView").get(1).getText();
		Assert.assertEquals(actual, "Default layout");
		System.out.println("Test successful");
		
	}

}
