package com.assignments.java.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Employee e = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("id: " + e.ID);
	      System.out.println("Name: " + e.name);
	      System.out.println("salary: " + e.salary);
	      System.out.println("desig: " + e.desig);
	      System.out.println("date_of_join: " + e.date_of_join);
	      
	}

}
