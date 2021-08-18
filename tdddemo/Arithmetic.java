package com.yash.tdddemo;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class Arithmetic {
	
	
	void Square() {
		int s=4;
		int area_square=s*s;
		
		System.out.println("Area of the square="+area_square);
	}
	public void test_SquareMethod_GivenValues_ShouldReturn_() {
		int expected = 16;
		int actual = a.Square(4,4);
		Assert.assertEquals(expected, actual);
		}
	
}


