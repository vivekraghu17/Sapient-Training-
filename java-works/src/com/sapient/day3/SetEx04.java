package com.sapient.day3;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx04 {

public static void main(String[] args)
{
	Set<Device> set=new TreeSet<Device>(new Comparator<Device>() {
		
		@Override
		public int compare(Device o1,Device o2)
		{
			return (int)(o1.getdPrice()-o2.getdPrice());
		}
	});
	set.add(new Device(101,"Computer",700));
	set.add(new Device(34,"Laptop",700));
	set.add(new Device(55,"Mobile",700));
	set.add(new Device(66,"Watch",700));
	set.add(new Device(78,"Watch",700));

for(Device temp:set)
{
	System.out.println(temp+","+temp.hashCode());
}
}
}