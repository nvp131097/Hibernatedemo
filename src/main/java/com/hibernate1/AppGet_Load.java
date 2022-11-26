package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class AppGet_Load {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate_hql.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Desktop des = session.get(Desktop.class, 6);
		//System.out.println(des);
		
		session.getTransaction().commit();

	}

}
