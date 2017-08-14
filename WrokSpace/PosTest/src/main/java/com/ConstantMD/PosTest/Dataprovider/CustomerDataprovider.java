package com.ConstantMD.PosTest.Dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.ConstantMD.PosTest.Utils.ExcelUtils;

public class CustomerDataprovider {
	
	
	
	@DataProvider(name = "customerdataprovider")
	public static Object[][] getCustomerData(){
		try {
			return new Object[][] { { ExcelUtils.getCustomerData() }, };
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
