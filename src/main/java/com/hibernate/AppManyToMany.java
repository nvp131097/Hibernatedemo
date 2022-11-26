package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppManyToMany {

	public static void main(String[] args) {
		Book book = new Book();
		book.setBid(101);
		book.setBname("Science");
		
		
		Persons person = new Persons();
		person.setPid(1);
		person.setPname("Pruthvi");
		person.setNumber("100");
		
		person.getBook().add(book);
		book.getPersons().add(person);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.save(person);
		session.save(book);
		session.beginTransaction();
		
		
		
		session.getTransaction().commit();

	}

}
