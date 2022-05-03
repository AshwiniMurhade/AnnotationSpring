package com.vivek;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	public void display() {
		System.out.println("I'm your principal");
		System.out.println("My name is Felix");
	}
}
