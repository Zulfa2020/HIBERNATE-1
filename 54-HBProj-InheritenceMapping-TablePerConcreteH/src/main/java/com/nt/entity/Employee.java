package com.nt.entity;

public class Employee extends Person {
	private String desg;
	private Float salary;
	private Integer deptNo;
	
	public String getDesg() {
		return desg;
	}


	public void setDesg(String desg) {
		this.desg = desg;
	}


	public Float getSalary() {
		return salary;
	}


	public void setSalary(Float salary) {
		this.salary = salary;
	}


	public Integer getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}


	
	
	
	@Override
	public String toString() {
		return super.toString() +"Employee [desg=" + desg + ", salary=" + salary + ", deptNo=" + deptNo + ", toString()="
				+  "]";
	}
	
	

}
