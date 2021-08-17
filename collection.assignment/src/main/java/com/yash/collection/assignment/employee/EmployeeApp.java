package com.yash.collection.assignment.employee;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeApp {

	public static void main(String[] args) {
		
		
	
		
		Map<Integer,Employee> e = new HashMap<Integer,Employee>();
		e.put(1, new Employee(1,"Ravi",24000,"trainee","development"));
		e.put(2, new Employee(2,"anvesh",24000,"trainee","development"));
		e.put(3, new Employee(3,"dharmesh",24000,"trainee","development"));
		e.put(4, new Employee(4,"anuj",24000,"trainee","development"));
		Set<Integer> keySet= e.keySet();
	    for(int i:keySet){
	        System.out.println(e.get(i));
	    }
	    System.out.println("The size of the map is " + e.size());
	    System.out.println("is the map is empty: "+e.isEmpty());
	    boolean flag = e.containsKey(2);
	    System.out.println("Key 2 exists in HashMap? : " + flag);
	   System.out.println(e.equals("Ravi"));
	   System.out.println("search by Value of employee is: " +e.get(4));
	
	 try {
         FileOutputStream myFileOutStream
             = new FileOutputStream(
                 "C:\\Users\\anvesh.veldhandi\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\collection.assignment\\target\\data.ser");

         ObjectOutputStream myObjectOutStream
             = new ObjectOutputStream(myFileOutStream);

         myObjectOutStream.writeObject(e);

         // closing FileOutputStream and
         // ObjectOutputStream
         myObjectOutStream.close();
         myFileOutStream.close();
     }
     catch (IOException e1) {
         e1.printStackTrace();
     }
	}
}
