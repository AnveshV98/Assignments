package com.assignments.java.fileio;

import java.io.File;
import java.io.IOException;

/**
 * Create a folder Name it as company and store a file in it name it as basicInfo.txt which has
following information “welcome to the company”.Read the file and display the data in it.
 * @author velda
 *
 */

public class DisplayData {

	public static void main(String args[]) throws IOException {
	     
	      File directoryPath = new File("D:\\STS4\\workspace1\\Assignments\\src\\com\\assignments\\java\\fileio\\company");
	     
	      File filesList[] = directoryPath.listFiles();
	      System.out.println("List of files and directories in the specified directory:");
	      for(File file : filesList) {
	         System.out.println("File name: "+file.getName());
	         
	       
	      }
	   }

}
