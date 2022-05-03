package com.ashwini;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student(String name) {
		this.name = name;
	}

	public Student() {
		super();
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class Constructors {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(10, "Ashwini");
		Student s3 = new Student(11,"Murhade");
		Student s2 = new Student("Vivek");
		Student s1 = new Student();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.id);
		System.out.println(s.name);
	}

}
