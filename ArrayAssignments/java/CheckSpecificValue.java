package com.ArrayAssignments.java;

public class CheckSpecificValue {
	
	
	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] a = {7,3,4,6,7,8,9,10};
	           
	      System.out.println(contains(a, 7));
	      System.out.println(contains(a, 2));
	   }

}
