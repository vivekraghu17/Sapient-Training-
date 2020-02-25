package com.sapient.exception;

public class SynchTest implements Runnable {
	
	private Thread thread;
	private int amount;
	private Account account;
	
	public SynchTest(String name,int amount,Account account)
	{
		this.account=account;
		this.amount=amount;
		thread=new Thread(this,name);
		thread.start();
		
	}
	
	public static void main(String[] args)
	{
		Account account=new Account(1000);
		SynchTest s1=new SynchTest("Mr A",500,account);
		SynchTest s2=new SynchTest("Mr B",700,account);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			account.withDraw(amount);

			
		
		
		
		
	}

}
