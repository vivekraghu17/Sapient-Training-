package com.sapient.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		System.out.println("Time is "+cal.getTime());
		
		cal.add(Calendar.HOUR,5);
		System.out.println("Time is "+cal.getTime());

		//java8
		
		LocalTime now=LocalTime.now();
		System.out.println(now.getHour());
		LocalTime nowplusseven=now.plus(7,ChronoUnit.HOURS);
		System.out.println(nowplusseven.getHour());
		
		
		// add 30,12,45,23
		
		System.out.println("\''''''''''''''''''''''''''''''''/");
		ZoneId.getAvailableZoneIds().forEach(System.out::println);
		
		//america/chicago
		
		ZoneId chicagoZone=ZoneId.of("America/Chicago");
		LocalTime time1=LocalTime.now(chicagoZone);
		System.out.println("time in chicago"+time1);

	}

}
