//Canteen.java (child class)
package com.nt.entity;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/
@Entity
@Table(name="CANTEEN_ANNO_OTO")
/*
 * @Getter
 * 
 * @Setter
 * 
 * @RequiredArgsConstructor
 */
public class CanteenCard implements Serializable {
	@Id
	@GenericGenerator(name ="gen1",strategy = "foreign",
	                                     parameters = @Parameter(name="property" ,value ="empDetails" ) )
	@GeneratedValue(generator="gen1")
	@Type(type="int")
	private  Integer cardid;
	
	@Column(length=15)
	@Type(type="string")
	//@NonNull
	private String canteenName;

	@Column(length=15)
	@Type(type="string")
	//@NonNull
	private  String location;
	
	@Column(length=15)
	@Type(type="string")
	//@NonNull
	private  String cardType;
	@OneToOne(targetEntity = Employee.class,cascade = CascadeType.ALL,
			                                        fetch = FetchType.LAZY,orphanRemoval = true,mappedBy = "cardDetails")
	private  Employee  empDetails;
	
	

	public CanteenCard(String canteenName, String location, String cardType) {
		
		this.canteenName = canteenName;
		this.location = location;
		this.cardType = cardType;
	}



	public Integer getCardid() {
		return cardid;
	}



	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}



	public String getCanteenName() {
		return canteenName;
	}



	public void setCanteenName(String canteenName) {
		this.canteenName = canteenName;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getCardType() {
		return cardType;
	}



	public void setCardType(String cardType) {
		this.cardType = cardType;
	}



	public Employee getEmpDetails() {
		return empDetails;
	}



	public void setEmpDetails(Employee empDetails) {
		this.empDetails = empDetails;
	}



	@Override
	public String toString() {
		return "CanteenCard [cardid=" + cardid + ", canteenName=" + canteenName + ", location=" + location
				+ ", cardType=" + cardType + "]";
	}
	
	

}
