package com.vivek;

import java.util.ArrayList;

interface Lambda{
	String draw(String s);
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda l = s ->{ 
			System.out.println("Inside draw method");
			return "Hello " + s; 
		};
		System.out.println(l.draw("Circle"));
		System.out.println(l.draw("Rectangle"));
		
		
		//Iterating over list
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vivek");
		al.add("Kumar");
		al.add("Vishal");
//		al.forEach(v -> System.out.println(v));		
		al.forEach(System.out::println);
		
		
		//implementing runnable
		Runnable r = () -> {
			System.out.println("Inside run");
		};
		Thread t = new Thread(r);
		t.start();
	}

}
