package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatadrivenValuePassing {
	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wk = new XSSFWorkbook(stream);
		org.apache.poi.ss.usermodel.Sheet sheet = wk.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		Cell cell2 = row.getCell(1);
		String password = cell2.getStringCellValue();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(username);
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys(password);
		driver.quit();
		
	}
}
