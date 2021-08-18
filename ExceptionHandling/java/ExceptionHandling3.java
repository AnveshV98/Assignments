package com.ExceptionHandling.java;

public class ExceptionHandling3 {
	
	public static void main(String args[]) {

	int array[] = null;  
    int arraySize = 4;  
    int arrayInc = -0;  
    int output;  
     
        try {  
              
         output = array[0]; // Generates a NullPointerException. 
         
        }catch(NullPointerException e) {
        	
        	System.out.println(e);
        }
        
        try {
        	array = new int[arraySize]; 
                                            // ArrayIndexOutOfBoundsException.  
            output = array[arraySize]; 
        	
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
        
        try {  
        	array = new int[5]; // Generate the  
                                                   // IndexOutOfBoundsException.  
            output = array[5];    
        }catch(IndexOutOfBoundsException e) {
        	
        	System.out.println(e);
        }
        
        try {  
        	array = new int[5]; 
        	Object newArray = new Integer(0); 
                                                            // ClassCastException.  
            System.out.println((String) newArray);    
        }catch( ClassCastException e) {
        	
        	System.out.println(e);
        }
        
        try {  
        	Object X[] = new String[-5]; // Generate the  
            // ArrayStoreException.  
            X[0] = new Integer(0);  
            System.out.println(X);    
        }catch( ArrayStoreException e) {
        	
        	System.out.println(e);
        }
        
	}	
	
}	
	
	
	
	
	