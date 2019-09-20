package mobileauto;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mob {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = null;

		File appDir = new File("src");

		File app = new File(appDir, "demo.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); // 192.168.8.101:5555

		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		capabilities.setCapability("autoAcceptAlerts", true);
		
		//capabilities.setCapability("noReset","true");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
