package com.Oops.java;

import java.util.ArrayList;
import java.util.List;

public class HostelStudents {

	public static void main(String[] args) {
		
		
		 List<Hostel> h = new ArrayList<Hostel>();
		 h.add(new Hostel("First year", "Anvesh", 50));
		 h.add(new Hostel("second year", "ravi", 40));
		 h.add(new Hostel("third year", "dharmesh", 60));
		 h.add(new Hostel("second year", "Aishwary", 75));
		 
		 System.out.println("Number of Students Registerd are: " +h.size());

	}

}
