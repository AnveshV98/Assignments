package com.yash.ems.service_implimentation;
/**
 * For implementing the service class methods 
 * Performs ArrayList operations 
 */

import java.util.Iterator;
import java.util.stream.*;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

public class EmployeeServiceImp {

	EmployeeService es =new EmployeeService();
	public void getEmployeeList()
	{
		for(int i = 0; i < es.e.size(); i++) {
			System.out.println(es.e.get(i)); 
		}
	}

	
	public void getSize() {

		System.out.println(es.e.size());



	}
	public void getEmpSortId() {

		{
			System.out.println(    es.e.stream()
					.sorted((o1, o2) -> {
						if(o1.getId() == o2.getId())
							return o1.getName().compareTo(o2.getName());
						else if(o1.getId() > o2.getId())
							return 1;
						else return -1;
					})
					.collect(Collectors.toList()));

		}

	}

	public void getEmpSortSal() {
		System.out.println(    es.e.stream()
				.sorted((o1, o2) -> {
					if(o1.getSalary() == o2.getSalary())
						return o1.getName().compareTo(o2.getName());
					else if(o1.getSalary() > o2.getSalary())
						return 1;
					else return -1;
				})
				.collect(Collectors.toList()));

	}
}


