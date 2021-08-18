package com.yash.inheritance_polymorphism;

public class Employee1 extends Person1 {
	
	

		private String employeeName;
		private int JoiningYear;
		private double AnnualSalary;
		private String NatInsNum;
		public Employee1(String employeeName, int JoiningYear, double AnnualSalary, String NatInsNum) {
			super();
			this.employeeName = employeeName;
			this.JoiningYear = JoiningYear;
			this.AnnualSalary = AnnualSalary;
			this.NatInsNum = NatInsNum;
		}
		
		void print() {
			
			System.out.println(employeeName+" "+JoiningYear+" "+AnnualSalary+" "+NatInsNum);
			
		}
		
		

}
