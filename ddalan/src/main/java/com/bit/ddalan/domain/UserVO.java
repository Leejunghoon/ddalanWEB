package com.bit.ddalan.domain;

public class UserVO {

	private String regID;
	private String email;
	private String phone;

		
	
	public String getRegID() {
		return regID;
	}
	public void setRegID(String regID) {
		this.regID = regID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserVO [ regID=" + regID + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	
	
	
}
