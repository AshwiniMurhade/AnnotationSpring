package com.vivek;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 11;
		int count = 0;
		for(int i = 2; i < age/2; i++) {
			if(age%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
