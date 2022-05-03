package com.vivek;

public class Student {
	private int id;
	private String name;
	private int fees;
	public Student() {
		this.id = 7;
		this.name = "Cristiano";
		this.fees = 50000;
	}
	public Student(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public void display() {
		System.out.println("Your id: "+id);
		System.out.println("Your name: "+name);
		System.out.println("Your fees: "+fees);
	}
}
