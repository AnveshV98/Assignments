package com.yash.basics.java;

public class SumOfNum {


	    static int sum(int Num, int X, int Y)
	    {
	        int S1, S2, S3;
	     
	        S1 = ((Num / X)) * (2 * X + (Num / X - 1) * X) / 2;
	        S2 = ((Num / Y)) * (2 * Y + (Num / Y - 1) * Y) / 2;
	        S3 = ((Num / (X * Y))) * (2 * (X * Y)
	                          + (Num / (X * Y) - 1) * (X * Y))/ 2;
	     
	        return S1 + S2 - S3;
	    }
	     
	   
	    public static void main(String []args)
	    {
	        int Num = 14;
	        int X = 3, Y = 5;
	     
	        System.out.println(sum(Num, X, Y));
	     
	    }
	  
	}


