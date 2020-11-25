package com.nt.entity;

import java.io.Serializable;

import java.time.LocalDate;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

/*@Getter
@Setter
@RequiredArgsConstructor*/
public class LibraryMembership implements Serializable {
	private Integer lid;
	//@NonNull
	private String type;
	//@NonNull
	private  LocalDate  startDate;
	//@NonNull
	private  LocalDate endDate;
	private Student studentDetails;
	
	
	  public LibraryMembership() {
	  System.out.println("LibraryMembership:: 0-param constructor"); }
	 

	public LibraryMembership(String type,LocalDate startDate, LocalDate endDate) {
	    this.type=type;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Student getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(Student studentDetails) {
		this.studentDetails = studentDetails;
	}

	@Override
	public String toString() {
		return "LibraryMembership [lid=" + lid + ", type=" + type + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
	
	
	

}
