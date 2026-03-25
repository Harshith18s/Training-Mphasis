package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Movie mobj = new Movie();
		
		mobj.setM_name("Dhurandar");
		mobj.setM_location("India");
		
		Movie_2D mt = new Movie_2D();
		
		mt.setM_name("KGF");
		mt.setCasting("MLA");
		
		Movie_8D md = new Movie_8D();
		
		md.setM_name("Love Mocktail-3");
		md.setDirector("Krishna");
		
		session.persist(mobj);
		session.persist(mt);
		session.persist(md);
		
		t.commit();
		
		System.out.println("Relax");
		
		session.close();
	}

}
