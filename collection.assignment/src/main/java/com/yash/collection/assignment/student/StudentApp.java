package com.yash.collection.assignment.student;

import java.util.Iterator;
import java.util.Vector;

import com.yash.collection.assignment.Hospital.Patient;

public class StudentApp {

	public static void main(String[] args) {
		 Vector<Student> v = new Vector<Student>();  
		 
		 v.add(new Student(1,"Ravi",7));
		 v.add(new Student(2,"Anvesh",8));
		 v.add(new Student(3,"Dharmesh",9));
		 
		 Iterator<Student> itr = v.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		 
			System.out.println("vector capacity :"+v.capacity());
			System.out.println("size of the objec: "+v.size());
			
			System.out.println("whether the specified element is present in the Vector: "+v.contains(6));
			System.out.println("second element: "+v.elementAt(2));
			System.out.println("set value at: "+v.set(2, null));
			Iterator<Student> itr1 = v.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			
	}

}
