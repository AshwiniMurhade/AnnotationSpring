package com.vivek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = "vivek.cool-guy25@hotmail.com";
		String str = "[a-zA-Z0-9_-[.]]+[@][a-z]+[.][a-z]{2,3}";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(mail);
		if(m.matches())
			System.out.println("Matching");
		else
			System.out.println("Not matching");
		
		String pass = "Vivek1@22";
		String str1 = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,40})";
		Pattern p1 = Pattern.compile(str1);
		Matcher m1 = p1.matcher(pass);
		if(m1.matches())
			System.out.println("Matching");
		else
			System.out.println("Not matching");
	}

}
