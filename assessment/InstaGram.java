package com.assessment;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import io.appium.java_client.AppiumDriver;
public class InstaGram {
@Test	
public void loginpass() throws InterruptedException, IOException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "vivo 1906");
	cap.setCapability("udid", "c99ae8b3");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "11.0");
	cap.setCapability("appPackage", "com.instagram.lite");
	cap.setCapability("appActivity", "com.facebook.lite.MainActivity");
	cap.setCapability("automationName", "UIAutomator2");
	URL url=new URL("http://127.0.0.1:4723/");
	AppiumDriver driver=new AppiumDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	Thread.sleep(1000);
	driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.View")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.View")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView[1]")).sendKeys("pari.a_45");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView[2]")).sendKeys("Admin@123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.view.ViewGroup")).click();
	Thread.sleep(8000);
	File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(file, new File("D:\\Selenium\\ss\\instalogin1.png"));
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup[4]/android.view.ViewGroup/"
			+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View")).click();
	Thread.sleep(1000);
	driver.quit();
}
}
