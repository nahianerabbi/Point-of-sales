package com.ConstantMD.PosTest.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ConstantMD.PosTest.Dataprovider.LoginDataprovider;
import com.ConstantMD.PosTest.Dto.LoginDto;
import com.ConstantMD.PosTest.Utils.DriverExecution;
import com.ConstantMD.PosTest.Utils.UrlUtils;
import com.ConstantMD.PosTest.Utils.XpathUtils;




public class LoginTest {

	private WebDriver driver = null;

	@Test(priority = 1)
	public void checkLoginPageTitle() throws InterruptedException {
		driver =DriverExecution.driver ;
		driver.get(UrlUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlUtils.LOGIN_PAGE_TITLE);

		System.out.println("POS login Page Title Verified !!!");
	}
	
	@Test(priority = 2, dataProvider="logindataprovider", dataProviderClass=LoginDataprovider.class)
	public void loginTest(List<LoginDto>logins)throws InterruptedException{
		
		
		for (LoginDto loginexcel:logins){
			
			driver.findElement(By.xpath(XpathUtils.Login.Login_USER_NAME)).sendKeys(loginexcel.getUsername());
			driver.findElement(By.xpath(XpathUtils.Login.Login_PASSWORD)).sendKeys(loginexcel.getPassword());
			driver.findElement(By.xpath(XpathUtils.Login.BTN_LOGIN)).click();
			driver.findElement(By.xpath(XpathUtils.Login.SEQURITY_QUESTION)).sendKeys(loginexcel.getSecurityquestion());
			driver.findElement(By.xpath(XpathUtils.Login.SEQURITY_SUBMIT_BTN)).click();
			
			System.out.println("login page verified.");
		}
	}
		
	
}
