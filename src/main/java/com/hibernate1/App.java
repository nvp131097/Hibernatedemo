package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate_hql.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		//in hibernate new mwans it is in transiant state
		Desktop l = new Desktop();
		l.setDid(9);
		l.setBrand("Lenovo");
		l.setPrice(35000);
		
		//now data goes into persistance state and data store in databse
		session.save(l);
		l.setPrice(30000);
		
		//session.remove(l);
		session.getTransaction().commit();
		
		//Detech() it will not update in databse
		//after detach what ever changes is does not matter
		session.detach(l);
		l.setPrice(25000);

	}

}
