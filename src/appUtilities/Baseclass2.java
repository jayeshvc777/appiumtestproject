package appUtilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass2 {
	public static AndroidDriver<AndroidElement> driver = null;
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {



		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		capabilities.setCapability("appPackage", "com.atrangistore.app");
		
		capabilities.setCapability("appActivity", "com.atrangistore.app.MainActivity");
			
		capabilities.setCapability("autoAcceptAlerts", true);
		
		capabilities.setCapability("noReset","true");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

}
