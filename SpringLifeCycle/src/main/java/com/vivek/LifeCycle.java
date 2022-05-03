package com.vivek;

public class LifeCycle {
	public LifeCycle() {
		System.out.println("No args constructor");
	}
	public void init() {
		System.out.println("Inside init");
	}
	public void destroy() {
		System.out.println("Destroy method called");
	}
	public void display() {
		System.out.println("Inside display method");
	}
}
