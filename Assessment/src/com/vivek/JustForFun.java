package com.vivek;

import java.util.HashMap;
import java.util.Map;

public class JustForFun {
	
	public static void findFrequency(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) 
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			else
				hm.put(str.charAt(i), 1);
		}
		for(Map.Entry<Character, Integer> m : hm.entrySet()) {
			if(m.getValue()>1)
				System.out.println(m.getKey()+"->"+m.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Javaisthebestprogramminglanguage";
		findFrequency(s);
	}

}
