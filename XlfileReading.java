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
		XSSFRow row = sheetAt.getRow(1);
		XSSFCell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		XSSFCell cell2 = row.getCell(1);
		String stringCellValue2 = cell2.getStringCellValue();
		System.out.println(stringCellValue2);
		XSSFRow row2 = sheetAt.getRow(2);
		XSSFCell cell3 = row2.getCell(0);
		String stringCellValue3 = cell3.getStringCellValue();
		System.out.println(stringCellValue3);
		//////////////////////////////////////////
		XSSFCell cell4 = row2.getCell(1);
		String stringCellValue4 = cell4.getStringCellValue();
        System.out.println(stringCellValue4);
		
		
		
		
		
		
		
		
		
		
	}

}
