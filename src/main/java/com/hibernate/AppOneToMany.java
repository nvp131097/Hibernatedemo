package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppOneToMany {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.setSubid(101);
		subject.setSubname("Maths");
		
		
		Teacher teacher = new Teacher();
		teacher.setTid(1);
		teacher.setTname("Dimple");
		teacher.setTaddress("Ottawa");
		teacher.getSubject().add(subject);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.save(subject);
		session.save(teacher);
		session.beginTransaction();
		
		
		
		session.getTransaction().commit();


	}

}
