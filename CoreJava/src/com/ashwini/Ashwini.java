package com.ashwini;

public class Ashwini {
	int id;
	protected String name;
	public int age;
	private String location;
	void show() {
		System.out.println("Inside show");
	}
	static void display() {
		System.out.println("Inside display");
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
