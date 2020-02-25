package com.sapient.exception;

class OtherBusinessLogic{}

class SomeBusinessLogic extends OtherBusinessLogic implements Runnable{

	
	private Thread thread;
	
	public SomeBusinessLogic() {}
	
	public SomeBusinessLogic(String name,int priority) {
		
		thread =new Thread(this);
		thread.setPriority(priority);
		
	    thread.setName(name);
	    thread.start();
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() started"+Thread.currentThread().getName());
		for(int i=0;i<1000;i++)
		{
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("Value of i in" +Thread.currentThread().getName()+"is"+i+" "+Thread.currentThread().getPriority());;
		}
		System.out.println("Thread Exiting "+Thread.currentThread().getName());
		
	}
	
}


public class ThreadExample02 {

	public static void main(String[] args)
	{
		SomeBusinessLogic sbl=new SomeBusinessLogic("mobile",6);
		SomeBusinessLogic sb2=new SomeBusinessLogic("monitor",7);
		SomeBusinessLogic sb3=new SomeBusinessLogic("laptop",8);

		Thread th1=new Thread(new SomeBusinessLogic(),"Bottle");
		th1.setPriority(10);
		th1.start();
	}
}
