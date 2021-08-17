package com.yash.collection.assignment.Hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import com.yash.collection.assignment.shopping.Product;

public class HealthCheckupApp {

	public static void main(String[] args) {
		Set<Patient> s = new LinkedHashSet<Patient>();
		s.add(new Patient(1,"ravi",20));
		s.add(new Patient(2,"anvesh",23));
		s.add(new Patient(3,"aishwary",27));
		s.add(new Patient(4,"anuj",28));
		s.add(new Patient(5,"dharmesh",18));

		Iterator<Patient> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		LinkedList<Patient> l = new LinkedList<Patient>(s);
		System.out.println("first patient from the list: "+l.getFirst());
		System.out.println("last patient from the list: "+l.getLast());
		
		System.out.println(" ****first five elements*********** ");
		for(int num=0; num<5;num++) {
			System.out.println(l.get(num));
		}
		
	}
	

}
