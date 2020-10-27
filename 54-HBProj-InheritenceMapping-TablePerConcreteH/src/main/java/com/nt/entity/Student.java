package com.nt.entity;


public class Student extends Person {
    private String college;
    private String branch;
    private  Float avg;
    
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return super.toString() +"Student [college=" + college + ", branch=" + branch + ", avg=" + avg + ", toString()="
				+  "]";
	}
    
    
}
