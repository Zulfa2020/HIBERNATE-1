package com.nt.entity;

import java.io.Serializable;

/*
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
*/
/*//@Data
@Setter
@Getter
@RequiredArgsConstructor*/
public class PhoneNumber implements Serializable {
	private int regNo;
	//@NonNull
	private long phone;
	//@NonNull
	private String type;
	//@NonNull
	private  String provider;
	private UserInfo user;
	
	

	
	
	public PhoneNumber(long l, String string, String string2) {
		// TODO Auto-generated constructor stub
	}



	public int getRegNo() {
		return regNo;
	}



	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getProvider() {
		return provider;
	}



	public void setProvider(String provider) {
		this.provider = provider;
	}



	public UserInfo getUser() {
		return user;
	}



	public void setUser(UserInfo user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phone=" + phone + ", type=" + type + ", provider=" + provider + "]";
	}
	
	

}
