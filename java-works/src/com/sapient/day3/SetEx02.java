package com.sapient.day3;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {
public static void main(String[] args)
{
	Set<Device> set=new HashSet<Device>();
	set.add(new Device(101,"Computer",700));
	set.add(new Device(34,"Laptop",700));
	set.add(new Device(55,"Mobile",700));
	set.add(new Device(66,"Watch",700));
	set.add(new Device(78,"Watch",700));

System.out.println(set);
}
}
