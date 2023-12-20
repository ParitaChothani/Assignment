package Module_7;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * W.a. TestNG program to check gmail login using with
 * @beforetest,@aftertest,@Test
 */

public class Question17 {
	WebDriver driver;
	@BeforeTest
	public void beforsetup() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		System.out.println("url is : " +driver.getCurrentUrl());
		System.out.println("title is : " +driver.getTitle());
		Thread.sleep(1000);	
	}
	@Test
	public void Createaccount() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
	    Thread.sleep(1000);
	}
	@Test
    public void username() throws InterruptedException {
    	driver.findElement(By.name("firstName")).sendKeys("dhani");
        Thread.sleep(1000);
        driver.findElement(By.name("lastName")).sendKeys("chothani");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    	Thread.sleep(1000);
	}
	@Test
    public void personalinfo() throws InterruptedException {
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
	}
    @Test
    public void idname() throws InterruptedException {
    	driver.findElement(By.id("selectioni2")).click();
    	Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    	Thread.sleep(1000);
	}
	@Test
	public void password() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("dP@111Pd");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='PasswdAgain']")).sendKeys("dP@111Pd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
	}
	@Test
	private void number() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9099125985");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);	
	}
	@AfterTest   
	public void aftersetup() {
		System.out.println("byeee byeee .....");
		driver.close();
	}	
}

