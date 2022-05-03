package com.vivek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("spring.xml");
		Employee e1 = (Employee) ctx.getBean("empobj");
		e1.display();
		Employee e2 = (Employee) ctx.getBean("empobj1");
		System.out.println(e2);
	}

}
