package com.sapient.java8;

public class LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperation add=(a,b)->a+b;
		MathOperation sub=(a,b)->a-b;
		MathOperation mul=(a,b)->a*b;
		MathOperation div=(a,b)->a/b;
		
		System.out.println(add.Operation(10, 20));
		System.out.println(sub.Operation(10, 20));
		System.out.println(mul.Operation(10, 20));
		System.out.println(div.Operation(10, 20));
	
	System.out.println(operate(100,200,add));
	
	}
		private static int operate(int a,int b,MathOperation operationType)
		{
			return operationType.Operation(a,b);
		}

		
	}


