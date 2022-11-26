package com.hibernate;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppFetchEagerLazy {

	public static void main(String[] args) 
	{
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Employee e1 = session.get(Employee.class, 1);
		
		System.out.println(e1.getEname());
//		Collection<Computer> computers = e1.getComputer();
//		
//		for(Computer c : computers)
//		{
//			System.out.println(c);
//		}
		
		session.getTransaction().commit();

	}

}
