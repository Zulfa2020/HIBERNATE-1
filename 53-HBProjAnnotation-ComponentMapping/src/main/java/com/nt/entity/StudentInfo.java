package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
@Table(name="STUDENT_INFO")
public class StudentInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type="int")
	private int sno;
	@Type(type="string")
	@Column(length=20)
	private String sname;
	@Type(type="float")
	@Column(scale = 10,precision = 2)
	private  float avg;
	@Embedded   // To make the property as component property
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
