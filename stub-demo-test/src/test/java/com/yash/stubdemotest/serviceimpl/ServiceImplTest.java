package com.yash.stubdemotest.serviceimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yash.stubdemotest.service.Service;
import com.yash.stubdemotest.service.ServiceStub;

public class ServiceImplTest {

	@Test
	public void test() {
		Service serviceStub = new ServiceStub();
		ServiceImpl serviceImpl = new ServiceImpl(serviceStub);
		
		List<String> data = serviceImpl.getData("");
		
		assertEquals(4, data.size());
		System.out.println("stub is working correctly");
		
	}


}
