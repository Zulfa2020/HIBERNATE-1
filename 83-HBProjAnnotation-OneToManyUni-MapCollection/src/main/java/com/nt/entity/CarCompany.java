package com.nt.entity;

import java.io.Serializable;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

@Table(name="CARCOMPANY_MAP")
@Entity
/*
 * @Setter
 * 
 * @Getter
 * 
 * @RequiredArgsConstructor
 */
public class CarCompany  implements Serializable {
	@Id
	@Type(type="int")
	@GeneratedValue   //takes default sequence hibernate_sequence
	private Integer compId;
	
	@Column(length=15)
	@Type(type="string")
	//@NonNull
	private String  compName;
	
	@Column(length=15)
	@Type(type="string")
	//@NonNull
	private String  location;
	
	@LazyCollection(LazyCollectionOption.EXTRA)
	@OneToMany(targetEntity = CarModel.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true )
	@JoinColumn(name = "COMPANY_ID",referencedColumnName = "COMPID")
	@MapKeyColumn(name = "MAP_INDX",length = 10)
    @Fetch(FetchMode.SELECT)
	private Map<String,CarModel>  models;
	
	

	public CarCompany(String compName, String location) {
		
		this.compName = compName;
		this.location = location;
	}

	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Map<String, CarModel> getModels() {
		return models;
	}

	public void setModels(Map<String, CarModel> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "CarCompany [compId=" + compId + ", compName=" + compName + ", location=" + location + "]";
	}
}//class
