package Module_7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Question14 {

	/*
	 * W.a. junit program to check gmail login using with @before,@after,@Test
	 */

	WebDriver driver;
	@Before
	public void beforsetup() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https:\"\r\n"
				+ "				+ \"//mail.google.com/mail/&service=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
	
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	Thread.sleep(1000);
    
	driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.name("firstName")).sendKeys("dhani");
    Thread.sleep(1000);
    driver.findElement(By.name("lastName")).sendKeys("chothani");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
    
	driver.findElement(By.id("month")).click();
	driver.findElement(By.xpath("//option[text()='August']")).click();
	driver.findElement(By.id("day")).sendKeys("30");
	Thread.sleep(1000);
	driver.findElement(By.id("year")).sendKeys("2003");
    Thread.sleep(1000);
    driver.findElement(By.id("gender")).click();
    driver.findElement(By.xpath("//option[text()='Female']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("selectioni2")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("dP@111Pd");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name='PasswdAgain']")).sendKeys("dP@111Pd");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9099125985");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	
	}
@After   
public void aftersetup() {
	System.out.println("it's done dude...");
	driver.close();
}
}
