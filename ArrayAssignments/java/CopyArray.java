package com.ArrayAssignments.java;

public class CopyArray {
	
	static void printArray(int arr[], int len)
	{
	    int i;
	    for (i = 0; i < len; i++)
	    {
	        System.out.printf("%d ", arr[i]);
	    }
	}
	 

	public static void main(String[] args)
	{
	    int original_arr[] = {1, 2, 3, 4, 5};
	    int len = original_arr.length;
	    int copied_arr[] = new int[len], i, j;
	    
	    for (i = 0; i < len; i++)
	    {
	        copied_arr[i] = original_arr[len - i - 1];
	    }
	 
	    
	    System.out.printf("\nOriginal array: ");
	    printArray(original_arr, len);
	 
	    System.out.printf("\nResultant array: ");
	    printArray(copied_arr, len);
	    }

}
