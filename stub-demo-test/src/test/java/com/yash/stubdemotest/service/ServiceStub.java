package com.yash.stubdemotest.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ServiceStub implements Service{

	

	@Override
	public List<String> getList(String users) {
		
		return Arrays.asList(" my name is Anvesh ", "my name is Ravi ", " my name is Aishwary ", " my name is Dharmesh ");
	}

}
