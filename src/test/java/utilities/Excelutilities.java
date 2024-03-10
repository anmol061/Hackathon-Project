package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.*;

public class Excelutilities {

	public void writeData(List<String> a, List<String> b, String sheetname) throws IOException {
		FileInputStream file = new FileInputStream(".\\testData\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet;
		try {
			sheet = workbook.createSheet(sheetname);
			
		}
		catch(Exception e) {
			sheet = workbook.getSheet(sheetname);
			
		}
		XSSFRow headerrow = sheet.createRow(0);

		headerrow.createCell(0).setCellValue("Course Name");
		headerrow.createCell(1).setCellValue("Ratings");

		
		  int loopLimit = Math.max(a.size(), b.size());

		    for (int i = 0; i < loopLimit; i++) {
		        XSSFRow row = sheet.getRow(i + 1);
		        if (row == null) {
		            row = sheet.createRow(i + 1);
		        }
		        if (i < a.size()) {
		            row.createCell(0).setCellValue(a.get(i));
		        }
		        if (i < b.size()) {
		            row.createCell(1).setCellValue(b.get(i));
		        }
		    }
		
		
		
		
		try {
			file.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		FileOutputStream fo = new FileOutputStream(".\\testData\\Data.xlsx");
		workbook.write(fo);
		workbook.close();
		fo.close();

	}

}
