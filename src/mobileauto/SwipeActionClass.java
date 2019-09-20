package mobileauto;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import appUtilities.Baseclass;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeActionClass extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"API Demos\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		// Drag and Drop : 
		// 1. Long press on source element for durration of 1 sec 
		// 2. Move to Destination element and Release 
		WebElement source = driver.findElementByXPath("//*[@content-desc='3']");
		WebElement destination = driver.findElementByXPath("//*[@content-desc='9']");
		TouchAction touch = new TouchAction(driver);
		touch.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(destination)).release().perform();
		
		
		
	}

}
