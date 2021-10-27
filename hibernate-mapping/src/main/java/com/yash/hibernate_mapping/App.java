package com.yash.hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Laptop laptop=new Laptop();
        laptop.setLid(113);
        laptop.setLname("asus");
        
//        Laptop laptop1=new Laptop();
//        laptop1.setLid(111);
//        laptop1.setLname("macpro");
        
        Student student=new Student();
        student.setName("Ram");
        student.setRollno(9);
        student.setMarks(60);
        student.getLaptop().add(laptop);
//        student.getLaptop().add(laptop1);
        
        laptop.getStudent().add(student);
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
        
        SessionFactory sf= con.buildSessionFactory(reg);
        
        Session session= sf.openSession();
        
        session.beginTransaction();
        session.save(laptop);
        session.save(student);
        
        session.getTransaction().commit();
        
        
    }
}
