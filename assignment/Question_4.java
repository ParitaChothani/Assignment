package com.assignment;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.mvn.BaseTest;
import io.appium.java_client.AppiumBy;
//Write an Appium Program to connect with emulator wit ecommerce based application using Generalstore.app to perform swipe demo to swipe the menu.
public class Question_4 extends BaseTest {
@Test
public void swipe() throws InterruptedException {
driver.findElement(AppiumBy.accessibilityId("Views")).click();
Thread.sleep(1000);
driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
Thread.sleep(1000);
driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
Thread.sleep(1000);
//for (int i = 1; i < 3; i++) {
WebElement ele=driver.findElement(By.xpath("//android.widget.ImageView[1]"));
assertEquals(ele.getAttribute("focusable"), "true");
Thread.sleep(2000);
swipeAction(ele, "left");
Thread.sleep(2000);
assertEquals(ele.getAttribute("focusable"), "false");
//}
}
}
