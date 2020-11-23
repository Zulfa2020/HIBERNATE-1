package com.nt.entity;

import java.io.Serializable;



public class StudentInfo implements Serializable {
	private int sno;
	private String sname;
	private  float avg;
	private Address addrs;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public Address getAddrs() {
		return addrs;
	}
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "StudentInfo [sno=" + sno + ", sname=" + sname + ", avg=" + avg + ", addrs=" + addrs + "]";
	}



}
