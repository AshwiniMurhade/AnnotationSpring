package com.vivek;

public class TechNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1000; i<10000; i++) {
			String str = String.valueOf(i);
			int fp = Integer.parseInt(str.substring(0, 2));
			int sp = Integer.parseInt(str.substring(2));
			int s = fp+sp;
			if(s*s == i)
				System.out.println(i);
		}
	}

}
