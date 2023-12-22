package Module_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * W.a.maven program to create simple webdriver Program
 */
public class Question_1 {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		System.out.println("url is : " +driver.getCurrentUrl());
		System.out.println("title is : " +driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
