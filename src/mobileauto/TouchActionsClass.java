package mobileauto;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import appUtilities.Baseclass;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
public class TouchActionsClass extends Baseclass  {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"API Demos\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		//Tap Action 
		// To use tap action function : import manually 2 packages 
		//1. import static io.appium.java_client.touch.TapOptions.tapOptions;
		//2. import static io.appium.java_client.touch.offset.ElementOption.element;
		
		TouchAction touch = new TouchAction(driver);
		WebElement tap = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		touch.tap(tapOptions().withElement(element(tap))).perform();
		
		// Long press
		// To use long press function import manually 3 packages 
		//1. import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
		//2. import static io.appium.java_client.touch.offset.ElementOption.element;
		//3. import static java.time.Duration.ofSeconds;
		
		WebElement tap1 = driver.findElementByAndroidUIAutomator("text(\"Dog Names\")");
		touch.longPress(longPressOptions().withElement(element(tap1)).withDuration(ofSeconds(2))).release().perform();
	}

}
