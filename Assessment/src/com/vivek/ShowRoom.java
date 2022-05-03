package com.vivek;

import java.util.Scanner;

public class ShowRoom {

	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	public ShowRoom(){
		this.name = null;
		this.mobno = 0;
		this.cost = 0;
		this.dis = 0;
		this.amount = 0;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name");
		String name = sc.nextLine();
		System.out.println("Enetr customer number");
		long num = sc.nextLong();
		System.out.println("Enter cost");
		double cost = sc.nextDouble();
		sc.close();
		this.name = name;
		this.mobno = num;
		this.cost = cost;
	}

	void calculate() {
		if(this.cost<=10000) {
			this.dis = this.cost*5/100;
			this.amount = this.cost - this.dis;
		}
		else if(this.cost>10000 && this.cost<=20000) {
			this.dis = this.cost*10/100;
			this.amount = this.cost - this.dis;
		}
		else if(this.cost>20000 && this.cost<=35000) {
			this.dis = this.cost*15/100;
			this.amount = this.cost - this.dis;
		}
		else {
			this.dis = this.cost*20/100;
			this.amount = this.cost - this.dis;
		}
	}
	void display() {
		System.out.println("Customer name: "+this.name);
		System.out.println("Mobile number: "+this.mobno);
		System.out.println("Amount to be paid: "+this.amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom sr = new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();
	}

}
