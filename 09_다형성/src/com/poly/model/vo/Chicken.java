package com.poly.model.vo;

public class Chicken extends Animal {
	//강제한 메소드를 만들어야한다.
	@Override
	public void bark() {
		System.out.println("꼬끼오!");
	}
}
