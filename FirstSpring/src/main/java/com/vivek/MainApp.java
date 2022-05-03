package com.vivek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext ct;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ct = new ClassPathXmlApplicationContext("spring.xml");
		Student s = (Student) ct.getBean("stuobj");
		Student s1 = (Student) ct.getBean("stuobj");
		s.display();
		s1.display();
		System.out.println("S: "+s);
		System.out.println("S1: "+s1);
	}

}
