package com.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question_3 {
	WebDriver driver;
	@BeforeTest
	public void test() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	driver.manage().window().maximize();
	}
	@Test
	public void edit() throws InterruptedException {
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("parita");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("chothani");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("pari@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("age")).sendKeys("20");
		Thread.sleep(1000);
		driver.findElement(By.id("salary")).sendKeys("50000");
		Thread.sleep(1000);
		driver.findElement(By.id("department")).sendKeys("qa");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
	}
	@Test
	public void remove() throws InterruptedException {
		driver.findElement(By.id("delete-record-1")).click();
		Thread.sleep(1000);
	}
	@AfterTest   
	public void aftersetup() {
		System.out.println("byeee byeee .....");
		driver.close();
	}	
}
