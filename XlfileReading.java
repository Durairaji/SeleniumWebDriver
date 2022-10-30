package xlFileReading;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlfileReading {

	public static void main(String[] args) throws IOException {

		String filelocation="C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx";
		XSSFWorkbook books=new XSSFWorkbook(filelocation);
		XSSFSheet sheetAt = books.getSheetAt(0);
		package xlFileReading;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlfileReading {

	public static void main(String[] args) throws IOException {

		String filelocation="C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx";
		XSSFWorkbook books=new XSSFWorkbook(filelocation);
		XSSFSheet sheetAt = books.getSheetAt(0);
		for(int i=1;i<=2;i++)
		{
			XSSFRow row = sheetAt.getRow(i);
			for(int j=0; j<2;j++)
			{
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
		
		
		
		
		
		
	}

}

		
		
		
		
		
		
		
		
		
	}

}
