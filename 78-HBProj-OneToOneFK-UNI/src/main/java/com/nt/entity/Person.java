package com.nt.entity;

import java.io.Serializable;


/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

/*@Getter
@Setter
@RequiredArgsConstructor*/
public class Person implements Serializable{
  private Integer pid;
  //@NonNull
  private String pname;
  //@NonNull
  private String addrs;
  
  public Person(String pname, String addrs) {
	this.pname=pname;
	this.addrs=addrs;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getAddrs() {
	return addrs;
}
public void setAddrs(String addrs) {
	this.addrs = addrs;
}

/*
 * public Person() { System.out.println("Person.0-param constructor"); }
 */
@Override
public String toString() {
	return "Person [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + "]";
}
  
  


}
