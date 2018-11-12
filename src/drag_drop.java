import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class drag_drop extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement( By.id("Views")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"));");
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction t = new TouchAction(driver);
		WebElement source = driver.findElement( By.id("io.appium.android.apis:id/drag_dot_1") );
		WebElement destination = driver.findElement( By.id("io.appium.android.apis:id/drag_dot_2") );

		t.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(destination)).release().perform();
		//t.longPress(element(source)).moveTo(element(destination)).release().perform();
		//if you don't need to specify duration
	}

}
