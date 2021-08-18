package com.yash.timedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateYstrdyTodayTmrw {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();  
	    LocalDate yesterday = date.minusDays(1);  
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow);  
	    //is Leap year
	    LocalDate date1 = LocalDate.of(2017, 1, 13);  
	    System.out.println(date1.isLeapYear());  
	    LocalDate date2 = LocalDate.of(2016, 9, 23);  
	    System.out.println(date2.isLeapYear());  
	    //atTime to combine date and time
	    
	    LocalDate date3 = LocalDate.of(2017, 1, 13);  
	    LocalDateTime datetime = date3.atTime(1,50,9);      
	    System.out.println(datetime);   
	    
	    //local time
	    LocalTime time = LocalTime.now();  
	    System.out.println(time);  
	    
	    //of()
	    
	    LocalTime time1 = LocalTime.of(11,47,12);  
	    System.out.println(time1); 
	    //minus hour and minus minutes
	    LocalTime time11 = LocalTime.of(10,43,12);  
	    System.out.println(time11);  
	    LocalTime time2=time11.minusHours(2);  
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println(time3);  
	    
	    //plus hours and plus minutes
	    LocalTime timea = LocalTime.of(10,43,12);  
	    System.out.println(timea);  
	    LocalTime timeb=timea.plusHours(4);  
	    LocalTime timec=timeb.plusMinutes(18);  
	    System.out.println(timec);  
	    
	    //zone time
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime time111 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time111);  
	    LocalTime time222 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time222);  
	    long hours = ChronoUnit.HOURS.between(time111, time222);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time111, time222);  
	    System.out.println("Minutes between two time zone: "+minutes);  
	    
	  }  

	}


