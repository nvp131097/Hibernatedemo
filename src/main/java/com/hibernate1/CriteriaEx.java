package com.hibernate1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class CriteriaEx {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate_hql.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Criteria c =session.createCriteria(Desktop.class);
		
//		c.add(Restrictions.eq("price", 10000));
		
		//c.add(Restrictions.gt("did", 5));
		//c.add(Restrictions.lt("did", 5));
		c.add(Restrictions.like("brand", "Apple"));
		
		List<Desktop> desktops = c.list();
		for(Desktop d:desktops)
		{
			System.out.println(d);
		}
		
		session.close();
	}

}
