
package com.StringAssignments.java;
import java.io.File;

public class Document {
	
	   public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		Document.title = title;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		Document.filepath = filepath;
	}
	private static String title;
	   private static String filepath;
	   
	 
	   void showDocumentInformation() {
		   
		  System.out.println(title); 
		   System.out.println(filepath);
	   }
	   
	   public static void main(String args[]) {
		   
		   Document d = new Document();
		   
		   Document.filepath = "c:/document/corejava/basics/introduction.pdf”;";
		   Document.title = "java basics";
		   
		   System.out.println(filepath);
		   System.out.println(title);
	   }
	   
	    }
	
