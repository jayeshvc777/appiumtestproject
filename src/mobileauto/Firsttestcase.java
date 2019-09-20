package mobileauto;

import java.net.MalformedURLException;


import appUtilities.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Firsttestcase extends Baseclass{

	public static void main(String[] args) throws MalformedURLException {
			
		driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		driver.findElementById("android:id/edit").sendKeys("testing appium");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		
	}

}
