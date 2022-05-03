package com.vivek;

import java.io.IOException;

public class MaxOccurence {
	final static int MAX = 128;
	public static char maxOccuringChar(String str) {
		int[] arr = new int[MAX];
		int len = str.length();
		for(int i = 0; i < len; i++) {
			arr[str.charAt(i)]++;
		}
		char ch = 0;
		int max = -1;
		for(int i = 0; i < len; i++) {
			if(arr[str.charAt(i)]>max) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		return ch;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String s = "ssyyt";
		System.out.println(maxOccuringChar(s));
	}

}
