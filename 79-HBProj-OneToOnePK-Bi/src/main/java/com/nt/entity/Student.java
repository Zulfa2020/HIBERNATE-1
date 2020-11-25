package com.nt.entity;

import java.io.Serializable;


/*import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

/*@Setter
@Getter
@RequiredArgsConstructor*/
public class Student implements Serializable {
	private  Integer sid;
	//@NonNull
	private  String sname;
	//@NonNull
	private  String  sadd;
	private LibraryMembership libraryDetails;
	
	
	  public Student() { System.out.println("Student:: 0-param constructor"); }
	 

	public Student(String sname, String sadd) {
	
		this.sname = sname;
		this.sadd = sadd;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public LibraryMembership getLibraryDetails() {
		return libraryDetails;
	}

	public void setLibraryDetails(LibraryMembership libraryDetails) {
		this.libraryDetails = libraryDetails;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
	}

}
