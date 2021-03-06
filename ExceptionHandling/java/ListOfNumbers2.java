package com.ExceptionHandling.java;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Vector;

public class ListOfNumbers2 {
	
	 private Vector victor;
	    private static final int size = 10;

	    public ListOfNumbers2() {
	        victor = new Vector(size);
	        for (int i = 0; i < size; i++)
	            victor.addElement(new Integer(i));

		this.readList("D:\\STS4\\workspace1\\Assignments\\src\\com\\ExceptionHandling\\java\\anv.txt");
		this.writeList();
	    }

	    public void readList(String fileName) {
		String line = null;
		try {
		    RandomAccessFile raf = new RandomAccessFile(fileName, "r");
		    while ((line = raf.readLine()) != null) {
			Integer i = new Integer(Integer.parseInt(line));
			System.out.println(i);
			victor.addElement(i);
		    }
		} catch(FileNotFoundException fnf) {
		    System.err.println("File: " + fileName + " not found.");
		} catch (IOException io) {
		    System.err.println(io.toString());
		}
	    }

	    public void writeList() {
	        PrintWriter out = null;

	        try {
	            out = new PrintWriter(new FileWriter("D:\\STS4\\workspace1\\Assignments\\src\\com\\ExceptionHandling\\java\\anv.txt"));
	        
	            for (int i = 0; i < victor.size(); i++)
	                out.println("Value at: " + i + " = " + victor.elementAt(i));
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
					 e.getMessage());
	        } catch (IOException e) {
	            System.err.println("Caught IOException: " + e.getMessage());
	        } finally {
	            if (out != null) {
	                System.out.println("Closing PrintWriter");
	                out.close();
	            } else {
	                System.out.println("PrintWriter not open");
	            }
	        }
	    }

	    public static void main(String[] args) {
		new ListOfNumbers2();
	    }
	

}
