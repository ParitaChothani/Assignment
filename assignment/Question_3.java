package com.assignment;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.mvn.BaseTest;
import io.appium.java_client.AppiumBy;
//Write an Appium Program to connect with emulator wit ecommerce based application using Generalstore.app to perform locators like name, dropdown etc.
public class Question_3 extends BaseTest{
@Test
public void test1() throws InterruptedException {
driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
Thread.sleep(1000);
driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
Thread.sleep(1000);
driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("parita chothani");
Thread.sleep(1000);
driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
Thread.sleep(1000);
driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
Thread.sleep(1000);
driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));")).click();
Thread.sleep(1000);
driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
Thread.sleep(1000);
driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
Thread.sleep(1000);
}
}
