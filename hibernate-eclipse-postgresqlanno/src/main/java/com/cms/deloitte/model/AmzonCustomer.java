package com.cms.deloitte.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AmzonCustomer")
public class AmzonCustomer {
	@Id
	@GeneratedValue
	@Column
	private int customerid;
	@Column
	private String customer;
	@Column
	private String emailId;
	@OneToMany(mappedBy = "amazonCustomer")
	private Set<CardDetail> cardDetails=new HashSet<CardDetail>();
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Set<CardDetail> getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(Set<CardDetail> cardDetails) {
		this.cardDetails = cardDetails;
	}
	

}
