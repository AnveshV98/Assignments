package com.yash.timedate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before formatting: "+now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);  
		System.out.println("After formatting: "+formatDateTime);
		// now()
		  LocalDateTime datetime1 = LocalDateTime.now();  
		    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		    String formatDateTime1 = datetime1.format(format1);   
		    System.out.println(formatDateTime1);    
		
	}

}
