package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class AppCache {

	public static void main(String[] args) {
		
		Alien a = null;
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session1 = factory.openSession();
		session1.beginTransaction();
		
		//with hibernate query
		Query q1 = session1.createQuery("from Alien where aid=102");
		q1.setCacheable(true);
		a=(Alien) q1.uniqueResult();
		System.out.println(a);
		//without query
//		a = (Alien)session1.get(Alien.class, 102);
//		System.out.println(a);
		
		session1.getTransaction().commit();
		session1.close();
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		
		//with hibernate query
		Query q2 = session2.createQuery("from Alien where aid=102");
		q2.setCacheable(true);
		a=(Alien) q2.uniqueResult();
		System.out.println(a);
		//without query
//		a = (Alien)session2.get(Alien.class, 102);
//		System.out.println(a);
		
		session2.getTransaction().commit();
		session2.close();
	}

}

