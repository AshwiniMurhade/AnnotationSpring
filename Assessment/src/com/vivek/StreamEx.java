package com.vivek;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(11,25,32,45,50,68,90);
		 System.out.println(list.stream().filter(i->i%5==0).reduce(0,Integer::sum));
		
//		list.forEach(StreamEx::square);
		
//		System.out.println(list.stream().map(i -> i*2).reduce(0, (c,e)->c+e));
		System.out.println(list.stream().map(i -> i*2).reduce(0,Integer::sum));
		
		Consumer<Integer> c = i -> System.out.println(i);
		
		c.accept(100);
	}
//	public static void square(int i) {
//		System.out.println(i*i);
//	}
}
