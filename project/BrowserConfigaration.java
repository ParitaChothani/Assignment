package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserConfigaration {
	WebDriver driver=null;
	public WebDriver ChromeBrowserSelection(String browser,String URL)
	{
		if(browser.equals("chrome") || browser.equals("Chrome") || browser.equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URL);
		}
		return driver;
	}
	public WebDriver firefoxBrowserSelection(String browser,String URL)
	{
		if(browser.equals("firefox") || browser.equals("Firefox") || browser.equals("FIREFOX"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URL);
		}
		return driver;
	}
}
