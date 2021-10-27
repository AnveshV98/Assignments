package com.yash.hibexml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class CustomerApp {
	public static void main(String[] args) {
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction(); 
		
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("Anvesh");
		c.setProduct("pc");
		
		session.save(c);
		t.commit();
		
		System.out.println("inserted");
	
		
	}

}
