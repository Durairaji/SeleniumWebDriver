package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wk = new XSSFWorkbook(stream);
		org.apache.poi.ss.usermodel.Sheet sheetAt = wk.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		

	}

}
