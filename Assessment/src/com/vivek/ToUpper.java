package com.vivek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToUpper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String str = br.readLine();
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			if(i == 0 || str.charAt(i-1)==' ') {
				res += Character.toUpperCase(str.charAt(i));
			}
			else {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
	}

}
