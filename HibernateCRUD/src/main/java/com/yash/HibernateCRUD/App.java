package com.yash.HibernateCRUD;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	   Employee emp= new Employee();
//           emp.setId(102);
//           emp.setName("dharmesh");
//           emp.setSalary(30000);
           
          
           
           
           Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
           
           ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
           
           SessionFactory sf= con.buildSessionFactory(reg);
           
           Session session= sf.openSession();
           
           
           Transaction tx = session.beginTransaction();
           
         //  session.save(emp);
        //   session.delete(emp);
         //  session.update(emp);
          //  System.out.println(emp);
//            reading the table
         
           Query query=session.createQuery("from Employee");
        
           Iterator it = query.iterate();       
         while(it.hasNext())
         {
         Employee emp1 = (Employee)it.next();
          System.out.println("Id::--"+emp1.getId()+"name::--"+emp1.getName()+"Salary::--"+emp1.getSalary());
         }
           
         
           
          // tx.commit();
    }
}
