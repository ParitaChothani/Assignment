package com.assessment;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
public class Clock {
	@Test
	public void loginpass() throws InterruptedException, IOException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1906");
		cap.setCapability("udid", "c99ae8b3");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability("appPackage", "com.android.BBKClock");
		cap.setCapability("appActivity", "com.android.BBKClock.Timer");
		cap.setCapability("automationName", "UIAutomator2");
		URL url=new URL("http://127.0.0.1:4723/");
		AppiumDriver driver=new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/"
				+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/"
				+ "android.view.View[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Switch")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/"
				+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/"
				+ "android.view.View[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Switch")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/"
				+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/"
				+ "android.widget.CheckBox[1]/android.widget.LinearLayout")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/"
				+ "android.widget.LinearLayout/android.widget.Button[2]")).click();
		Thread.sleep(1000);
}
}