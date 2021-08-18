package com.StringAssignments.java;

public class Catagory {
	
	static String id;
	static String name;
	static String createdDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		Catagory.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Catagory.name = name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		Catagory.createdDate = createdDate;
	}
	
	void showCategoryDetail(){
		
		System.out.println(id+" "+name+" "+createdDate);
	}
	
	public static  void main(String args[]) {
		
		Catagory c1 = new Catagory();
		Catagory.id = "101";
		Catagory.name = "java_basics";
		Catagory.createdDate = "31-01-2017";
		
		System.out.println(id+" "+name+" "+createdDate);
		
	}

	

}
