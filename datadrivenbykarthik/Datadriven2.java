package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wk = new XSSFWorkbook(stream);
		org.apache.poi.ss.usermodel.Sheet sheet = wk.getSheetAt(0);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				Cell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
	}

}
