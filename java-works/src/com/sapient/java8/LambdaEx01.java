package com.sapient.java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class LambdaEx01 {
public static void main(String[] args) {
	List<Integer> number=Arrays.asList(1,2,3,4,5,6);
	
	//old code
	for(Integer x:number)
	{
		System.out.println(x);
	}
	System.out.println("''''''''''''''''''''''''''");
	
	//java 8 way
	//1
	System.out.println("-------------------java 8 way ------------");
	number.forEach(x->System.out.println(x));
	
	//2
	System.out.println("-------------------java 8 way ------------");
	number.forEach(new Consumer<Integer>() {
		@Override
		public void accept(Integer t)
		{
			System.out.println(t);
		}
	});
	System.out.println("-------------------java 8 way - method ref ------------");

	
	number.forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
