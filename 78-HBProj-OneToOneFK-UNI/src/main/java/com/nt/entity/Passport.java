package com.nt.entity;

import java.io.Serializable;

import java.time.LocalDate;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

/*@Setter
@Getter
@RequiredArgsConstructor*/
public class Passport implements Serializable {
	private Long psptNo;
	//@NonNull
	private String country;
	//@NonNull
	private LocalDate expiryDate;
	private  Person  personDetails;
	
	public Passport(String country, LocalDate expiryDate) {
		this.country=country;
		this.expiryDate=expiryDate;
	}

	public Long getPsptNo() {
		return psptNo;
	}

	public void setPsptNo(Long psptNo) {
		this.psptNo = psptNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Person getPersonDetails() {
		return personDetails;
	}

	public void setPersonDetails(Person personDetails) {
		this.personDetails = personDetails;
	}

	/*
	 * public Passport() { System.out.println("Passport: 0-param constructor"); }
	 */
	@Override
	public String toString() {
		return "Passport [psptNo=" + psptNo + ", country=" + country + ", expirtyDate=" + expiryDate + "]";
	}
	
	

}
