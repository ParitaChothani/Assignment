package com.assessment;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Question_4 {
	WebDriver driver;
	@Test
	public void before() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void email() throws InterruptedException {
		driver.findElement(By.name("emailid")).sendKeys("pari@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1000);
	}
	@Test
    public void Passmethod() {
	int i=1,j=1;
	Assert.assertSame(i,j);
	System.out.println("this method is pass !!");
	}
	@AfterTest   
	public void aftersetup() {
		System.out.println("byeee byeee .....");
		driver.close();
	}	
}
