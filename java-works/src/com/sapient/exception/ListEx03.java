package com.sapient.exception;

import java.util.Vector;

public class ListEx03 {
	//vector
	//request for memory location for the compiler is decreased
	
	public static void main(String[] args)
	{
		Vector<String> vector = new Vector<String>(7, 6);
		
		System.out.println("Initial Vector"+vector);
		System.out.println("Initial size"+vector.size());
		//capcity method is defined only in vector class not in collecion interface
		System.out.println("Initial capacity"+vector.capacity());
		
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		vector.add("Six");

		
		System.out.println("After inserting");
		System.out.println("Initial Vector"+vector);
		System.out.println("Initial size"+vector.size());
		//capcity method is defined only in vector class not in collecion interface
		System.out.println("Initial capacity"+vector.capacity());
		

		
	}
	

}
