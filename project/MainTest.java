package com.project;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MainTest {
	WebDriver driver=null;
	LoginPages lp=null;
	SideMenu s1=null;
	AddToCart a1 =null;
	@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new BrowserConfigaration().ChromeBrowserSelection("chrome", "https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@BeforeTest
	public void beforetest()
	{
		lp=new LoginPages();
		s1=new SideMenu();
		a1=new AddToCart();
	}
	@Test(priority = 0)
	public void loginDetails() throws InterruptedException
	{
		lp.enterUsername(driver, "paritachothani@gmail.com");
		lp.enterPassword(driver, "Admin@123P");
		lp.clickLogin(driver);
	}
	@Test(priority = 1)
	public void sideMenu() throws InterruptedException
	{
		s1.Women(driver);
		s1.Tops(driver);
		s1.openAbout(driver);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void addToCart() throws InterruptedException, IOException
	{
		a1.addtocartlogo(driver);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		System.out.println("Bye Bye...");
		Thread.sleep(1000);
		driver.close();		
	}
}
