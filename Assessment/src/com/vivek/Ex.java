package com.vivek;

import com.snehal.Snehal;

class Snehu{
int id;
private String name;
protected int age;
public String address;
public Snehu() {
	super();
}
public Snehu(int id, String name) {
	this.id = id;
	this.name = name;
}
public Snehu(int id, String name, int age, String address) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.address = address;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
public class Ex{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snehu s = new Snehu();
		System.out.println(s.getName());
		
		Snehu s1 = new Snehu(1,"Snehal");
		System.out.println(s1.getName());
		
		Snehu s2 = new Snehu(2, "Snehu", 22, "Akola");
		System.out.println("My id: "+s2.id);
		System.out.println("My name: "+s2.getName());
		
		Snehu s3 = new Snehu(3, "Vivek", 27, "Patna");
		System.out.println("My id: "+s3.id);
		System.out.println("My name: "+s3.getName());
		
	}

}
