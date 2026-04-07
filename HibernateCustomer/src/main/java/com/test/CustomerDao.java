 package com.test;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class CustomerDao {
public static void main(String[] args) {
	
	//Configuration cfg=new Configuration();
	//cfg.configure("hibernate.cfg.xml");
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	
	Transaction t=session.beginTransaction();
	
	 Customer emp=new Customer();
	emp.setC_name("virat");
	emp.setC_company("BCCI");
    emp.setC_city("New Delhi");
    emp.setC_phone("12345456");
    
  session.persist(emp);
  t.commit();
  List<Customer> list=session.createQuery("from Customer",Customer.class).list();
  list.forEach(dt -> System.out.println(dt.getId()+" "+dt.getC_name()+" "+dt.getC_company()+" "+dt.getC_city()+" "+dt.getC_phone()+""));
//    Customer obj= session.find(Customer.class, 1);
//   System.out.println(obj.getId()+" "+obj.getC_name()+" "+obj.getC_company()+" "+obj.getC_city());
//   obj.setC_name("Dhoni");
//   obj.setC_company("BCCI");
//   obj.setC_city("Ranchi");
   
     //session.persist(obj);
  // session.remove(obj);
   // t.commit();
   
    System.out.println("Done");
    session.close();
}
}
