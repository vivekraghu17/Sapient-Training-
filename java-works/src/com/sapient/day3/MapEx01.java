package com.sapient.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set; 
public class MapEx01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Karteek", 1000);
		map.put("Siddhant", 1500);
		map.put("Srinidhi", 2000);
		map.put("Yatheesha", 2500);
		map.put("Nikith", 2200);
		
		System.out.println(map.get("Nikith"));
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> temp = (Entry<String, Integer>) itr.next();
			
			System.out.println(temp.getKey() + ", " + temp.getValue());
		}
	}
} 
 
