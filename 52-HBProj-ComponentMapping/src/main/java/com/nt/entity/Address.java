package com.nt.entity;

public class Address {
	private String doorNo;
	private  String   streetName;
	private String state;
	private  String   areaName;
	private String country;
	private  long  pinCode;
	
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", state=" + state + ", areaName="
				+ areaName + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
