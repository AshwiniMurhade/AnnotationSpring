package com.vivek;

public class Human {
	private Heart heart;

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void func() {
		System.out.println("From Human");
		heart.pump();
	}
}
