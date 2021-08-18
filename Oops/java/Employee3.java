package com.Oops.java;

public class Employee3 {
	
	String emp_Name;
	String emp_Designation;
	int emp_ID;
	
	
	
	
	public Employee3(String emp_Name, String emp_Designation, int emp_ID) {
		
		System.out.println(emp_Name+" "+emp_Designation+" "+emp_ID);
		
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Designation() {
		return emp_Designation;
	}
	public void setEmp_Designation(String emp_Designation) {
		this.emp_Designation = emp_Designation;
	}
	public int getEmp_ID() {
		return emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}
	public static String size() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
