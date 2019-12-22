package readexcelfileoperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Test {

	public static Object[][] main(String[] args) throws IOException {

		File f = new File("C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\abc.xls");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount+1);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		
Object data [][] = new Object[rowCount][colCount];
		
		for(int i=1; i<rowCount+1; i++){
			
			String uname = sheet.getRow(i).getCell(0).getStringCellValue();
			String pwd = sheet.getRow(i).getCell(1).getStringCellValue();
		}
		return data;
		

	}

}
