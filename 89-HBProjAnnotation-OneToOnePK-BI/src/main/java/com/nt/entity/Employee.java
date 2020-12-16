//Employee.java (parent class)
package com.nt.entity;
import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

@Entity
@Table(name="EMPLOYEE_ANNO_OTO")
/*
 * @Getter
 * 
 * @Setter
 * 
 * @RequiredArgsConstructor
 */
public class Employee implements Serializable {
	@Id
	@GeneratedValue
	private Integer eno;
	
	@Type(type="string")
	@Column(length=20)
	//@NonNull
	private String ename;

	@Type(type="string")
	@Column(length=20)
	//@NonNull
	private  String eadd;
	
	@Type(type="float")
	//@NonNull
	private  Float  salary;
	
	@OneToOne(targetEntity=CanteenCard.class,cascade =CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval =true )
	@PrimaryKeyJoinColumn(name ="CID",referencedColumnName = "ENO" )
	private CanteenCard cardDetails;
	
	

	public Employee(String ename, String eadd, Float salary) {
		this.ename = ename;
		this.eadd = eadd;
		this.salary = salary;
	}
	
	



	public Integer getEno() {
		return eno;
	}





	public void setEno(Integer eno) {
		this.eno = eno;
	}





	public String getEname() {
		return ename;
	}





	public void setEname(String ename) {
		this.ename = ename;
	}





	public String getEadd() {
		return eadd;
	}





	public void setEadd(String eadd) {
		this.eadd = eadd;
	}





	public Float getSalary() {
		return salary;
	}





	public void setSalary(Float salary) {
		this.salary = salary;
	}





	public CanteenCard getCardDetails() {
		return cardDetails;
	}





	public void setCardDetails(CanteenCard cardDetails) {
		this.cardDetails = cardDetails;
	}





	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eadd=" + eadd + ", salary=" + salary + "]";
	}
	
	
     	 

}
