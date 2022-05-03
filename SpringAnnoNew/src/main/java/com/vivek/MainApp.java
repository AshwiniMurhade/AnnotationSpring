package com.vivek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College c = (College) ctx.getBean(College.class);
		c.test();
		Integer i = 8;
		int j = 0;
		j = i;
		System.out.println(j);
	}

}
