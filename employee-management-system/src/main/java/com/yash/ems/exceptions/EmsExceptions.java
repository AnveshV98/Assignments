package com.yash.ems.exceptions;
/**
 * Exception class which is used used to handled the below exceptions
 */

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

public class EmsExceptions {

	EmployeeService es =new EmployeeService();

	public void getEmployeeByLocation() {

		System.out.println("enter location: ");
		Scanner sc = new Scanner(System.in);         
		String loca = sc.nextLine();



		List<Employee> list = 
				es.e.stream()
				.filter(loc->loc.getLocation()
						.equals(loca))
				.collect(Collectors.toList());        



		if(list.size()==0) {
			try {    
				throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Entered location not found: "+e);
			}
		}
		else System.out.println(list);
	}

	public void getEmployeeByName() {
		System.out.println("enter name: ");
		Scanner sc = new Scanner(System.in);         
		String name = sc.nextLine();

		List<Employee> list1 = es.e.stream() 
				.filter(name1->name1.getName().equals(name))
				.collect(Collectors.toList());
		if(list1.size()==0) {
			try {
				throw new Exception();
			}catch(Exception e) {
				System.out.println("Entered element not found: "+e);
			}
		}
		else {
			System.out.println(list1);
		}

	}

}
