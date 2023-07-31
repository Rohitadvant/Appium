package RohitAcademy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class AlertDemosTest extends BaseTest{
	@Test
	public void dragAndDropTest() throws InterruptedException {
	getElementByAccessibilityID("App").click();
    getElementByAccessibilityID("Alert Dialogs").click();  
	}
	@Test
	public void okCancelDialogWithMsg() throws InterruptedException {
		getElementByAccessibilityID("OK Cancel dialog with a message").click();
		Thread.sleep(3000);
		getElementById("android:id/button1").click();
		
	}
	@Test
	public void oKCancelDialogWithUltraLongMessage() throws InterruptedException {
		getElementByAccessibilityID("OK Cancel dialog with ultra long message").click();
		Thread.sleep(3000);
WebElement message=getElementById("android:id/message");
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				  "elementId", ((RemoteWebElement) message).getId(),
				  "left", 100, "top", 100, "width", 200, "height", 200,
				  "direction", "down",
				  "percent", 6.0));
		Thread.sleep(3000);
		getElementById("android:id/button1").click();
	}
	@Test
	public void listDialog() throws InterruptedException {
		getElementByAccessibilityID("List dialog").click();
		List<WebElement> lst=driver.findElements(By.xpath("//android.widget.TextView"));
		for(int i=1;i<lst.size();i++) {
		lst.get(i).click();
driver.navigate().back();
getElementByAccessibilityID("List dialog").click();
			//To be continued
		}
	}

	}

