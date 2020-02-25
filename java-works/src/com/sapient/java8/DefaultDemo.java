package com.sapient.java8;
interface IFirst{
	public void hi();
	default void logs() {
		System.out.println("HI log from first");
	
	}
	
	
	//you can access because in java you dont have to create an object of the class or interface to access
	
	public static void callMeFirst() {
		
	}
}

interface ISecond{
	default void logs() {
		System.out.println("Hi from the second");
	}
}


class MyJob implements IFirst,ISecond{
	public void logs()
	{
		System.out.println("Hi this log is form myjob");
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("hi from hi");
		
	}
}

public class DefaultDemo {
	public static void main(String[] args) {
		IFirst.callMeFirst();
	}

}
