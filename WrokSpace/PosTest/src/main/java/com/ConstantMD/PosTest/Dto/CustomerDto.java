package com.ConstantMD.PosTest.Dto;

public class CustomerDto {

	private String firstname;
	private String lastname;
	private String gender;
	private String dob_date;
	private String dob_month;
	private String dob_year;
	private String cellphone;
	private String landphone;
	private String presentaddressline1;
	private String presentaddressline2;
	private String customertype;
	private String email;
	private String profession;
	private String quicksearchbox;
	private String adv_search_firstname;
	private String adv_search_lastname;
	private String adv_search_date;
	
	
	
	public String getQuicksearchbox() {
		return quicksearchbox;
	}



	public void setQuicksearchbox(String quicksearchbox) {
		this.quicksearchbox = quicksearchbox;
	}



	public String getAdv_search_firstname() {
		return adv_search_firstname;
	}



	public void setAdv_search_firstname(String adv_search_firstname) {
		this.adv_search_firstname = adv_search_firstname;
	}



	public String getAdv_search_lastname() {
		return adv_search_lastname;
	}



	public void setAdv_search_lastname(String adv_search_lastname) {
		this.adv_search_lastname = adv_search_lastname;
	}



	public String getAdv_search_date() {
		return adv_search_date;
	}



	public void setAdv_search_date(String adv_search_date) {
		this.adv_search_date = adv_search_date;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDob_date() {
		return dob_date;
	}



	public void setDob_date(String dob_date) {
		this.dob_date = dob_date;
	}



	public String getDob_month() {
		return dob_month;
	}



	public void setDob_month(String dob_month) {
		this.dob_month = dob_month;
	}



	public String getDob_year() {
		return dob_year;
	}



	public void setDob_year(String dob_year) {
		this.dob_year = dob_year;
	}



	public String getCellphone() {
		return cellphone;
	}



	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}



	public String getLandphone() {
		return landphone;
	}



	public void setLandphone(String landphone) {
		this.landphone = landphone;
	}



	public String getPresentaddressline1() {
		return presentaddressline1;
	}



	public void setPresentaddressline1(String presentaddressline1) {
		this.presentaddressline1 = presentaddressline1;
	}



	public String getPresentaddressline2() {
		return presentaddressline2;
	}



	public void setPresentaddressline2(String presentaddressline2) {
		this.presentaddressline2 = presentaddressline2;
	}



	public String getCustomertype() {
		return customertype;
	}



	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getProfession() {
		return profession;
	}



	public void setProfession(String profession) {
		this.profession = profession;
	}



	@Override
	public String toString(){
		return "CustomerDto [firstname=" + firstname + ", lastname=" + lastname + ", gender="+gender+", dob_date="+dob_date+", dob_month="+dob_month+", dob_year="+dob_year+", cellphone="+cellphone+", landphone="+landphone+", presentaddressline1="+presentaddressline1+", presentaddressline2="+presentaddressline2+", customertype="+customertype+", email="+email+", profession="+profession+", quicksearchbox="+quicksearchbox+", adv_search_firstname="+adv_search_firstname+", adv_search_lastname="+adv_search_lastname+", adv_search_date="+adv_search_date+"]";
		
	}
	
	
}
