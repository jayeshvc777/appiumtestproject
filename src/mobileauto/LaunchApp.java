package mobileauto;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchApp {
	public static AndroidDriver<AndroidElement> driver = null;
	public static void main(String[] args) throws MalformedURLException {
		// There are 2 methods to launch App
		
		// 1. To keep apk file in the project source folder and launch apk by passing absolute path of that apk
		
		/*
		File appDir = new File("src");

		File app = new File(appDir, "demo.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); // 192.168.8.101:5555

		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		 */
		
		// 2. if you don't have apk file and want to launch apk which is already installed 
		// you need to pass this 2 capabilities 
		
		 //   capabilities.setCapability("appPackage", "com.android.calculator2");
		//    capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		 
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		

		
		
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

}
