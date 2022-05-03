package com.vivek;

public class Employee {
	private int id;
	private String name;
	private float salary;
	public Employee() {
		this.id = 1;
		this.name = "John";
		this.salary = 10000;
	}
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void display() {
		System.out.println("Employee id: "+id);
		System.out.println("Employeee name: "+name);
		System.out.println("Employee salary: "+salary);
	}
}
