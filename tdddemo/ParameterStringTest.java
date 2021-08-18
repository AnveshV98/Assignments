package com.yash.tdddemo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterStringTest {
	
	@ParameterizedTest
	
	@ValueSource(strings = {"racecar", "radar"})
	void palindromes(String candidate) {
	  Assertions.assertTrue(StringUtils.isPalindrome(candidate));
	}
	

}
