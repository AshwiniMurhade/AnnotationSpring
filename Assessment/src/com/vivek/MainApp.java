package com.vivek;



class A{
	int i;
	String s;
	
	public static void display() {
		System.out.println("Display");
	}
	public void m1() {
		System.out.println("m1");
	}
}


public class MainApp extends A{
	int a;
	public MainApp(int a) {
		super();
		this.a = a;
	}
	public static void main(String[] args) {
		MainApp m = new MainApp(10);
		
	}

}
