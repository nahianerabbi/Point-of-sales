package com.ConstantMD.PosTest.Test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ConstantMD.PosTest.Dataprovider.CustomerDataprovider;
import com.ConstantMD.PosTest.Dto.CustomerDto;
import com.ConstantMD.PosTest.Utils.DriverExecution;
import com.ConstantMD.PosTest.Utils.UrlUtils;
import com.ConstantMD.PosTest.Utils.XpathUtils;




public class CustomerTest {
	
	private WebDriver driver = null;
	
	@Test(priority=1)	
	public void checkCustomerPageTitle() throws InterruptedException  {
		driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_BTN)).click();
		driver =DriverExecution.driver ;
		WebDriverWait wait=new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.Customer.ADD_NEW_CUSTOMER_BTN)));
		Assert.assertEquals(driver.getTitle(), UrlUtils.CUSTOMERPAGE_TITLE);
		System.out.println("customer Page Title Verified !!!");
	
	}

	

	
	
	@Test(priority=2, dataProvider="customerdataprovider", dataProviderClass=CustomerDataprovider.class)
	public void addnewcustomerTest(List<CustomerDto>addnewcustomers)throws InterruptedException{

		
		for(CustomerDto customerexcel:addnewcustomers){
			
			System.out.println("add new customer test started!!");
			
			//driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_BTN)).click();
			driver.findElement(By.xpath(XpathUtils.Customer.ADD_NEW_CUSTOMER_BTN)).click();
			driver.findElement(By.xpath(XpathUtils.Customer.FIRST_NAME)).sendKeys(customerexcel.getFirstname());
			driver.findElement(By.xpath(XpathUtils.Customer.LAST_NAME)).sendKeys(customerexcel.getLastname());
			driver.findElement(By.xpath(XpathUtils.Customer.SEX)).sendKeys(customerexcel.getGender());
			driver.findElement(By.xpath(XpathUtils.Customer.DOB_DATE)).sendKeys(customerexcel.getDob_date());
			driver.findElement(By.xpath(XpathUtils.Customer.DOB_MONTH)).sendKeys(customerexcel.getDob_month());
			driver.findElement(By.xpath(XpathUtils.Customer.DOB_YEAR)).sendKeys(customerexcel.getDob_year());
			driver.findElement(By.xpath(XpathUtils.Customer.CELLPHONE)).sendKeys(customerexcel.getCellphone());
			driver.findElement(By.xpath(XpathUtils.Customer.LAND_PHONE)).sendKeys(customerexcel.getLandphone());
			driver.findElement(By.xpath(XpathUtils.Customer.PRESENT_ADDRESS_LINE1)).sendKeys(customerexcel.getPresentaddressline1());
			driver.findElement(By.xpath(XpathUtils.Customer.PRESENT_ADDRESS_LINE2)).sendKeys(customerexcel.getPresentaddressline2());
			driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_TYPE)).sendKeys(customerexcel.getCustomertype());
			driver.findElement(By.xpath(XpathUtils.Customer.EMAIL)).sendKeys(customerexcel.getEmail());
			driver.findElement(By.xpath(XpathUtils.Customer.PROFFESSION)).sendKeys(customerexcel.getProfession());
			driver.findElement(By.xpath(XpathUtils.Customer.CUSTOMER_PAGE_SUBMIT_BTN)).click();
			System.out.println("Add new customer test varified!!");
			
		}
	}
		
	
	
	/*@Test(priority=4)
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
	}
	
	@Test(priority=6)
	public void searchCustomerTest()throws InterruptedException{
		driver.findElement(By.xpath(XpathUtils.Customer.SEARCH_BOX)).sendKeys("");      
		
		
	System.out.println("Search customer test varified!!");
	}*/
}
