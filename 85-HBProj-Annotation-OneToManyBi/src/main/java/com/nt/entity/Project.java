package com.nt.entity;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/
@Entity
@Table(name="PROJECT_OTM_BI")
/*
 * @RequiredArgsConstructor
 * 
 * @Getter
 * 
 * @Setter
 */
public class Project  implements  Serializable {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "PROJ_ID_SEQ",allocationSize = 1,initialValue = 1000)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	@Type(type="long")
	private Long projId;
	
	@Column(length=20)
	@Type(type="string")
	//@NonNull
	private String projName;
	
	@Column(length=20)
	@Type(type="string")
	//@NonNull
	private String projType;
	
	@Type(type="int")
	//@NonNull
	private Integer teamSize;
	@ManyToOne(targetEntity = Company.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPANY_ID",referencedColumnName = "COMPID")
	private Company company;
	
	
	public Project(String projName, String projType, Integer teamSize) {
		super();
		this.projName = projName;
		this.projType = projType;
		this.teamSize = teamSize;
		
	}

	

	public Long getProjId() {
		return projId;
	}



	public void setProjId(Long projId) {
		this.projId = projId;
	}



	public String getProjName() {
		return projName;
	}



	public void setProjName(String projName) {
		this.projName = projName;
	}



	public String getProjType() {
		return projType;
	}



	public void setProjType(String projType) {
		this.projType = projType;
	}



	public Integer getTeamSize() {
		return teamSize;
	}



	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}



	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}



	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", projType=" + projType + ", teamSize="
				+ teamSize + "]";
	}
	
	

}
