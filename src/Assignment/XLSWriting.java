package Assignment;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class XLSWriting {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb= new HSSFWorkbook();
		HSSFSheet sh1= wb.createSheet("Sheet1");
		File f= new File("C:\\Users\\afreen.khan\\Documents\\New folder\\Data1.xls");
		FileOutputStream fos= new FileOutputStream(f);
		
		Row r0= sh1.createRow(0);
		Cell c0=r0.createCell(0);
		c0.setCellValue("Testing");
		
		wb.write(fos);
		fos.close();
		wb.close();

		System.out.println("Written in File");
		System.out.println("Written in File");
	}

}
