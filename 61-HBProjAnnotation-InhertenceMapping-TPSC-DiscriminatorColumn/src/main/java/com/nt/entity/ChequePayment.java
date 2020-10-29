package com.nt.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity

@DiscriminatorValue("cheque")
public class ChequePayment extends Payment {
	@Type(type="long")
	private Long chequeNo;
	
	@Column(length = 10)
	@Type(type="string")
	private String chequeType;
	
	private  LocalDate  expiryDate;

	public Long getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(Long chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeType=" + chequeType + ", expiryDate=" + expiryDate
				+ ", toString()=" + super.toString() + "]";
	} 	
	
	

}
