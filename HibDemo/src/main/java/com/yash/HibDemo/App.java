package com.yash.HibDemo;

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
        Student student= new Student();
        student.setStud_id(109);
        student.setStud_name("prabhas");
        student.setStud_age(27);
        
        
        Address address = new Address();
        address.setStreet("peddammagudi");
        address.setCity("Hyderabad");
        address.setState("Telangana");
        address.setPincode("500070");
        student.getLisOfAddresses().add(address);
        
        Address address1=new Address();
        address1.setStreet("banjarahills");
        address1.setCity("hyd");
        address1.setState("Telangana");
        address1.setPincode("500003");
        
        student.getLisOfAddresses().add(address1);
      
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
        
        SessionFactory sf= con.buildSessionFactory(reg);
        
        Session session= sf.openSession();
        
        
        Transaction tx = session.beginTransaction();
        session.save(student);
        System.out.println("inserted successfully");
        tx.commit();
    }
}
