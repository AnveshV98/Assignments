package com.yash.tdddemo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MathCalculationTest{
	
	MathCalculator c = new MathCalculator();
	
	@Test
	public void test_AddMethod_GivenValues_ShouldReturn_Addition() {
		int expected = 2;
		int actual = c.add(1,1);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test_MultiplyMethod_GivenValues_ShouldResturn_Multiplication() {
		
		int expected = 6;
		int actual = c.multiply(2,3);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test_SubstractMethod_GivenValues_ShouldReturn_Substraction() {
		
		int expected = 3;
		int actual = c.substract(5,2);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void test_DivideMethod_GivenValues_ShouldReturn_Division() {
		int expected = 8;
		int actual = c.divide(16,2);
		Assertions.assertEquals(expected, actual);
	}
	
}

