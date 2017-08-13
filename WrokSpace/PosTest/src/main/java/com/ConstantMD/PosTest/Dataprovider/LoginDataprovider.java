package com.ConstantMD.PosTest.Dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.ConstantMD.PosTest.Utils.ExcelUtils;



public class LoginDataprovider {
	
	@DataProvider(name = "logindataprovider")
	public static Object[][] getLoginData() {
		try {
			return new Object[][] { { ExcelUtils.getLoginData() }, };
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	}
