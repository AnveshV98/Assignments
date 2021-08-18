package com.assignments.java.fileio;

import java.io.File;

public class GetListOfFiles {

	public static void main(String[] args) {
		// creates a file object
	    File file = new File("D:\\STS4\\workspace1\\Assignments\\src\\com\\assignments\\java\\fileio\\company");

	    // returns an array of all files
	    String[] fileList = file.list();

	    for(String str : fileList) {
	      System.out.println(str);
	    }

	}

}
