//Person.java (parent class)
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
import lombok.Setter;*/

/*@Getter
@Setter
@RequiredArgsConstructor*/
@Entity
@Table(name="PERSON_ANNO_OTO")
public class Person implements Serializable{
	@Id
	@Type(type="int")
	@GeneratedValue
  private Integer pid;
  //@NonNull
  @Column(length=15)
  @Type(type="string")
  private String pname;
  
  //@NonNull
  @Column(length=15)
  @Type(type="string")
  private String addrs;

 
  
public Person(String pname, String addrs) {
	this.pname = pname;
	this.addrs = addrs;
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




@Override
public String toString() {
	return "Person [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + "]";
}

}
