package RohitAcademy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
AndroidDriver driver;
AppiumDriverLocalService service;
@BeforeClass
public void configureAppium() throws MalformedURLException {
	service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\rkroh\\AppData\\Roaming\\npm\\node_modules\\appium"))
	//Giving IP address and port to which server to be connected
	.withIPAddress("127.0.0.1").usingPort(4723).build();
	service.start();
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Emulator_1");
	options.setApp("C:\\Users\\rkroh\\Appium_Workspace\\Demo1\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
			
	driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
			

}
@AfterClass
public void tearDown() {
	driver.quit();
	service.stop();
}

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
