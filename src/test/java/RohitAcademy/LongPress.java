package RohitAcademy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class LongPress extends BaseTest {
@Test
public void longPressTest() {
	getElementByAccessibilityID("Views").click();
	getElementByAccessibilityID("Expandable Lists").click();
	getElementByAccessibilityID("1. Custom Adapter").click();
	String xpath="//android.widget.TextView[@text='People Names']";
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)getElementByXpath(xpath)).getId(), "duration", 2000));        
	String expText=getElementByXpath("//android.widget.TextView[@text=''Sample menu]").getText();
	Assert.assertEquals("Sample menu", expText);
}

}
