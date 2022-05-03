package com.ashwini;


public class Conditions {

	public static void main(String[] args) {
		
		
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <=i; k++) {
				if(i==3 && k==2 || (i==5 && (k==2 ||k==3||k==4))) {
					System.out.print("  ");
				}
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}

}

