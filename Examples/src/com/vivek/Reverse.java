package com.vivek;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 200;
		int res = 0, rem;
		while(num>0) {
			rem = num%10;
			res = res*10+rem;
			System.out.print(res);
			num /=10;
		}
		
	}

}
