package com.sapient.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx02 {
public static void main(String[] args)
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("Monitor");
	list.add("Computer");

	list.add("Bottle");
	list.add("Presenter");
	for(String temp:list)
	{
		System.out.println(temp);
	}

	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
}
}
