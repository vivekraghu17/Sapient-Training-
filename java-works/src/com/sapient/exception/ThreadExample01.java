package com.sapient.exception;

//by extending the class from thread class you notify jvm + os that 
// a new parallel new job is created and start()

class BusinessLogic extends Thread{
	@Override
	public void run()
	{
		System.out.println("run() started"+Thread.currentThread().getName());
		for(int i=0;i<1000;i++)
			System.out.println("Value of i in" +Thread.currentThread().getName()+"is"+i);
		
		System.out.println("Exciting Thread"+Thread.currentThread().getName());
	}
}






public class ThreadExample01 {
//if the class has main method then it is the first thread
	public static void main(String[] args)
	{
		System.out.println("Thread name= "+Thread.currentThread().getName());
		System.out.println("Thread priority= "+Thread.currentThread().getPriority());
		BusinessLogic bl=new BusinessLogic();
		//will create the thread and does OS jobs 
		//Implicitly async output is not predictable
		bl.start();
		
		
		BusinessLogic bl1=new BusinessLogic();
		bl1.setName("Pavan");
		bl1.setPriority(Thread.MAX_PRIORITY);
		bl1.start();
		
		BusinessLogic bl2=new BusinessLogic();
		bl2.setName("Sharath");
		bl2.setPriority(bl1.getPriority()-1);
		bl2.start();
		
		
		
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////
		System.out.println("run() started"+Thread.currentThread().getName());
		for(int i=0;i<1000;i++)
			System.out.println("Value of i in" +Thread.currentThread().getName()+"is"+i);
		
		try{
			bl.join();
		
		bl1.join();
		bl2.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("Exciting Thread"+Thread.currentThread().getName());
	
		/////////////////////////////////////////////////////////////////////////////////////
		
	}
}
