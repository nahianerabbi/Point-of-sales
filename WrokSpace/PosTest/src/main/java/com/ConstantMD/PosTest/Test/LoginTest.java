package com.ConstantMD.PosTest.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ConstantMD.PosTest.Utils.DriverExecution;
import com.ConstantMD.PosTest.Utils.UrlUtils;
import com.ConstantMD.PosTest.Utils.XpathUtils;


public class LoginTest {

	private WebDriver driver = null;

	@Test(priority = 1)
	public void checkHomePageTitle() throws InterruptedException {
		driver =DriverExecution.driver ;	
		driver.get(UrlUtils.BASE_URL);
		
		
		Assert.assertEquals(driver.getTitle(), UrlUtils.LOGIN_PAGE_TITLE);

		System.out.println("Home Page Title Verified !!!");
	}
	
	@Test(priority = 2)
	public void loginTest(){
		
		driver.findElement(By.xpath(XpathUtils.Login.Login_USER_NAME)).sendKeys("rabbi");
		driver.findElement(By.xpath(XpathUtils.Login.login_PASSWORD)).sendKeys("123456");
		driver.findElement(By.xpath(XpathUtils.Login.BTN_LOGIN)).click();
		System.out.println("Logged In Successfully !!");
		
		driver.findElement(By.xpath(XpathUtils.Login.SEQURITY_QUESTION)).sendKeys("dhaka");
		driver.findElement(By.xpath(XpathUtils.Login.SEQURITY_SUBMIT_BTN)).click();
		System.out.println("Sequrity question enterd successfully !!");
	}

	/*private void navigate(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
		driver.navigate().refresh();
	}*/

}
