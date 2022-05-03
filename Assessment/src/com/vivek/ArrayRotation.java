package com.vivek;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5,6,7};           //3 4 5 6 7 1 2
		int n = ar.length;
		int r = 2;
		int ar1[] = new int[r];
		int ar2[] = new int[n-r];
		for(int i = 0; i < r; i++ ) {
			ar1[i] = ar[i];
		}
		//ar1 = 1 2 
		for(int i = 0; i < n-r; i++) {
			ar2[i] = ar[i+r];
		}
		// ar2 = 3 4 5 6 7
		for(int i = 0; i < n-r; i++) {
			ar[i] = ar2[i];
		}
		// ar = 3 4 5 6 7 6 7
		for(int i = 0; i < r; i++) {
			ar[i + (n-r)] = ar1[i];
		}
		// ar = 3 4 5 6 7 1 2
		for(int i : ar) {
			System.out.print(i + " ");
		}
	}

}
