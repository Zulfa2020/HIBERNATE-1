package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import lombok.Data;

@Entity

@DiscriminatorValue("card")
public class CardPayment extends Payment {
	@Type(type="long")
	private Long cardNo;
	@Column(length = 10)
	@Type(type="string")
	private String cardType;
	@Column(length = 10)
	@Type(type="string")
		private  String  paymentGateway;
	public Long getCardNo() {
		return cardNo;
	}
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getPaymentGateway() {
		return paymentGateway;
	}
	public void setPaymentGateway(String paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cardType=" + cardType + ", paymentGateway=" + paymentGateway
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
