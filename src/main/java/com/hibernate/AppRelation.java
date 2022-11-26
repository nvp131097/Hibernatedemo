package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppRelation {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("HP");
		
		
		Student student = new Student();
		student.setRollno(1);
		student.setName("Rahul");
		student.setMark(80);
		
		//for OneToOne
		//student.setLaptop(laptop);
		
		//for OneToMany
		student.getLaptop().add(laptop);
		laptop.getStudent().add(student);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(student);
		
		session.getTransaction().commit();
		
		}

}
