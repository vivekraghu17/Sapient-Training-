package com.sapient.exception;

import java.util.ArrayList;

public class ListEx01 {
	
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add("Hi");
		list.add(true);
		list.add(23.4);
		list.add(new Object());
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
	}

}
