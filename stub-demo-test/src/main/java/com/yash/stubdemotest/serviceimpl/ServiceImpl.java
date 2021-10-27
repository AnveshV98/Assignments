package com.yash.stubdemotest.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.yash.stubdemotest.service.Service;

public class ServiceImpl {
	
	public Service service;

	public ServiceImpl(Service service) {
		
		this.service = service;
	}

	public List<String> getData(String user){
		List<String> data = new ArrayList<String>();
		List<String> list1 = service.getList(user);
		
		for ( String list : list1) {
			if(list.contains("name")) {
				data.add(user);
			}
		}
			return data;
	
	}
	

	
}
