package com.vivek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		String[] arr = str.split(" ");
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].charAt(0) == 'A') {
				count++;
			}
		}
		System.out.println("Total words: " +count);
	}

}
