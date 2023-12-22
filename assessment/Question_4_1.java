package com.assessment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Question_4_1 {
	WebDriver driver;
	@BeforeTest
	public void before() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://www.demo.guru99.com/V4/");
	driver.manage().window().maximize();
	}
	@Test
	public void username() throws InterruptedException, IOException {
		driver.findElement(By.name("uid")).sendKeys("pari");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
	}
}
