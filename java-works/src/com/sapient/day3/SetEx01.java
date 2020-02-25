package com.sapient.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {
//hascode to sesrch for a value in set
//equals to compare for the values to be added in set
	
	
	public static void main(String[] args)
	{
		Set<String> set=new HashSet<String>();
		set.add("Lenovo");
		set.add("Dell");
		set.add("Microsoft");
		set.add("Mac");
		set.add("Mac");
		set.add("Mac");
		set.add("Mac");
		
	System.out.println(set);
	}
}
