import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;

public class swipe_demo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.findElement( By.id("Views")).click();
		driver.findElement( By.id("Date Widgets")).click();
		driver.findElement( By.id("2. Inline")).click();
		driver.findElement( By.id("3")).click();
		
		TouchAction t = new TouchAction(driver);
		WebElement first = driver.findElement( By.xpath("//*[@content-desc='15']") );
		WebElement second = driver.findElement( By.xpath("//*[@content-desc='45']") );

		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();

		
	}

}
