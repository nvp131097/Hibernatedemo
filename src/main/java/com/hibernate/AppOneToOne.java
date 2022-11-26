package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppOneToOne {

	public static void main(String[] args) {
		Laptop1 laptop = new Laptop1();
		laptop.setLid(101);
		laptop.setLname("HP");
		
		
		Student1 student = new Student1();
		student.setRollno(1);
		student.setName("Rahul");
		student.setMark(80);
		student.setLaptop1(laptop);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(student);
		
		session.getTransaction().commit();

	}

}
