package com.yash.collection.assignment.shopping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ShoppingApp {

	public static void main(String[] args)  {
		HashSet<Product> p = new HashSet<Product>();
		p.add(new Product(1,"laptop",45000.5));
		p.add(new Product(2,"mobile",20000.6));
		p.add(new Product(3,"camera",65000.7));
		p.add(new Product(4,"tablet",25000.7));
		p.add(new Product(5,"table",5000.7));
		p.add(new Product(6,"bed",35000.0));
		//allows only single null
		p.add(null);
		p.add(null);
		p.add(new Product(2,"mobile",20000.6));   //implement equals method
		p.add(new Product(1,"laptop",45000.5));
		
		
		
		Iterator<Product> itr = p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("size of list: " +p.size());
		
		
	
		HashSet<Product> p1 = new HashSet<Product>();
		p1=(HashSet<Product>)p.clone();
		System.out.println("after clone method:");
		Iterator<Product> itr1 = p1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		 try {
			 System.out.println("first element"+p1.stream().findFirst().get());
			 
			 
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	
		
		 
	}

}
