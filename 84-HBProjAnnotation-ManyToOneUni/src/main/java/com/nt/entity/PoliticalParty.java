//PoliticalParty.java (parent class)
package com.nt.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
*/
@Table
@Entity
/*
 * @Getter
 * 
 * @Setter
 * 
 * @RequiredArgsConstructor
 */
public class PoliticalParty implements Serializable {
	@GeneratedValue
	@Id
	private  long partyId;
	//@NonNull
	@Column(length = 20)
	@Type(type="string")
	private  String partyName;
	//@NonNull
	@Column(length = 20)
	@Type(type="string")
	private  String flagColors;
	//@NonNull
	@Column(length = 20)
	@Type(type="string")
	private String partySymbol;
	
	

	public PoliticalParty(String partyName, String flagColors, String partySymbol) {
		
		this.partyName = partyName;
		this.flagColors = flagColors;
		this.partySymbol = partySymbol;
	}

	


	public long getPartyId() {
		return partyId;
	}




	public void setPartyId(long partyId) {
		this.partyId = partyId;
	}




	public String getPartyName() {
		return partyName;
	}




	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}




	public String getFlagColors() {
		return flagColors;
	}




	public void setFlagColors(String flagColors) {
		this.flagColors = flagColors;
	}




	public String getPartySymbol() {
		return partySymbol;
	}




	public void setPartySymbol(String partySymbol) {
		this.partySymbol = partySymbol;
	}




	@Override
	public String toString() {
		return "PoliticalParty [partyId=" + partyId + ", partyName=" + partyName + ", flagColors=" + flagColors
				+ ", partySymbol=" + partySymbol + "]";
	}
	
	
	

}
