package Module_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * W.a.maven program to create TestNG with Webdriver Program
 */
public class Question_3 {
	WebDriver driver;
	@BeforeTest
	public void beforsetup() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void enterUsername() throws InterruptedException {
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
      Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void loginButton() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		   Thread.sleep(2000);
	}
	@Test(priority = 4)
   	public void logOut() throws InterruptedException {
   		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 3)
   	public void clickMenuButton() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	} 
	@Test(priority = 1)
	public void passWord() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   	   Thread.sleep(2000);
	}
	@AfterTest   
	public void aftersetup() {
		System.out.println("byeee byeee .....");
		driver.close();
	}
}
