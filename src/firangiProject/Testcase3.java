package firangiProject;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appUtilities.Baseclass2;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Testcase3 extends Baseclass2 {

	public static void main(String[] args) throws MalformedURLException {
		driver = capabilities();
		/*
		 * -> Launch the App
		 * -> Click on Menu Option to open menu
		 * -> Click on Register option
		 * -> Enter all the details  
		 * -> Click on Register
		 */
		WebDriverWait wait = new WebDriverWait(driver, 20);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='JATIN SARNA OFFICIAL']")));
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(description(\"sabka-adhaar-link-_0010_W_Black_fci8zz\"))");
		
		driver.findElementByAndroidUIAutomator("description(\"sabka-adhaar-link-_0010_W_Black_fci8zz\")").click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Size :']")));
		
		driver.findElementByXPath("//*[@content-desc='Size :']").click();
		
		driver.findElementByAndroidUIAutomator("description(\"- ₹499.00  \")").click();
		
		driver.findElementByAndroidUIAutomator("description(\"OK \")").click();
		
		TouchAction touch = new TouchAction(driver);
		touch.longPress(PointOption.point(100,1000)).moveTo(PointOption.point(100,10)).release().perform();
		
		//driver.findElementByAndroidUIAutomator("description(\"ADD TO CART \")").click();
		driver.findElementByXPath("//android.webkit.WebView.View[3]/android.widget.Button").click();
	}

}
