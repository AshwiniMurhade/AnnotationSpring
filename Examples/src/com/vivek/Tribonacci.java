
package com.vivek;

public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		for(int i : arr)
			System.out.println(i);
	}

}
