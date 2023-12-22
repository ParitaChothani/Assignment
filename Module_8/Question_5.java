package Module_8;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*
 * W.a.framework program for keyword driven framework
 */
public class Question_5 {
	 @DataProvider(name = "pari")
		public Object[][] readExcel() throws InvalidFormatException, IOException {
			Object[][] data=null;
			String filepath="D:\\Selenium\\read_excle.xlsx";
			File file=new File(filepath);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
		    Sheet sheet=workbook.getSheet("Sheet2");
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
	    public void test(String keyword) throws InvalidFormatException, IOException, InterruptedException {
		Object[][] data=readExcel();
		
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
			
			if (keyword.equals("open browser")) { 
			driver =new EdgeDriver();
			driver.manage().window().maximize();
			}
			else if (keyword.equals("url")) {
			driver.get("https://www.saucedemo.com"); 
			}
			else if (keyword.equals("username")) {
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        Thread.sleep(2000);
			}
			else if (keyword.equals("password")) {
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        Thread.sleep(2000);
			}
			else if (keyword.equals("click login")) {
		    driver.findElement(By.id("login-button")).click();
		    Thread.sleep(2000); 
		    }
			else if (keyword.equals("click menu")) {
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			}
			else if (keyword.equals("click logout")) {
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);
			System.out.println("byeee byeee .....");
			driver.close();
			}
	}
}
