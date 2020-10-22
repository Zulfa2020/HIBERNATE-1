package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;

import lombok.Data;

@Embeddable
public class Address {
	@Type(type="string")
	@Column(length=20)
	private String doorNo;
	@Type(type="string")
	@Column(length=20)
	private  String   streetName;
	@Type(type="string")
	@Column(length=20)
	private String state;
	@Type(type="string")
	@Column(length=20)
	private  String   areaName;
	@Type(type="string")
	@Column(length=20)
	private String country;
	@Type(type="long")
	@Column(length=10)
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
