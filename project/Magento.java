package com.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Magento {
	WebDriver driver;
	@Test
	public void before() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void signin() throws InterruptedException{
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("paritachothani@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Admin@123P");
		Thread.sleep(1000);
		driver.findElement(By.name("send")).click();
		Thread.sleep(1000);
	}	
	@Test
	public void women() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Women']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Tops']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/a/span/span/img")).click();
		Thread.sleep(1000);
	}
	@Test
	public void addtocart() throws InterruptedException {
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(1000);
		driver.close();
}
}
