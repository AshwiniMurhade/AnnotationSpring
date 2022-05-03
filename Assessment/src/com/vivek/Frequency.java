package com.vivek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frequency {
	void check(String s, char ch) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Frequency of "+ch +" is " +count);
	}
	void check(String s) {
		String s1 = s.toLowerCase();
		int count = 0;
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
				System.out.print(ch + " ");
				System.out.println();
			}
		}
		System.out.println("Frequency of vowels is " +count);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Frequency f = new Frequency();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = br.readLine();
		f.check(s);
		char ch = br.readLine().charAt(0);
		f.check(s, ch);
	}

}
