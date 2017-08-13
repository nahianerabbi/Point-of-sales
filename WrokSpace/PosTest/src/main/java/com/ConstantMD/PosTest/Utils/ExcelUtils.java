package com.ConstantMD.PosTest.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ConstantMD.PosTest.Dto.LoginDto;


public class ExcelUtils {
	
	private static FileInputStream inputStream = null;
	private static Workbook workbook= null;

	private  static Sheet getSheet(int sheetNo) throws IOException{
		// change the file location as per your computer
		File f = new File("src/main/java");
		File fs = new File(f,"PosData.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(sheetNo);
        return sheet;
	}
	
	
	//LOGIN DTO
	public static List<LoginDto> getLoginData() throws IOException{
		List<LoginDto> loginExcel=new ArrayList<LoginDto>();
		
		//login is the first sheet in excel so getSheet parameter set to 0
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            LoginDto logindata=new LoginDto();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					logindata.setUsername(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					logindata.setPassword(formatter.formatCellValue(cell));
					cellCounter++;
					break;
					
				case 2:
					logindata.setSecurityquestion(formatter.formatCellValue(cell));
					break;
				default:
					break;
				}               
                 
            }
            loginExcel.add(logindata);
        }
        close();
        return loginExcel;
	}


	private static void close() throws IOException {
		
		workbook.close();
		inputStream.close();
		
	}
		
}


