package com.assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

//Write an Appium Program to connect with realdevice using APIDemo.app to open the calculator and calculate all the operation like (addition, substraction, multiplication, division).
public class Question_7 {

public class calcDemo1 {
@Test
public void oprnCalc() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "vivo 1906");
	cap.setCapability("udid", "c99ae8b3");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "11.0");
	cap.setCapability("appPackage", "com.dencreak.dlcalculator");
	cap.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");
	cap.setCapability("automationName", "UIAutomator2");
	URL url=new URL("http://127.0.0.1:4723/");
	AppiumDriver driver=new AppiumDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	Thread.sleep(1000);
	
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_c_d")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_b_d")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_a")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_a_d")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_b")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
	Thread.sleep(1000);
}
}}
