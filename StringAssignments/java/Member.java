package com.StringAssignments.java;

public class Member {
	
	static String firstname;
	static String lastname;
	static String email;
	static String password;
	static String role;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		Member.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		Member.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		Member.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		Member.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		Member.role = role;
	}
	
	
	
	 void showMemberDetail(){
		
		 System.out.println(firstname+" "+lastname+" "+email+" "+password+" "+role);
		 
		
	}
	 
	 public static void main(String args[]) {
		 
		 Member m1 = new Member();
		 Member.firstname = "pankaj";
		 Member.lastname = "Sharma";
		 Member.email = "sharma.pankaj@yash.com";
		 Member.password ="1344560";
		 Member.role = "Trainer";
		 
		 System.out.println(firstname+" "+lastname+" "+email+" "+password+" "+role);
		 
	 }
	
	
	
    }



