package com.hibernate1;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AppHQL {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate_hql.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		//To enter the record in the databse table
//		Random r = new Random();
//		
//		for(int i=0;i<50;i++)
//		{
//			Worker w = new Worker();
//			w.setWid(i);
//			w.setName("Name"+ i);
//			w.setNumber(r.nextInt(100));
//			session.save(w);
//		}
		//To fetch all the record using query
		//Query q = session.createQuery("from Worker");
		
		//To fetch specific record
		//Query q = session.createQuery("from Worker where number > 50");
		
		//To fetch uique record
//		Query q = session.createQuery("from Worker where wid = 10");
//		Worker workers = (Worker) q.uniqueResult();
//		System.out.println(workers);
		
		//To fetch the data using specifying column name
		
//		Query q = session.createQuery("select wid,name,number from Worker where wid = 10");
//		Object[] worker = (Object[]) q.uniqueResult();
		
		//using enhance for loop
//		for(Object o : worker)
//		{
//			System.out.println(o);
//		}
		//another way
		//System.out.println(worker[0]+" : "+worker[1]+" : "+worker[2]);
		
		//To fetch all the record of table
//		Query q = session.createQuery("select wid,name,number from Worker");
//		List<Object[]> workers = (List<Object[]>) q.list();
//		
//		for(Object[] worker : workers)
//		{
//			System.out.println(worker[0]+" : "+worker[1]+" : "+worker[2]);
//		}
		
		//to fetch the values of all the record
		//List<Worker> workers = q.list();
		
//		for(Worker w : workers)
//		{
//			System.out.println(w);
//		}
		
		//If we have more than one table and all have same column name then
//		Query q = session.createQuery("select wid,name,number from Worker w where w.number>80");
//		List<Object[]> workers = (List<Object[]>) q.list();
//		
//		for(Object[] worker : workers)
//		{
//			System.out.println(worker[0]+" : "+worker[1]+" : "+worker[2]);
//		}
		
		//To fetch only one result
		//Query q = session.createQuery("select sum(number) from Worker w where w.number>80");
		int b = 80;
		//: b is act as a positional parameter
		Query q = session.createQuery("select sum(number) from Worker w where w.number> :b");
		q.setParameter("b", b);
		Long marks = (Long) q.uniqueResult();
		
		System.out.println(marks);
		
		
		
		session.getTransaction().commit();

	}

}
