package xlFileReading;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlfileReading {

	public static void main(String[] args) throws IOException {

		String filelocation="C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx";
		XSSFWorkbook books=new XSSFWorkbook(filelocation);
		XSSFSheet sheetAt = books.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println(lastRowNum);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("this is last cell number"+lastCellNum);
		for(int i=1;i<=lastRowNum;i++)
		{
			XSSFRow row = sheetAt.getRow(i);
			for(int j=0; j<lastCellNum;j++)
			{
				XSSFCell cell = row.getCell(j);
				DataFormatter dft=new DataFormatter();
				String formatCellValue = dft.formatCellValue(cell);
				System.out.println(formatCellValue);
							
			}
		}
		
		
		
		
		
		
	}

}
