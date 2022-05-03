package com.vivek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = s.split(" ");
		TreeSet<String> set = new TreeSet<String>();
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		String res = "";
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext()) { 
			String temp = itr.next();
			char ch = temp.charAt(0);
			
			res += temp.replace(ch, Character.toUpperCase(ch)) + " ";
		}
		System.out.println(res);
	}

}
