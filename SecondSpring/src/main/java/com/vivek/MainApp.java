package com.vivek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext ct;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ct = new ClassPathXmlApplicationContext("spring.xml");
		Student s = (Student) ct.getBean("stuobj");
		s.display();
		Student s1 = (Student) ct.getBean("stuobj1");
		s1.display();
	}

}
