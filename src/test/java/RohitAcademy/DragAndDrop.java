package RohitAcademy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class DragAndDrop extends BaseTest{
	@Test
	public void dragAndDropTest() throws InterruptedException {
	getElementByAccessibilityID("Views").click();
    getElementByAccessibilityID("Drag and Drop").click();
    WebElement source=getElementById("io.appium.android.apis:id/drag_dot_1");
    //Method to drag and drop
    dragAndDrop(source, 830, 802);
Thread.sleep(3000);
String exptext=getElementById("io.appium.android.apis:id/drag_result_text").getText();
    Assert.assertEquals(exptext, "Dropped!");
	}
}