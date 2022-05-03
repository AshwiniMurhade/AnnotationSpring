package com.vivek;

import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class FindMissing {
	static int findMissing(int[] a) {
		TreeSet<Integer> ts= new TreeSet<Integer>();
		for(int i : a)
			ts.add(i);
		Stack<Integer> s = new Stack<Integer>();
		Iterator<Integer> itr = ts.iterator();
		int x = -1;
		s.push(ts.first());
		itr.next();
		while(itr.hasNext()) {
			int n = itr.next();
			
			if(s.peek()==n-1)
				s.push(n);
			else {
				x=n-1;
				break;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {33,38,37,36,39,34,40};
		int x = findMissing(a);
		System.out.println(x);
	}

}
