package mobileauto;

import java.net.MalformedURLException;

import appUtilities.Baseclass;

public class Scrollclass extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"API Demos\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		// To scroll upto desired element use this android code in AndroidUIAutomator Locator = new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(description(\"sabka-adhaar-link-_0010_W_Black_fci8zz\"))");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\\\"WebView\\\"))");
		
		

	}

}
