package com.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class StoreData {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	
	Transaction t=session.beginTransaction();
	
	 Customer emp=new Customer();
	emp.setC_name("virat");
	emp.setC_company("BCCI");
    emp.setC_city("New Delhi");
    emp.setC_phone("12345456");
    
   // session.persist(emp);
   // t.commit();
    Customer obj= session.find(Customer.class, 1);
   System.out.println(obj.getId()+" "+obj.getC_name()+" "+obj.getC_company()+" "+obj.getC_city());
   obj.setC_name("Dhoni");
   obj.setC_company("BCCI");
   obj.setC_city("Ranchi");
   
     session.persist(obj);
  // session.remove(obj);
    t.commit();
   
    System.out.println("Done");
    session.close();
}
}
