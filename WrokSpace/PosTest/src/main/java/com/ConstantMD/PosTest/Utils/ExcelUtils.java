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

import com.ConstantMD.PosTest.Dto.CustomerDto;
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
	
	
	
	
	
	
	//CUSTOMER DTO
		public static List<CustomerDto> getCustomerData()  throws IOException{
			List<CustomerDto> customerExcel=new ArrayList<CustomerDto>();
			
			//login is the first sheet in excel so getSheet parameter set to 0
			DataFormatter formatter = new DataFormatter();
			Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	            CustomerDto customerdata=new CustomerDto();
	            byte cellCounter=0;
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                switch (cellCounter) {
					case 0:
						customerdata.setFirstname(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 1:
					    customerdata.setLastname(formatter.formatCellValue(cell));
					    cellCounter++;
					    break;
					case 2:
						customerdata.setGender(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 3:
						customerdata.setDob_date(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 4:
						customerdata.setLandphone(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 5:
						customerdata.setPresentaddressline1(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 6:
						customerdata.setPresentaddressline2(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 7:
						customerdata.setCustomertype(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 8:
						customerdata.setEmail(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 9:
						customerdata.setProfession(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 10:
						customerdata.setQuicksearchbox(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 11:
						customerdata.setAdv_search_firstname(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 12:
						customerdata.setAdv_search_lastname(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 13:
						customerdata.setAdv_search_date(formatter.formatCellValue(cell));
						break;
							
					default:
						break;
					}               
	                 
	            }
	            customerExcel.add(customerdata);
	        }
	        close();
	        return customerExcel;
		}


	private static void close() throws IOException {
		
		workbook.close();
		inputStream.close();
		
	}
		
}


