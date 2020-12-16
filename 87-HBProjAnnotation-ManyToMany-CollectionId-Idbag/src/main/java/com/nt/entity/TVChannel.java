package com.nt.entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

@Entity
@Table(name="TVCHANNEL_MTOM_IDBAG")
/*
 * @Setter
 * 
 * @Getter
 * 
 * @RequiredArgsConstructor
 */
public class TVChannel implements Serializable{
	@Id
	@GeneratedValue
	@Type(type="int")
	private Integer channelId;
	
	@Type(type="string")
	@Column(length=15)
	//@NonNull
	private String channelName;
	
	@Type(type="string")
	@Column(length=25)
	//@NonNull
	private  String  company;
	
	@Type(type="string")
	@Column(length=25)
	//@NonNull
	private  String  location;
	
	@ManyToMany(targetEntity = Subscriber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy="channels")
	
	private List<Subscriber> subscribers;
	
	

	public TVChannel(String channelName, String company, String location) {
		
		this.channelName = channelName;
		this.company = company;
		this.location = location;
	}
	



	public Integer getChannelId() {
		return channelId;
	}




	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}




	public String getChannelName() {
		return channelName;
	}




	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}




	public String getCompany() {
		return company;
	}




	public void setCompany(String company) {
		this.company = company;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public List<Subscriber> getSubscribers() {
		return subscribers;
	}




	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}




	@Override
	public String toString() {
		return "TVChannel [channelId=" + channelId + ", channelName=" + channelName + ", company=" + company
				+ ", location=" + location + "]";
	}
	 
	 
	

}
