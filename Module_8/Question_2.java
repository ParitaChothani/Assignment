package Module_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * W.a.maven program to create Junit with webdriver Program
 */
public class Question_2 {
	WebDriver driver;
	@BeforeClass
	public void beforsetup() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException {
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
      Thread.sleep(2000);
   	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
   	   Thread.sleep(2000);
	   driver.findElement(By.id("login-button")).click();
	   Thread.sleep(2000);
	}
	@AfterClass   
	public void aftersetup() {
		System.out.println("byeee byeee .....");
		driver.close();
	}
}
