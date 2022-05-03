package com.vivek;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	@Autowired
	private Heart heart;

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void func() {
		System.out.println("Human");
		heart.pump();
	}
}
