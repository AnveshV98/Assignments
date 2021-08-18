package com.assignments.java.fileio;

import java.io.File;

public class ReadOnlyMode {

	public static void main(String[] args) {
		
		File myfile = new File("D:\\STS4\\workspace1\\Assignments\\src\\com\\assignments\\java\\fileio\\company\\basicInfo.txt");	
		
    	//making the file read only
    	boolean flag = myfile.setReadOnly();	
    	if (flag==true)
    	{
    	   System.out.println("File successfully converted to Read only mode!!");
    	}
    	else
    	{
    	   System.out.println("Unsuccessful Operation!!");
    	}
	}

}
