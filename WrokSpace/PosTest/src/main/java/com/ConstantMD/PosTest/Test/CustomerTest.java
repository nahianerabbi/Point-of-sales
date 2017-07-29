package com.ConstantMD.PosTest.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ConstantMD.PosTest.Utils.DriverExecution;
import com.ConstantMD.PosTest.Utils.UrlUtils;
import com.ConstantMD.PosTest.Utils.XpathUtils;



public class CustomerTest {
	
	private WebDriver driver = null;
	
	@Test(priority=1)
	public void initiateLogin()throws InterruptedException {
		LoginTest login = new LoginTest();
		login.checkHomePageTitle();
		login.loginTest();
		
	}

	
	@Test(priority = 2)
	public void checkCustomerPageTitle() throws InterruptedException {
		driver =DriverExecution.driver ;		
		
		
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_BTN)).click();
		Assert.assertEquals(driver.getTitle(), UrlUtils.CUSTOMERPAGE_TITLE);

		System.out.println("Customer Page Title Verified !!!");
	}
	
	
	
	@Test(priority=3)
	public void addNewCustomertest()throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.Customer.ADD_NEW_CUSTOMER_BTN)).click();
		driver.findElement(By.xpath(XpathUtils.Customer.FIRST_NAME)).sendKeys("MD");
		driver.findElement(By.xpath(XpathUtils.Customer.LAST_NAME)).sendKeys("Rakib");
		driver.findElement(By.xpath(XpathUtils.Customer.SEX)).sendKeys("Male");
		//driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_ALLOW_LOGIN_CHECKBOX)).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.Customer.DOB_DATE)).sendKeys("14");
		driver.findElement(By.xpath(XpathUtils.Customer.DOB_MONTH)).sendKeys("August");
		driver.findElement(By.xpath(XpathUtils.Customer.DOB_YEAR)).sendKeys("1990");
		driver.findElement(By.xpath(XpathUtils.Customer.CELLPHONE)).sendKeys("123456");
		driver.findElement(By.xpath(XpathUtils.Customer.LAND_PHONE)).sendKeys("654321");
		driver.findElement(By.xpath(XpathUtils.Customer.PRESENT_ADDRESS_LINE1)).sendKeys("Mirpur");
		driver.findElement(By.xpath(XpathUtils.Customer.PRESENT_ADDRESS_LINE2)).sendKeys("Dhaka");
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_TYPE)).sendKeys("Platinum");
		driver.findElement(By.xpath(XpathUtils.Customer.EMAIL)).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath(XpathUtils.Customer.PROFFESSION)).sendKeys("service");
		//driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_USERNAME)).sendKeys("");
		//driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_PASSWORD)).sendKeys("");
		//driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_CONFIRM_PASSWORD)).sendKeys("");
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_PAGE_SUBMIT_BTN)).click();
		
				
		
		System.out.println("Add new customer test varified!!");
		Thread.sleep(5000);
	}
	
	@Test(priority=4)
	public void manageCustomerListTest()throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.Customer.MANAGE_CUSTOMER_LIST_BTN)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(XpathUtils.Customer.MANAGE_CUSTOMER_LIST_BTN)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(XpathUtils.Customer.CREATE_CUSTOM_LIST_BTN)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(XpathUtils.Customer.LIST_TITLE)).sendKeys("test");
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOM_LIST_SUBMIT_BTN)).click();
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_BTN)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_DETAILS_BTN)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_BTN)).click();
				
		System.out.println("manage customer list test varified!!");
	}
	
	/*@Test(priority=5)
	public void editCustomerTest()throws InterruptedException{
		
		
		System.out.println("Edit customer test varified");
	}*/
	
	@Test(priority=6)
	public void searchCustomerTest()throws InterruptedException{
		driver.findElement(By.xpath(XpathUtils.Customer.SEARCH_BOX)).sendKeys("");      
		
		
	System.out.println("Search customer test varified!!");
	}
}
