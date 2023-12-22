package com.assessment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question_1 {
	WebDriver driver;
	@BeforeTest
	public void before() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void name() throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys("pari");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("chothani");
		Thread.sleep(1000);
	}
	@Test(priority = 1)
	public void mail() throws InterruptedException {
		driver.findElement(By.id("userEmail")).sendKeys("pari@gmail.com");
		Thread.sleep(1000);
	}
	@Test(priority = 2)
	public void gender() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void mobile() throws InterruptedException {
		driver.findElement(By.id("userNumber")).sendKeys("9099125985");
		Thread.sleep(1000);
	}
	@Test(priority = 4)
	public void dateofbirth() throws InterruptedException {
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='April']")).click();
	    driver.findElement(By.className("react-datepicker__year-select")).sendKeys("2000");
	    driver.findElement(By.xpath("//div[text()='3']")).click();
	    Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void subject() throws InterruptedException {
		driver.findElement(By.id("subjectsInput")).sendKeys("software testing");
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void hobbies() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 7)
	public void address() throws InterruptedException {
		driver.findElement(By.id("currentAddress")).sendKeys("pasodara");
		Thread.sleep(1000);	
	}
	@Test(priority = 8)
	public void stateandcity() throws InterruptedException {
		driver.findElement(By.id("state")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='NCR']")).click();
		driver.findElement(By.id("city")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Noida']")).click();
		Thread.sleep(1000);
	  	}
	@AfterTest
	public void submit() throws InterruptedException, IOException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
        File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("D:\\Selenium\\ss\\form1defect.png"));
	}
	@AfterTest   
	public void aftersetup() {
		System.out.println("byeee byeee .....");
		driver.close();
	}	
	}
