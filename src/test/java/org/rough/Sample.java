package org.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Softwares\\excel\\Book1.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook= new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Datas");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j <row.getPhysicalNumberOfCells() ; j++) {
			Cell cell = row.getCell(j);
			int type = cell.getCellType();
			if(type==1) {
				String string = cell.getStringCellValue();
				System.out.println(string);
			}
			if (type==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
					String format = s.format(date);
					System.out.println(format);
				}else{
				double numericCellValue = cell.getNumericCellValue();	
				long l=(long) numericCellValue;
				String string2 = String.valueOf(l);
				System.out.println(string2);

				  }
			   }
			}
		}
	}
}
