package Module_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question_6 {

	/*
	 * W.A.J.script to register your self in Gmail
	 */
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https:"
				+ "//mail.google.com/mail/&service=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		
		System.out.println("url is : " +driver.getCurrentUrl());
		System.out.println("title is : " +driver.getTitle());
		
		Thread.sleep(1000);

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
		
		
	    driver.close();
}
}
