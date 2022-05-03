package com.vivek;

class Punctuation{
	public int countPunctuation(String str) {
		int c = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='.' || ch=='?' || ch=='!' || ch==',' || ch==';') {
				c++;
			}
		}
		return c;
	}
}

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punctuation p = new Punctuation();
		String s = "what is your name? my name is steve.";
		System.out.println(p.countPunctuation(s));
	}

}
