package xlreading;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.text.pdf.codec.Base64.InputStream;

public class Xlreading {

	public static void main(String[] args) throws IOException {
		String filelocation="C:\\Users\\DURAIRAJ\\eclipse-workspace\\FramsWork\\xlfilefolder\\login.xlsx";
		XSSFWorkbook books=new XSSFWorkbook(filelocation);
		XSSFSheet sheetAt = books.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
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
		
		
		
		
