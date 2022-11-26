package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate1.Desktop;

public class CriteriaEx {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate_hql.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Criteria c =session.createCriteria(Desktop.class);
		List<Desktop> desktops = c.list();
		for(Desktop d:desktops)
		{
			System.out.println(d);
		}
		
		session.close();
	}

}
