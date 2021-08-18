package com.StringAssignments.java;

public class Section {
	
	static String id;
	static String name;
	static String createdDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		Section.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Section.name = name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		Section.createdDate = createdDate;
	}
	
	void showSectionDetail(){
		
		System.out.println(id+" "+name+" "+createdDate);
		
		
	}
	
	public static void main(String args[]) {
		
		Section s1 = new Section();
		Section.id = "101";
		Section.name = "core_java";
		Section.createdDate = "31-01-2017";
		System.out.println(id+" "+name+" "+createdDate);
		
	}

}


