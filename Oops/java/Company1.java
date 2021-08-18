package com.Oops.java;

import java.util.ArrayList;
import java.util.List;

public class Company1 {
	
	
	 public static void main(String[] args)
	   {
	  
		 List<Employee3> row = new ArrayList<Employee3>();
		 row.add(new Employee3("Anvesh", "Trainee", 102));
		 row.add(new Employee3("Ravi", "Trainee", 103));
		 row.add(new Employee3("Aishwary", "Trainee", 104));
		 row.add(new Employee3("Dharmesh", "Trainee", 105));
		 
		 System.out.println("the size of the company is: " +row.size());
		 
	   } 

}

