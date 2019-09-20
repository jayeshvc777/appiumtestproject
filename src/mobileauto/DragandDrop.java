package mobileauto;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import appUtilities.Baseclass;
import io.appium.java_client.TouchAction;

public class DragandDrop extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"API Demos\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
		
		TouchAction touch  = new TouchAction(driver);
		// you can skip writing longPressOptions().withElement if you are not using duration or position method after long press
		touch.longPress(element(source)).moveTo(element(destination)).release().perform();
		
	}

}
