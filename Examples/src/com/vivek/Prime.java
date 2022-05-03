package com.vivek;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 87;
		int n = (int) Math.sqrt(num);
		int i;
		for(i = 2; i <= n; i++) {
			if(num%i==0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if(i>n)
			System.out.println("Prime");
	}

}
