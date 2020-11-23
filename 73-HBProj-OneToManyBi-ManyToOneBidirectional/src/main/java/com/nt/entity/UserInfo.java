package com.nt.entity;

import java.io.Serializable;

import java.util.Set;
/*
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/


/*//@Data
@Setter
@Getter
//@NoArgsConstructor
@RequiredArgsConstructor*/
public class UserInfo implements Serializable {
	private int userId;
	//@NonNull
	private String username;
	//@NonNull
	private  String  addrs;
	private Set<PhoneNumber> phones;  // special property to build 1..* assocication (By holding muliple objects of child class)
	
	

	public UserInfo(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public Set<PhoneNumber> getPhones() {
		return phones;
	}

	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", username=" + username + ", addrs=" + addrs + "]";
	}
	
	

}
