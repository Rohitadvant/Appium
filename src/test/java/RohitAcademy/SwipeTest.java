package RohitAcademy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class SwipeTest extends BaseTest{
	@Test
	public void swipeTest() {
	getElementByAccessibilityID("Views").click();
    getElementByAccessibilityID("Gallery").click();
    getElementByAccessibilityID("1. Photos").click();
    WebElement firstImage=getElementByXpath("//android.widget.ImageView[1]");
    Assert.assertTrue(true, firstImage.getAttribute("focusable"));
    //Javascript code to swipe
   swipeAction(firstImage, "left");
    Assert.assertTrue(false, firstImage.getAttribute("focusable"));
	}
}
