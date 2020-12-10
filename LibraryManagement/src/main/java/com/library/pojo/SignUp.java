package com.library.pojo;

public class SignUp {
	private String name;
	private String address;
	private String phoneNo;
	private String userName;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SignUp()
	{}
	public SignUp(String name, String address, String phoneNo, String userName, String password) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.password = password;
	}
	
	

}
