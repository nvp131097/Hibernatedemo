package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args)
	{
		AlienName aname = new AlienName();
		aname.setFname("Aku");
		aname.setLname("Patel");
		aname.setMname("Tushar");
		
		
		Alien alian = new Alien();
		alian.setAid(103);
		alian.setColor("Blue");
		alian.setAname(aname);
		
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(alian);
		
		//to fetch data
		//alian = session.get(Alien.class, 102);
		
		tx.commit();
		
		System.out.println(alian);
		

	}

}
