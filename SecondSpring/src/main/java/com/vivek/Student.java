package com.vivek;

public class Student {
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void display() {
		System.out.println("Your id: "+this.id);
		System.out.println("Good Morning "+this.name);
		System.out.println("Marks: " +marks);
	}
	
}
