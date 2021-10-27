package com.yash.main;
/**
 * implementing cascading and criteria api
 */

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import com.yash.model.Customer;
import com.yash.model.Product;

public class CustomerApp {

	public static void main(String[] args) {
		
		Product p=new Product();
//		p.setProd_id(102);
//		p.setProd_name("mobile");
		
		Customer cust=new Customer();
//		cust.setName("Anvesh");
//		cust.setProduct(p);
		
		 Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Product.class);
	        
	        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
	        
	        SessionFactory sf= con.buildSessionFactory(reg);
	        
	        Session session= sf.openSession();
	        
	        session.beginTransaction();
//	        session.save(p);
//	        session.save(cust);
	        
	        
	        //criteria api
	        Criteria cr = session.createCriteria(Customer.class);
	        List<Customer> results = cr.list();
	        //fetching all the records
	        for (Iterator iterator = results.iterator(); iterator.hasNext();) {
				Customer customer = (Customer) iterator.next();
				System.out.println("id: "+customer.getId()+"name: "+customer.getName());
			}
	        
	        //fetching the row count
	        cr.setProjection(Projections.rowCount());
	         List result = cr.list();

	         System.out.println("Total Count: " + result.get(0) );
	        
	        session.getTransaction().commit();

	}

}
