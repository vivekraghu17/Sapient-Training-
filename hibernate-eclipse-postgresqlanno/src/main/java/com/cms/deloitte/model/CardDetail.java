package com.cms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="CardDetail")
public class CardDetail {
	
	
	@Id
	@GeneratedValue
	@Column
	
	private int cardId;
	@Column

	private String bankname;
	@Column

	private int cardNo;

	@ManyToOne
	@JoinColumn(name="customerid")
	private AmzonCustomer amazonCustomer;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public AmzonCustomer getAmazonCustomer() {
		return amazonCustomer;
	}

	public void setAmazonCustomer(AmzonCustomer amazonCustomer) {
		this.amazonCustomer = amazonCustomer;
	}
	
	
	

}
