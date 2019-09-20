package mobileauto;

import java.net.MalformedURLException;

import appUtilities.Baseclass;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class Drivermethodsclass extends Baseclass{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		driver = capabilities();
		System.out.println(driver.currentActivity());
		System.out.println(driver.getCurrentPackage());
		System.out.println(driver.getDeviceTime());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.isKeyboardShown());
		driver.findElementByAndroidUIAutomator("text(\"API Demos\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		// Key events for new version of Appium
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
		
		

	}

}
