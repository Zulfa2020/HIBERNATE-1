package com.nt.entity;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/*import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;*/

@Entity
@Table(name="SUBSCRIBER_MTOM")
/*
 * @Setter
 * 
 * @Getter
 * 
 * @RequiredArgsConstructor
 */
public class Subscriber  implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "sub_id_seq",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer subscriberId;
	@Column(length=20)
	@Type(type="string")
	//@NonNull
	private String  subscriberName;
	@Column(length=20)
	@Type(type="string")
	//@NonNull
	private String  subscriberType;
	@Column(length=20)
	@Type(type="string")
	//@NonNull
	private String  subscriberLocation;
	@ManyToMany(targetEntity = TVChannel.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="TVCHANNEL_SUBSCRIBER_MTOM",
	                     joinColumns = @JoinColumn(name ="SUBSCRIBER_ID",referencedColumnName = "SUBSCRIBERID" ),  //owning side fk col
	                     inverseJoinColumns = @JoinColumn(name ="CHANNEL_ID",referencedColumnName = "CHANNELID" )  // non-owning side fk  col
	                    )
	private Set<TVChannel> channels;
	
	

	public Subscriber(String subscriberName, String subscriberType, String subscriberLocation) {
		
		this.subscriberName = subscriberName;
		this.subscriberType = subscriberType;
		this.subscriberLocation = subscriberLocation;
	}



	public Integer getSubscriberId() {
		return subscriberId;
	}



	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}



	public String getSubscriberName() {
		return subscriberName;
	}



	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}



	public String getSubscriberType() {
		return subscriberType;
	}



	public void setSubscriberType(String subscriberType) {
		this.subscriberType = subscriberType;
	}



	public String getSubscriberLocation() {
		return subscriberLocation;
	}



	public void setSubscriberLocation(String subscriberLocation) {
		this.subscriberLocation = subscriberLocation;
	}



	public Set<TVChannel> getChannels() {
		return channels;
	}



	public void setChannels(Set<TVChannel> channels) {
		this.channels = channels;
	}



	@Override
	public String toString() {
		return "Subscriber [subscriberId=" + subscriberId + ", subscriberName=" + subscriberName + ", subscriberType="
				+ subscriberType + ", subscriberLocation=" + subscriberLocation + "]";
	}
	
	
	
	

}
