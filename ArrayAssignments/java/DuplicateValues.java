package com.ArrayAssignments.java;

public class DuplicateValues {
	public static void main(String args[]) {
		
		
		  String[] products = {"bat", "ball", "bat", "stumps", "glouse", "ball", "helmet"};
		  
	        for (int i = 0; i < products.length-1; i++)
	        {
	            for (int j = i+1; j < products.length; j++)
	            {
	                if( (products[i].equals(products[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate products are : "+products[j]);
	                }
	            }
	        }
}
}
