package com.sapient.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DictEx01 {

	public static void main(String[] args)
	{
		Map<String, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Shubhodaya");
		list1.add("Bonjour");
		map.put("Good Morning",list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Shubhomadyana");
		list2.add("bonne après-midi");
		map.put("Good afternoon",list2);
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("Shubharatri");
		list3.add("bonne nuit");
		map.put("Good night",list3);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, ArrayList<String>> temp = (Entry<String, ArrayList<String>>) itr.next();
			
			System.out.println(temp.getKey() + ", " + temp.getValue());
		
		
		
		
	}
}
}