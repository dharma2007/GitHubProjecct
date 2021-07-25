	package launch;
	
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
	
	public class Excel {
		
	 public static void main(String[] args) throws IOException {
		 
		 File f = new File("C:\\\\Users\\\\ThSdjkr\\\\Desktop\\\\working Software\\\\Data.xlsx");
		 
		 FileInputStream s = new FileInputStream(f);
		 
		 Workbook w = new XSSFWorkbook(s);
		 
		  Sheet s1 = w.getSheet("Sheet1");
		  
		  for (int i = 0; i < s1.getPhysicalNumberOfRows(); i++) {
			  Row r = s1.getRow(i);
			  for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
					
					
					
					int type = c.getCellType();
					if (type==1) {
						
						String name = c.getStringCellValue();
						
						System.out.println(name);
						
					}
					if (type==0) {
						
//					if (DateUtil.isCellDateFormatted(c)) {
//						Date date = c.getDateCellValue();
//						SimpleDateFormat fr = new SimpleDateFormat("dd-MMM-yyyy");
//						
//						String format = fr.format(date);
//						
//						System.out.println(format);
						
					}
					
					else {
						double d = c.getNumericCellValue();
						
						long l = (long)d;
						
						String n = String.valueOf(l);
						
						System.out.println(n);
					}
					
						
					}
					 
			}
	}
	 }
	}