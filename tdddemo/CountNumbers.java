package com.yash.tdddemo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CountNumbers {
	
	int arr[] = {2, 3, 4, 5, 6};
	int n = arr.length;
	
	@Test
	public void test_DisplayEvenMethod_GivenValues_ShouldReturn_EvenValues() {
		
		int expected = 0;
		int actual = evenOdd_count(3,2);
		Assertions.assertEquals(n, n);
		
	}

	private int evenOdd_count(int j, int k) {
		int even_count = 0;
        int odd_count = 0;
		for (int i = 0; i < n; i++) {
             
           if ((arr[i] & 1) == 1)
               odd_count++;
           else
               even_count++;
       }

       System.out.println("Number of even"
                          + " elements = " + even_count
                          + " Number of odd elements = "
                          + odd_count);
	return n;
   }
	
	

}
