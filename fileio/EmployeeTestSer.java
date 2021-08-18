package com.assignments.java.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeTestSer {

	public static void main(String[] args) {
		
		Employee e = new Employee();
	
		  e.ID = 2;
	      e.name = "Reyan Ali";
	      e.salary = 50000;
	      e.desig = "trainee";
	      e.date_of_join = "01-02-21";
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }

	}

}
