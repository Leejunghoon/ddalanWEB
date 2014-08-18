package com.bit.ddalan.domain;

public class UserVO {

	private String regID;
	private String email;
	private String phone;
	private String friendsN = null;
	private String friendsP;
	

	public String getFriendsN() {
		return friendsN;
	}
	public void setFriendsN(String friendsN) {
		this.friendsN = friendsN;
	}
	public String getFriendsP() {
		return friendsP;
	}
	public void setFriendsP(String friendsP) {
		this.friendsP = friendsP;
	}
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
