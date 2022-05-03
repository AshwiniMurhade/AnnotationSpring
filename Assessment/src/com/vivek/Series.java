package com.vivek;

import java.util.Scanner;

public class Series {
	public static void series(int x, int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.pow(x, i);
		}
		System.out.println("Sum of powers is: "+sum);
	}
	public static void series(int p) {
		for(int i = 1; i < p; i++) {
			System.out.print((int)(Math.pow(i, 3)-1) + " ");
		}
		System.out.println();
	}
	public static void series() {
		float sum = 0;
		for(int j=2; j<=10; j++) {
			sum += (1/(float)j);
		}
		System.out.println("Sum is: "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Sum of powers");
		series(x,n);
		int p = sc.nextInt();
		System.out.println("Series");
		series(p);
		System.out.println("Sum of ratios");
		series();
	}

}
