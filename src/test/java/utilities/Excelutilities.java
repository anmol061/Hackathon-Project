package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.*;

public class Excelutilities {

	public void writeData(List<String> a,List<String>b,String sheetname) throws IOException {
		FileInputStream file = new FileInputStream(".\\testData\\Data.xlsx");;
    	XSSFWorkbook workbook =  new XSSFWorkbook(file); 
         
    	XSSFSheet sheet=null;
		sheet =workbook.getSheet(sheetname);
		
		
		XSSFRow row=null;
        row = sheet.createRow(0);
        
        row.createCell(0).setCellValue("Course Name");
        row.createCell(1).setCellValue("Ratings");
        

		
		for(int i = 0; i<a.size(); i++) {
					
			if(sheet.getRow(i)==null)
			{
				sheet.createRow(i+1);
			}   
			row.createCell(0).setCellValue(a.get(i));
			row.createCell(1).setCellValue(b.get(i));
						
		}
		try {
			file.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		FileOutputStream fo=new FileOutputStream(".\\testData\\Data.xlsx");
		workbook.write(fo);
		workbook.close();
		fo.close();

	}

}


