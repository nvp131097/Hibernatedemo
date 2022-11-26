package com.hibernate1;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AppSQL {

	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate_hql.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		
		NativeQuery<Worker> query = session.createSQLQuery("select * from worker where number > 80");
		query.addEntity(Worker.class);
		List<Worker> workers = query.list();
		for(Object o:workers)
		{
			System.out.println(o);
		}
		
//		SQLQuery query = session.createSQLQuery("select * from worker where number > 80");
//		query.addEntity(Worker.class);
//		List<Worker> workers = query.list();
//		for(Object o:workers)
//		{
//			System.out.println(o);
//		}
		
		
		session.getTransaction().commit();

	}

}
