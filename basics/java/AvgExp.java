package com.yash.basics.java;

public class AvgExp {

	    public static void main(String args[])
	    {
	        int a[] = {92,67,87,98,89,74};
	        int n=a.length;
	        double sum=0;
	        double average, percentage;
	        
	        for (int i = 0; i < a.length; i++) {
	            sum+=a[i];
	        }
	        System.out.println(sum);
	        average = sum/n;
	        percentage = (sum/(n*100)) * 100;
	        
	        
	        System.out.println("Average Marks = " +average);
	       
	        System.out.print("Percentage = " +percentage+ "%");
	    }
	}

