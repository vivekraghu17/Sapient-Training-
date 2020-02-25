package com.sapient.exception;

public class ExceptionEx01 {
	public static void main(String[] args)
	{
		try {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			int result=num1/num2;
			
			try {
				int[] arr=new int[-5];
			}catch(NegativeArraySizeException nase){
				nase.printStackTrace();
				
			}
			
			
			
			
			
			System.out.println("Result is "+result);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
			
		}
		catch(NumberFormatException nfe)
		{
			nfe.printStackTrace();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			//100% exceution 
			System.out.println("Finally is here");
			
		}
		
		System.out.println("I am other business logic");
	}

}
