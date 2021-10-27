package com.yash.main;
/**
 * implementing cashing /level 1 and level 2
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.yash.model.Car;

public class CarApp {
	public static void main(String[] args) {
		Car c =new Car();
//		
//		c.setCar_no(103);
//		c.setCar_name("ferrari");
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Car.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
        
        SessionFactory sf= con.buildSessionFactory(reg);
        
        Session session1= sf.openSession();
        
        session1.beginTransaction();
//        session1.save(c);
        
        c=(Car)session1.get(Car.class, 2);
       
        System.out.println(c);
                                         
        
        
        Session session2= sf.openSession();
        
        session2.beginTransaction();
        
        //level 1 cashing
        c=(Car)session2.get(Car.class, 2);
        
        System.out.println(c);
        session2.getTransaction().commit();
        
        
        
        
	}

}
