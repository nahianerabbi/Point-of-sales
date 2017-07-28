package com.ConstantMD.PosTest.Utils;

public class XpathUtils {
	
public static class Login {
		
		public static final String Login_USER_NAME = ".//*[@id='ctl00_ContentPlaceHolder1_LoginBoxUserControl_txtUserName']";
		public static final String login_PASSWORD = ".//*[@id='ctl00_ContentPlaceHolder1_LoginBoxUserControl_txtPassword']";
		public static final String BTN_LOGIN = ".//*[@id='ctl00_ContentPlaceHolder1_LoginBoxUserControl_btnSubmit']";
		public static final String SEQURITY_QUESTION= ".//*[@id='ctl00_ContentPlaceHolder1_txtAnswer1']";
		public static final String SEQURITY_SUBMIT_BTN= ".//*[@id='ctl00_ContentPlaceHolder1_btnSubmit']";
		
}

public class Customer{
	
	public static final String CUSTOMER_BTN = ".//*[@id='ctl00_navBar_rptTop_ctl00_hlSingle']";
	public static final String ADD_NEW_CUSTOMER_BTN = ".//*[@id='ctl00_ContentPlaceHolder1_hlAddCustomer']";
	public static final String FIRST_NAME= ".//*[@id='ctl00_ContentPlaceHolder1_txtFirstName']";
	public static final String LAST_NAME =".//*[@id='ctl00_ContentPlaceHolder1_txtLastName']";
	public static final String SEX =".//*[@id='ctl00_ContentPlaceHolder1_ddlGender']";
	public static final String CUSTOMER_ALLOW_LOGIN_CHECKBOX=".//*[@id='ctl00_ContentPlaceHolder1_chkIsLogin']";
	public static final String DOB_DATE =".//*[@id='ctl00_ContentPlaceHolder1_ddlDay']";
	public static final String DOB_MONTH= ".//*[@id='ctl00_ContentPlaceHolder1_ddlMonth']";
	public static final String DOB_YEAR =".//*[@id='ctl00_ContentPlaceHolder1_ddlYear']";
	public static final String CELLPHONE=".//*[@id='ctl00_ContentPlaceHolder1_txtCellPhone']";
	public static final String LAND_PHONE =".//*[@id='ctl00_ContentPlaceHolder1_txtPhoneNo']";
	public static final String PRESENT_ADDRESS_LINE1=".//*[@id='ctl00_ContentPlaceHolder1_txtAddress1']";
	public static final String PRESENT_ADDRESS_LINE2=".//*[@id='ctl00_ContentPlaceHolder1_txtAddress2']";
	public static final String CUSTOMER_TYPE=".//*[@id='ctl00_ContentPlaceHolder1_ddlCustomerTypeId']";
	public static final String EMAIL=".//*[@id='ctl00_ContentPlaceHolder1_txtEmail1']";
	public static final String PROFFESSION=".//*[@id='ctl00_ContentPlaceHolder1_txtProfession']";
	public static final String CUSTOMER_USERNAME=".//*[@id='ctl00_ContentPlaceHolder1_txtUserName']";
	public static final String CUSTOMER_PASSWORD=".//*[@id='ctl00_ContentPlaceHolder1_txtPassword']";
	public static final String CUSTOMER_CONFIRM_PASSWORD=".//*[@id='ctl00_ContentPlaceHolder1_txtConfirmPassword']";
	public static final String CUSTOMER_PAGE_SUBMIT_BTN=".//*[@id='ctl00_ContentPlaceHolder1_btnSubmit']";
	
	public static final String MANAGE_CUSTOMER_LIST_BTN=".//*[@id='ctl00_ContentPlaceHolder1_HyperLink2']";
	public static final String CREATE_CUSTOM_LIST_BTN=".//*[@id='ctl00_ContentPlaceHolder1_hlAddNew']";
	public static final String LIST_TITLE=".//*[@id='ctl00_ContentPlaceHolder1_txtTitle']";
	public static final String CUSTOM_LIST_SUBMIT_BTN=".//*[@id='btnSubmit']";
	public static final String CUSTOM_LIST_VIEW_BTN=".//*[@id='ctl00_ContentPlaceHolder1_rptList_ctl04_hlView']";
	
	
}

}
