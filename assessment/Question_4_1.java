package com.assessment;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Question_4_1 {
	@DataProvider(name = "pari")
	public Object[][] readExcel() throws InvalidFormatException, IOException {
		Object[][] data=null;
		String filepath="D:\\Selenium\\assessment.xlsx";
		File file=new File(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
	    Sheet sheet=workbook.getSheet("Sheet3");
		int nrow=sheet.getPhysicalNumberOfRows();
		System.out.println("no of row is :"+nrow);
		data=new Object[nrow][];
		for (int i = 0; i < data.length; i++) {
			Row row=sheet.getRow(i);
			int ncell=row.getPhysicalNumberOfCells();
			System.out.println("no of col is :"+ncell);
			data[i]=new String[ncell];
			for (int j = 0; j < data[i].length; j++) {
				 Cell cell=row.getCell(j);
				 cell.setCellType(CellType.STRING);
				 data[i][j]=cell.getStringCellValue();
			}
		}
		return data;
		}
    WebDriver driver=null;
	@Test (dataProvider = "pari")
    public void test(String keyword, String data) throws InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		if (keyword.equals("open browser")) { 
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		}
		else if (keyword.equals("url")) {
		driver.get(data); 
		}
		else if (keyword.equals("username")) {
		driver.findElement(By.name("uid")).sendKeys(data);
        Thread.sleep(2000);
		}
		else if (keyword.equals("password")) {
		driver.findElement(By.name("password")).sendKeys(data);
        Thread.sleep(2000);
		}
		else if (keyword.equals("click login")) {
	    driver.findElement(By.name("btnLogin")).click();
	    Thread.sleep(2000); 
	    }
}
}
