package com.nt.entity;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/
@Table(name="COMPANY_OTM_BI")
@Entity
/*
 * @Getter
 * 
 * @Setter
 * 
 * @RequiredArgsConstructor
 */
public class Company  implements Serializable {
	@Id
	@GeneratedValue
	@Type(type="int")
    private Integer compId;
	
	@Column(length=20)
	@Type(type="string")
	//@NonNull
    private String   compName;
	
	@Column(length=20)
	@Type(type="string")
	//@NonNull
    private  String  addrs;
	
	@Column(length=20)
	@Type(type="string")
	//@NonNull
    private  String type;
	
	@OneToMany(targetEntity =Project.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval =true,mappedBy="company")
	//@JoinColumn(name = "COMPANY_ID",referencedColumnName = "COMPID")
    private Set<Project>  projects; 
	
	

	public Company(String compName, String addrs, String type) {
	
		this.compName = compName;
		this.addrs = addrs;
		this.type = type;
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





	public String getAddrs() {
		return addrs;
	}





	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public Set<Project> getProjects() {
		return projects;
	}





	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}





	@Override
	public String toString() {
		return "Company [compName=" + compName + ", addrs=" + addrs + ", type=" + type + "]";
	}
	
	
	
}
