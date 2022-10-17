package Assignment;


import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXWriting {

	public static void main(String[] args) throws Exception {
		
		//Create a workbook
		XSSFWorkbook wb= new XSSFWorkbook();
		
		//Create a sheet in workbook
		XSSFSheet Sh1= wb.createSheet("Sheet1");
		
		Row r0= Sh1.createRow(0);
		
		Cell c0= r0.createCell(0);
		
		c0.setCellValue("Java Tutorial");
		
		Row r1= Sh1.createRow(1);
		Cell c1= r1.createCell(1);
		c1.setCellValue("Python");
		
		File f = new File("C:\\Users\\afreen.khan\\Documents\\New folder\\Data2.xlsx");
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("Written");
		

	}

}
