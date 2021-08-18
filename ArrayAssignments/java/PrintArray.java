package com.ArrayAssignments.java;

import java.util.Scanner;

public class PrintArray {
	
	public static void main ( String ar [])

	{
		
		    Scanner s = new Scanner(System.in);
		    int[] a = new int[20];
		    int pos = 0;
		    int neg = 0;
		    int odd = 0;
		    int even = 0;
		    int zero = 0;
		    for(int i = 0;i<a.length;i++){
		      System.out.println("Print the value of a["+i+"]");
		      a[i] = s.nextInt();

		      if(a[i]>0){
		        pos++;
		      }
		      else if(a[i]<0){
		        neg++;
		      }
		      else{
		        zero++;
		      }
		      if(a[i]%2==0){
		        even++;
		      }
		      else{
		        odd++;
		      }
		    }
		    System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even);
		  }
	        

}
