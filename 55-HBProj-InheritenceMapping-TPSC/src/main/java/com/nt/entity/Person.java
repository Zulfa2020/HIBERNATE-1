package com.nt.entity;

import java.io.Serializable;

import lombok.Data;

public class Person  implements Serializable {
	private int id;
	private String name;
	private String addrs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

}
