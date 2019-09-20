package firangiProject;

import java.net.MalformedURLException;
import org.openqa.selenium.Point;
import appUtilities.Baseclass2;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class Testcase1 extends Baseclass2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		/*
		 * -> Launch the App
		 * -> Swipe left to right to open menu
		 * -> Swipe right to left to close menu
		 */
	
		driver = capabilities();

		//Swipe screen from left to right , point will be a element on left side
		Point point = driver.findElementByXPath("//*[@content-desc='Jatin_post_1']").getLocation();
		TouchAction touch = new TouchAction(driver);
		touch.longPress(PointOption.point(point.x+20,point.y)).moveTo(PointOption.point(point.x+1000,point.y)).release().perform();
		
		Thread.sleep(1000);
		
		//Swipe screen from right to left with only coordinates		
		touch.longPress(PointOption.point(1000,100)).moveTo(PointOption.point(10,100)).release().perform();

	}

}
