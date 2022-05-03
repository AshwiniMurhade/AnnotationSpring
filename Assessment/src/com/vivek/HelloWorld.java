package com.vivek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Credentials{
	String userName;
	String password;
	public Credentials(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

class Implementation{
	public String passwordValidator(Credentials details) throws Exception{
		Pattern pattern = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,40})");
		Matcher matcher = pattern.matcher(details.getPassword());
		try {
			if(details.getPassword().length()<8 || details.getPassword().length()>40) {
				throw new LengthMisMatchException("length of the password is not between 8 to 40");
			}
			else if(!matcher.matches()){
				throw new MissingCharacterException("password must contain at least one special character, "
						+ "at least one upper case alpahbet, at least one lower case alphabet, and at leats one digit");
			}
			else
				return "valid password";
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String signUp(Credentials details) throws Exception  {
		String s = passwordValidator(details);
		try {
			if(s.equals("valid password")) {
				return "signup successfully";
			}
			else if(s.equals("length of the password is not between 8 to 40")){
				throw new LengthMisMatchException("length of the password is not between 8 to 40");
			}
			else if(s.equals("password must contain at least one special character, "
						+ "at least one upper case alpahbet, at least one lower case alphabet, and at leats one digit")) {
				throw new MissingCharacterException("password must contain at least one special character, "
						+ "at least one upper case alpahbet, at least one lower case alphabet, and at leats one digit");
			}
			else {
				return "other exception";
			}
		}
		catch(Exception e) {
			return "invalid password";
		}
		
		
	}
}

class MissingCharacterException extends Exception{
	public MissingCharacterException(String s) {
		super(s);
	}
}

class LengthMisMatchException extends Exception{
	public LengthMisMatchException(String s) {
		super(s);
	}
}

public class HelloWorld {
	public static void main(String[] args) throws Exception {
		Implementation obj = new Implementation();
		System.out.println(obj.passwordValidator(new Credentials("Steve", "Akjsdhhj@1")));
		System.out.println(obj.signUp(new Credentials("Bob", "jsdhJK12*&$1")));
	}

}
