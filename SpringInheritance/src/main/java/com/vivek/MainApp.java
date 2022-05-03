package com.vivek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld hw = (HelloWorld) ctx.getBean("hw");
		hw.getMessage1();
		hw.getMessage2();
		
		HelloIndia hi = (HelloIndia) ctx.getBean("hi");
		hi.getMessage1();
		hi.getMessage2();
		hi.getMessage3();
	}

}
