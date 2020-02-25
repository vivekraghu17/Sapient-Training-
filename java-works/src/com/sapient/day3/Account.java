package com.sapient.day3;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
@Builder



public class Account implements Serializable {
	public Account(int accId, double accBalance, String accHolderName) {
		super();
		this.accId = accId;
		this.accBalance = accBalance;
		this.accHolderName = accHolderName;
	}


	private int accId;
	private double accBalance;
	private String accHolderName;
	
	
	public Account() {}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public int getAccId() {
		return accId;
	}


	public void setAccId(int accId) {
		this.accId = accId;
	}


	public double getAccBalance() {
		return accBalance;
	}


	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}


	public String getAccHolderName() {
		return accHolderName;
	}


	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	
	
	

}
