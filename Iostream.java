package inputoutstream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iostream {
	public static void main(String[] args) throws IOException {
		String filelocation="C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\Book1.xlsx";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");

		XSSFWorkbook wbook=new XSSFWorkbook(filelocation);
		XSSFSheet sheet=wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		XSSFCell cell2 = row.getCell(1);
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);
		WebElement usernameloc = driver.findElement(By.id("username"));
		usernameloc.sendKeys(value);
		WebElement passloc = driver.findElement(By.id("password"));
		passloc.sendKeys(stringCellValue);
		WebElement loginloc = driver.findElement(By.id("login"));
		loginloc.click();
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		//XSSFSheet sheetAt=wbook.getSheetAt(0);
		
		
		XSSFRow row22 = sheetAt.getRow(2);
		XSSFCell cell01 = row22.getCell(1);
		String value22 = cell01.getStringCellValue();
		System.out.println(value22);
		WebElement loctionloc = driver.findElement(By.xpath("//select[@name='location']"));
		loctionloc.sendKeys(value22);
		
		
		
		XSSFRow row2 = sheetAt.getRow(2);
		XSSFCell cell0 = row2.getCell(0);
		String value2 = cell0.getStringCellValue();
		System.out.println(value2);
		WebElement hotelloc = driver.findElement(By.xpath("//select[@name='location']"));
		hotelloc.sendKeys(value2);
		//new we going find type
		XSSFRow row4 = sheet.getRow(4);
		XSSFCell cell3 = row4.getCell(1);
		String value221 = cell3.getStringCellValue();
		System.out.println(value221);
		WebElement roomtyloc = driver.findElement(By.id("room_type"));
		roomtyloc.sendKeys(value221);
		WebElement serclick = driver.findElement(By.xpath("//input[@type='submit']"));
		serclick.click();
		////////////
		WebElement check = driver.findElement(By.id("radiobutton_1"));
		check.click();
		WebElement conclick = driver.findElement(By.id("continue"));
		conclick.click();
		
		/////////////
		
		XSSFRow row9 = sheet.getRow(9);
		XSSFCell cell099 = row9.getCell(0);
		String value229 = cell099.getStringCellValue();
		System.out.println(value229);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstName.sendKeys(value229);
		/////////
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("fhifhfh");
		WebElement adddes = driver.findElement(By.id("//*[@id='address']"));
		adddes.sendKeys("adddes nlkgmdfgkljlkgj");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}
