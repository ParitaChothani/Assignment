package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 *  W.a. TestNG program to perform test with webdriver to login process of facebook
 */

public class Question16 {

	WebDriver driver=null;
	@BeforeTest
	public void before() {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void enterUsername() throws InterruptedException {
      driver.findElement(By.id("email")).sendKeys("paritachothani30@gmail.com");
      Thread.sleep(2000);
	}
	@Test
	public void enterpassword() throws InterruptedException {
      driver.findElement(By.id("pass")).sendKeys("Admin@12");
      Thread.sleep(2000);	
	}
	@Test
	public void loginbutton() throws InterruptedException {
      driver.findElement(By.name("login")).click();
      Thread.sleep(2000);
	}
	@AfterTest
	public void after() {
		System.out.println("it's done dude...");
		driver.close();
	}
}
