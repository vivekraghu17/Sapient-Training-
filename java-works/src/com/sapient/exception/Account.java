package com.sapient.exception;

public class Account {
	int balance ;
	public Account(int balance)
	{
		this.balance=balance;
		
	}
	public synchronized void  withDraw(int amount)
	{
		if(amount<balance)
		{
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Amount withdrawn"+amount+Thread.currentThread().getName()+"Your current balance is "+balance);
			balance=balance-amount;
			
		}
		else
		{
			System.out.println("ASorry : "+Thread.currentThread().getName()+"Amount L"+amount);
			System.out.println("Your current balance is "+balance);
		}
	}
}
