package com.vivek;

import java.util.function.Function;
import java.util.function.Predicate;

interface LambdaAdd{
	int add(int a, int b);
}
public class LambdaAddEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaAdd la = (a,b) -> (a+b);
		System.out.println("Sum is: " +la.add(21, 32));
		
		Predicate<Integer> pd = (i) -> i>=18;
		System.out.println("Can Ram buy alcohol? "+pd.test(18));
		
		Function<String, Integer> fn = (s) -> s.length();
		String str = "Vivek Kumar";
		System.out.println("Length of "+str+" = "+fn.apply(str));
		
	}

}
