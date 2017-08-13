package com.ConstantMD.PosTest.Dto;

public class LoginDto {
	
	private String username;
	private String password;
	private String securityquestion;
	
	
	public String getSecurityquestion() {
		return securityquestion;
	}
	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString(){
		return "LoginDto [username=" + username + ", password=" + password + ", securityquestion="+securityquestion+"]";
		
	}

}
