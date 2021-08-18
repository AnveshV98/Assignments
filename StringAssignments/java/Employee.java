package com.StringAssignments.java;
import java.util.Scanner;


public class Employee {
	
	
	 String firstName;

	 String lastName; 
	 
	 String companyName;

	 String role;

	  Employee (String firstName, String lastName, String companyName, String role){

	 

	 this.firstName=firstName; 
	 this.lastName=lastName;

	 this.companyName = companyName;

	 this.role=role;
	  }

	 String generatePassword() {

	 String str=firstName.substring(0,2).concat(lastName.substring(0, 2)).concat(companyName.substring(0, 2)).concat(role.substring(0,2));


	 return str;

	 }
	 
	 
public static void main(String[] args) {

	 Scanner sc=new Scanner(System.in);

	 String firstName=sc.nextLine();

	 String lastName= sc.nextLine();
	 String companyName=sc.nextLine();

	 String role=sc.nextLine();

	 Employee e1 = new Employee(firstName,lastName,companyName,role);

	 String res = e1.generatePassword();

	 System.out.println(res);
}

}
