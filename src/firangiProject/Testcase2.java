package firangiProject;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appUtilities.Baseclass2;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Testcase2 extends Baseclass2{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		/*
		 * -> Launch the App
		 * -> Swipe left to right to open menu
		 * -> Scroll down to rate app option
		 * -> Grab the title and display it in console 
		 * -> Click No, Thanks 
		 */
		
		
		driver = capabilities();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement ele = driver.findElementByXPath("//*[@content-desc='Jatin_post_1']");																																																																																			
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Jatin_post_1']")));
		
		TouchAction touch = new TouchAction(driver);
		touch.longPress(PointOption.point(10,100)).moveTo(PointOption.point(1000,100)).release().perform();
		Thread.sleep(2000);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(content-desc(\"Rate App\"))");
		
		touch.longPress(PointOption.point(100,1000)).moveTo(PointOption.point(100,10)).release().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Rate App']")));
		
		driver.findElementByXPath("//*[@content-desc='Rate App']").click();
		
		System.out.println(driver.findElementById("android:id/alertTitle").getText());
		
		driver.findElementById("android:id/button1").click();
				
	}

}
