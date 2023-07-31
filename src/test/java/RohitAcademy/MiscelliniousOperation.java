package RohitAcademy;

import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscelliniousOperation extends BaseTest{
	@Test
	public void landscapeTest() throws InterruptedException {
	getElementByAccessibilityID("Preference").click();
    getElementByAccessibilityID("3. Preference dependencies").click();
    getElementById("android:id/checkbox").click();
    DeviceRotation landscape= new DeviceRotation(0,0,90);
    driver.rotate(landscape);
    getElementByXpath("(//android.widget.RelativeLayout)[2]").click();
    Thread.sleep(2000);
    //Copy from clipboard
    driver.setClipboardText("Rohit Wifi");
    getElementById("android:id/edit").sendKeys(driver.getClipboardText()); 
    driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    getElementById("android:id/button1").click();
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
}
