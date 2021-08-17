package com.yash.ems.main;
/**
 * This is main method, where execution starts
 * 
 */

import java.util.Scanner;

import com.yash.ems.exceptions.EmsExceptions;
import com.yash.ems.service_implimentation.EmployeeServiceImp;

public class EmployeeApp {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("*******EMPLOYEE MANAGEMENT SYSTEM*********");
		System.out.println("Select Any Option: ");
		
		EmployeeServiceImp esi = new EmployeeServiceImp();
		EmsExceptions ese = new EmsExceptions();
		
		
		while(true){
			System.out.println("get Employee list, Enter 1");
			System.out.println("get employee by location, Enter 2");
			System.out.println("get employee by name, Enter 3");
			System.out.println("sort by employee ID, Enter 4");
			System.out.println("sort by employee Salary, Enter 5");
			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("employee list");
			esi.getEmployeeList();
			break;
			case 2: System.out.println("employee by location");
 			ese.getEmployeeByLocation();
			break;
			case 3: System.out.println("employee by name");
 			ese.getEmployeeByName();
			break;
	
			case 4: System.out.println("sort by emp ID");
			esi.getEmpSortId();
			break;			
			case 5: System.out.println("sort by emp salary");
			esi.getEmpSortSal();
			break;
			case 9: System.out.println("Thanks for Using EMS ");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input, Please reenter your choice from menu:");

			}
		}
		
	}

}
