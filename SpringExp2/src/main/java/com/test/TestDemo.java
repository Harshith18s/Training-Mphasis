package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		 Employee obj=ctx.getBean("emp", Employee.class);
		 System.out.println(obj);

	}

}
