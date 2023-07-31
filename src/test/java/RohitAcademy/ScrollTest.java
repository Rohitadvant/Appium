package RohitAcademy;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollTest extends BaseTest{
	@Test
	public void scrollTest() {
	getElementByAccessibilityID("Views").click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
}
}
