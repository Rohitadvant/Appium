package RohitAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Utility {
	AndroidDriver driver;
public WebElement getElementByXpath(String s) {
	return driver.findElement(By.xpath(s));
}
public WebElement getElementById(String s) {
	return driver.findElement(By.id(s));
}
public WebElement getElementBynClassName(String s) {
	return driver.findElement(AppiumBy.className(s));
}
public WebElement getElementByAccessibilityID(String s) {
	return driver.findElement(AppiumBy.accessibilityId(s));
}
}
